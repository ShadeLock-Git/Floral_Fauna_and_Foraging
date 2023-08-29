package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.florafaunaandforaging.network.FloraFaunaAndForagingModVariables;

public class FiretongueAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double SuccessCount = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:base_stone_overworld"))) && y < 40) {
			FloraFaunaAndForagingModVariables.MapVariables.get(world).FiretongueSpawnCount = FloraFaunaAndForagingModVariables.MapVariables.get(world).FiretongueSpawnCount + 1;
			FloraFaunaAndForagingModVariables.MapVariables.get(world).syncData(world);
			return true;
		}
		return false;
	}
}
