package net.mcreator.florafaunaandforaging.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WorldGenerationProcedureProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		FloraFaunaAndForagingModVariables.MapVariables.get(world).FiretongueSpawnCount = 0;
		FloraFaunaAndForagingModVariables.MapVariables.get(world).syncData(world);
	}
}
