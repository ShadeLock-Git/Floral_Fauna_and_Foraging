
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.florafaunaandforaging.block.WiltingNightshadeBlock;
import net.mcreator.florafaunaandforaging.block.Heavensdewdropgrowth1Block;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropgrow3Block;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropBulblessBlock;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropBlock;
import net.mcreator.florafaunaandforaging.block.HeavensDewDropgrowth2Block;
import net.mcreator.florafaunaandforaging.block.FrostFloretGrowthStage4Block;
import net.mcreator.florafaunaandforaging.block.FrostFloretGrowthStage3Block;
import net.mcreator.florafaunaandforaging.block.FrostFloretGrowthStage2Block;
import net.mcreator.florafaunaandforaging.block.FrostFloretGrowthStage1Block;
import net.mcreator.florafaunaandforaging.block.FrostFloretBlock;
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
	public static final RegistryObject<Block> WILTING_NIGHTSHADE = REGISTRY.register("wilting_nightshade", () -> new WiltingNightshadeBlock());
	public static final RegistryObject<Block> FROST_FLORET = REGISTRY.register("frost_floret", () -> new FrostFloretBlock());
	public static final RegistryObject<Block> FROST_FLORET_GROWTH_STAGE_1 = REGISTRY.register("frost_floret_growth_stage_1", () -> new FrostFloretGrowthStage1Block());
	public static final RegistryObject<Block> FROST_FLORET_GROWTH_STAGE_2 = REGISTRY.register("frost_floret_growth_stage_2", () -> new FrostFloretGrowthStage2Block());
	public static final RegistryObject<Block> FROST_FLORET_GROWTH_STAGE_3 = REGISTRY.register("frost_floret_growth_stage_3", () -> new FrostFloretGrowthStage3Block());
	public static final RegistryObject<Block> FROST_FLORET_GROWTH_STAGE_4 = REGISTRY.register("frost_floret_growth_stage_4", () -> new FrostFloretGrowthStage4Block());
}
