package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.florafaunaandforaging.network.FloraFaunaAndForagingModVariables;

public class GuiProcedureProcedure {
	public static String execute(LevelAccessor world) {
		return FloraFaunaAndForagingModVariables.MapVariables.get(world).PhLevel;
	}
}
