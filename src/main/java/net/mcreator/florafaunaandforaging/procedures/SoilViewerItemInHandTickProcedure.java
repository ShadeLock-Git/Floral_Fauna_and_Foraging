package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.florafaunaandforaging.network.FloraFaunaAndForagingModVariables;
import net.mcreator.florafaunaandforaging.init.FloraFaunaAndForagingModBlocks;

public class SoilViewerItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.SOIL.get()) {
			if (new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "pHLevel") > 0) {
				FloraFaunaAndForagingModVariables.MapVariables.get(world).PhLevel = "pH - " + new java.text.DecimalFormat("##.##").format(new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "pHLevel"));
				FloraFaunaAndForagingModVariables.MapVariables.get(world).syncData(world);
			} else {
				FloraFaunaAndForagingModVariables.MapVariables.get(world).PhLevel = "pH - acidic";
				FloraFaunaAndForagingModVariables.MapVariables.get(world).syncData(world);
			}
		} else {
			FloraFaunaAndForagingModVariables.MapVariables.get(world).PhLevel = "pH - Unreadable";
			FloraFaunaAndForagingModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
