package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.florafaunaandforaging.init.FloraFaunaAndForagingModParticleTypes;

public class FiretongueUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 4;
		particleRadius = 2;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle((SimpleParticleType) (FloraFaunaAndForagingModParticleTypes.FLAME.get()), (x + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius),
					(y + 0 + Mth.nextDouble(RandomSource.create(), 0, 5) * particleRadius), (z + 0 + Mth.nextDouble(RandomSource.create(), -0.1, 0.1) * particleRadius), 0, 1, 0);
		}
	}
}
