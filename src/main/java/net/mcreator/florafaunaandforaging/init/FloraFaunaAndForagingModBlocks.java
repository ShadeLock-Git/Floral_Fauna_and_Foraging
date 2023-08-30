
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.florafaunaandforaging.block.Heavensdewdropgrowth1Block;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropgrow3Block;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropBulblessBlock;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropBlock;
import net.mcreator.florafaunaandforaging.block.HeavensDewDropgrowth2Block;
import net.mcreator.florafaunaandforaging.block.FiretongueBlock;
import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Block> FIRETONGUE = REGISTRY.register("firetongue", () -> new FiretongueBlock());
	public static final RegistryObject<Block> HEAVENS_DEWDROP = REGISTRY.register("heavens_dewdrop", () -> new HeavensDewdropBlock());
	public static final RegistryObject<Block> HEAVENS_DEWDROP_BULBLESS = REGISTRY.register("heavens_dewdrop_bulbless", () -> new HeavensDewdropBulblessBlock());
	public static final RegistryObject<Block> HEAVENS_DEWDROPGROW_3 = REGISTRY.register("heavens_dewdropgrow_3", () -> new HeavensDewdropgrow3Block());
	public static final RegistryObject<Block> HEAVENS_DEW_DROPGROWTH_2 = REGISTRY.register("heavens_dew_dropgrowth_2", () -> new HeavensDewDropgrowth2Block());
	public static final RegistryObject<Block> HEAVENSDEWDROPGROWTH_1 = REGISTRY.register("heavensdewdropgrowth_1", () -> new Heavensdewdropgrowth1Block());
}
