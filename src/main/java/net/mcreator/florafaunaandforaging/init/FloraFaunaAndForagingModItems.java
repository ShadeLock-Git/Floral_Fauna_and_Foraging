
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.florafaunaandforaging.item.SoilViewerItem;
import net.mcreator.florafaunaandforaging.item.PruningShearsItem;
import net.mcreator.florafaunaandforaging.item.HeavensDewdropBulbItem;
import net.mcreator.florafaunaandforaging.item.FiretonguePetalsItem;
import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Item> FIRETONGUE = block(FloraFaunaAndForagingModBlocks.FIRETONGUE);
	public static final RegistryObject<Item> HEAVENS_DEWDROP = block(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP);
	public static final RegistryObject<Item> PRUNING_SHEARS = REGISTRY.register("pruning_shears", () -> new PruningShearsItem());
	public static final RegistryObject<Item> HEAVENS_DEWDROP_BULBLESS = block(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS);
	public static final RegistryObject<Item> HEAVENS_DEWDROP_BULB = REGISTRY.register("heavens_dewdrop_bulb", () -> new HeavensDewdropBulbItem());
	public static final RegistryObject<Item> HEDGEHOG_SPAWN_EGG = REGISTRY.register("hedgehog_spawn_egg", () -> new ForgeSpawnEggItem(FloraFaunaAndForagingModEntities.HEDGEHOG, -12309760, -3622747, new Item.Properties()));
	public static final RegistryObject<Item> SOIL_VIEWER = REGISTRY.register("soil_viewer", () -> new SoilViewerItem());
	public static final RegistryObject<Item> FIRETONGUE_PETALS = REGISTRY.register("firetongue_petals", () -> new FiretonguePetalsItem());
	public static final RegistryObject<Item> SOIL = block(FloraFaunaAndForagingModBlocks.SOIL);
	public static final RegistryObject<Item> FIRETONGUE_GROWING = block(FloraFaunaAndForagingModBlocks.FIRETONGUE_GROWING);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
