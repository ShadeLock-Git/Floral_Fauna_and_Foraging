
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.florafaunaandforaging.item.PruningShearsItem;
import net.mcreator.florafaunaandforaging.item.HeavensDewdropBulbItem;
import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Item> FIRETONGUE = block(FloraFaunaAndForagingModBlocks.FIRETONGUE);
	public static final RegistryObject<Item> HEAVENS_DEWDROP = block(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP);
	public static final RegistryObject<Item> PRUNING_SHEARS = REGISTRY.register("pruning_shears", () -> new PruningShearsItem());
	public static final RegistryObject<Item> HEAVENS_DEWDROP_BULBLESS = block(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS);
	public static final RegistryObject<Item> HEAVENS_DEWDROP_BULB = REGISTRY.register("heavens_dewdrop_bulb", () -> new HeavensDewdropBulbItem());
	public static final RegistryObject<Item> HEAVENS_DEWDROPGROW_3 = block(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROPGROW_3);
	public static final RegistryObject<Item> HEAVENS_DEW_DROPGROWTH_2 = block(FloraFaunaAndForagingModBlocks.HEAVENS_DEW_DROPGROWTH_2);
	public static final RegistryObject<Item> HEAVENSDEWDROPGROWTH_1 = block(FloraFaunaAndForagingModBlocks.HEAVENSDEWDROPGROWTH_1);
	public static final RegistryObject<Item> WILTING_NIGHTSHADE = block(FloraFaunaAndForagingModBlocks.WILTING_NIGHTSHADE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
