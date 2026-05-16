# Plants amore

## Setup

For setup instructions, please see the [Fabric Documentation page](https://docs.fabricmc.net/develop/getting-started/creating-a-project#setting-up) related to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.

## How to add a new flower (detailed guide)

Checklist
- Create a Block class (place logic for placement / survival)
- Create a BlockItem (custom placement on fluids when needed)
- If the block is rendered as an entity: create a BlockEntity or use the provided `GenericPlantBlockEntity`
- Create a Model class (ModelPart tree + LayerDefinition)
- Add textures: entity texture and item texture(s)
- Add item/block JSON resources (item model, blockstate if required)
- Register the Block and BlockEntity in `ModBlocks` and `ModBlockEntities`
- Register the model layer and BlockEntityRenderer in `RainbowTulipModClient`
- Test in-game and iterate (watch for z-fighting and tinting)

Overview — what each part does

- Block (eg. `WaterPoppiesBlock`, `DragonScalesBlock`)
  - Holds placement and survival rules (canSurvive, updateShape).
  - Controls collision shape (getShape) and rendering type (getRenderShape).
  - If it is a tile/block entity backed block, it should extend `BaseEntityBlock` and implement `newBlockEntity`.

- BlockItem (eg. `WaterPoppiesBlockItem`, `DragonScalesBlockItem`)
  - Handles how the player places the block.
  - For water-surface plants you often need to re-run a ray-trace including fluids and place the block one block above the water source (see `use()` in `DragonScalesBlockItem`).

- BlockEntity (eg. `GenericPlantBlockEntity` / `DragonScalesBlockEntity`)
  - Optional storage/identity for animated or complex model rendering.
  - If you don't need persistent data, you can use the provided `GenericPlantBlockEntity` to keep rendering consistent.

- Model class (eg. `WaterSnowflakesModel`, `DragonScalesModel`)
  - Builds a ModelPart tree with `MeshDefinition` and `PartDefinition` using `CubeListBuilder` and `PartPose`.
  - Provide a public static `createBodyLayer()` that returns a `LayerDefinition` with integer texture sizes.
  - Split the model into logical groups (e.g. `flowers`, `leavesAndStems`) to allow selective biome tinting.
  - Important: avoid adding empty container parts (empty bones) that contain no faces — they can cause depth z-fighting in certain renderers.

- BlockEntityRenderer (eg. `WaterSnowflakesBlockEntityRenderer`)
  - Extends your project's renderer base (here `AbstractPlantBlockEntityRenderer`) to handle transforms, scaling and retrieving biome tint colors.
  - Call `ctx.bakeLayer(ModelClass.LAYER_LOCATION)` to create the model instance.
  - Use a method like `model.renderWithBiomeTint(...)` to pass both lighting and biome color.

- Client initialization (`RainbowTulipModClient`)
  - Register your `ModelLayerLocation` via `EntityModelLayerRegistry.registerModelLayer(...)` using the same ResourceLocation string the model expects.
  - Register your BlockEntityRenderer via `BlockEntityRendererRegistry.register(...)` using the BlockEntityType from `ModBlockEntities`.

- Registration (`ModBlocks`, `ModBlockEntities`)
  - `ModBlocks.register(name, block)` should register both the block and its BlockItem. If the block implements `BlockItemProvider`, the custom item is used.
  - Keep registry keys consistent. Do NOT include file extensions (like `.json`) in registry names — use plain names such as `dragon_scales`.

Model / rendering gotchas (common pitfalls)

- Z-fighting / color vibration
  - Occurs when multiple polygons occupy effectively the same depth. It is especially visible if parts are rendered with different colors (tinted vs untinted).
  - Fixes: remove empty parent parts exported from Blockbench; add tiny depth offsets between overlapping parts; simplify geometry to debug layering.

- Large Y offsets from Blockbench
  - Blockbench often exports models with large offsets (eg. +24.5). Compensate in your renderer using translation parameters or in the model's PartPose offsets.

- Biome tinting
  - Use separate ModelPart groups for parts that must be tinted and parts that must remain untinted (flowers vs leaves).
  - Use ModelPart.render(PoseStack, VertexConsumer, packedLight, packedOverlay, color) to pass an ARGB color. Build the ARGB tint with `int tint = 0xFF000000 | (biomeColor & 0xFFFFFF);`.

- Texture sizes
  - `LayerDefinition.create(meshdefinition, texWidth, texHeight)` requires integer texture sizes — do not pass floats.

Step-by-step example (add "my_flower")

1) Create `MyFlowerBlock.java`
   - Extend `BaseEntityBlock` (or appropriate base) and implement placement rules. If it sits on water, implement `canSurvive` to check `level.getFluidState(pos.below()).isSource()`.
   - Return `RenderShape.ENTITYBLOCK_ANIMATED` if you render with a BlockEntityRenderer.

2) Create `MyFlowerBlockItem.java` if you need custom placement (raycast including fluids). Copy the `DragonScalesBlockItem.use()` pattern for water placement.

3) Add or reuse a BlockEntity (use `GenericPlantBlockEntity` if you don't need custom data). Ensure `newBlockEntity` in the Block returns an instance.

4) Create `MyFlowerModel.java`
   - Define `public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rainbowtulip","my_flower"), "main");`
   - Implement `createBodyLayer()` and return a `LayerDefinition.create(mesh, texWidth, texHeight)`.
   - Split into groups like `flowers` and `leaves` and provide a `renderWithBiomeTint(...)` helper.

5) Create `MyFlowerBlockEntityRenderer.java`
   - Extend `AbstractPlantBlockEntityRenderer` and pass the texture ResourceLocation (eg. `textures/entity/my_flower.png`).
   - Bake your layer in the constructor and call `model.renderWithBiomeTint(...)` in `renderPlant`.

6) Register the block + item in `ModBlocks` and the BlockEntityType in `ModBlockEntities` (use the consistent plain name `my_flower`).

7) Register the model layer and renderer in `RainbowTulipModClient`:
   - `EntityModelLayerRegistry.registerModelLayer(MyFlowerModel.LAYER_LOCATION, MyFlowerModel::createBodyLayer);
   - `BlockEntityRendererRegistry.register(ModBlockEntities.MY_FLOWER_BE, MyFlowerBlockEntityRenderer::new);`

8) Add resources:
   - `assets/rainbowtulip/textures/entity/my_flower.png`
   - `assets/rainbowtulip/models/item/my_flower.json` (point to `layer0` texture)
   - `assets/rainbowtulip/blockstates/my_flower.json` (if you need blockstates)

9) Build and test:
```
cd "<project-root>"
.\gradlew.bat build --no-daemon
```

Debugging tips
- If the flower looks wrong in-game, simplify: render only a single petal cube to confirm texture and orientation are correct, then add pieces back.
- If petals appear stretched or malformed, verify PartPose offsets/rotations and cube sizes in `createBodyLayer()` — Blockbench to code translations can invert axes or swap dimensions.
- If textures are wrong, confirm `texOffs(x,y)` align with the texture atlas size passed to `LayerDefinition.create(...)`.

If you'd like, I can:
- Scan the repository for any other inconsistent resource names (e.g. stray `.json` suffixes) and fix them.
- Add a small example `my_flower` implementation (block, model, renderer, resources) as a template file in the repo.

Happy modding — let me know which flower you want to add next and I can generate the skeleton files and resources for you.

