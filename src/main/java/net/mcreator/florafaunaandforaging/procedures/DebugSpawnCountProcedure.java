package net.mcreator.florafaunaandforaging.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DebugSpawnCountProcedure {
	public static void execute(LevelAccessor world) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal((new java.text.DecimalFormat("#").format(FloraFaunaAndForagingModVariables.MapVariables.get(world).FiretongueSpawnCount))), false);
	}
}
