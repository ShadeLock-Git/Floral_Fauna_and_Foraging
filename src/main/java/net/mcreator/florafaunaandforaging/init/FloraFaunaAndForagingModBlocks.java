
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.florafaunaandforaging.block.FiretongueBlock;
import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Block> FIRETONGUE = REGISTRY.register("firetongue", () -> new FiretongueBlock());
}
