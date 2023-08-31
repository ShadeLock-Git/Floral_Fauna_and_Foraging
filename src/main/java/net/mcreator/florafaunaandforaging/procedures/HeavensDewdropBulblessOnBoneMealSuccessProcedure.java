package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.florafaunaandforaging.init.FloraFaunaAndForagingModBlocks;

public class HeavensDewdropBulblessOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP.get().defaultBlockState(), 3);
	}
}
