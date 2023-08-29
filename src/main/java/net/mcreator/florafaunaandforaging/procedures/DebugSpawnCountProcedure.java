package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.florafaunaandforaging.network.FloraFaunaAndForagingModVariables;

public class DebugSpawnCountProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((new java.text.DecimalFormat("#").format(FloraFaunaAndForagingModVariables.MapVariables.get(world).FiretongueSpawnCount))), false);
	}
}
