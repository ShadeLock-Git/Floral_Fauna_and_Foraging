
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.florafaunaandforaging.block.SoilBlock;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropBulblessBlock;
import net.mcreator.florafaunaandforaging.block.HeavensDewdropBlock;
import net.mcreator.florafaunaandforaging.block.FiretongueGrowingBlock;
import net.mcreator.florafaunaandforaging.block.FiretongueBlock;
import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Block> FIRETONGUE = REGISTRY.register("firetongue", () -> new FiretongueBlock());
	public static final RegistryObject<Block> HEAVENS_DEWDROP = REGISTRY.register("heavens_dewdrop", () -> new HeavensDewdropBlock());
	public static final RegistryObject<Block> HEAVENS_DEWDROP_BULBLESS = REGISTRY.register("heavens_dewdrop_bulbless", () -> new HeavensDewdropBulblessBlock());
	public static final RegistryObject<Block> SOIL = REGISTRY.register("soil", () -> new SoilBlock());
	public static final RegistryObject<Block> FIRETONGUE_GROWING = REGISTRY.register("firetongue_growing", () -> new FiretongueGrowingBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			SoilBlock.blockColorLoad(event);
		}
	}
}
