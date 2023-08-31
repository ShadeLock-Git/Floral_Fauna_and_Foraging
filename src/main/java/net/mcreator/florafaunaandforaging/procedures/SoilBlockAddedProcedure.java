package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.florafaunaandforaging.network.FloraFaunaAndForagingModVariables;

public class SoilBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double pHLevel = 0;
		if (y > 0) {
			pHLevel = ((y - FloraFaunaAndForagingModVariables.MapVariables.get(world).OldMin) * FloraFaunaAndForagingModVariables.MapVariables.get(world).NewRange) / FloraFaunaAndForagingModVariables.MapVariables.get(world).OldRange
					+ FloraFaunaAndForagingModVariables.MapVariables.get(world).NewMin + Mth.nextDouble(RandomSource.create(), -0.5, 0.5);
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("pHLevel", pHLevel);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("pHLevel", 0);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
