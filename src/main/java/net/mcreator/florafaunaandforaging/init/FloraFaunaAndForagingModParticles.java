
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.florafaunaandforaging.client.particle.FlameParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FloraFaunaAndForagingModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(FloraFaunaAndForagingModParticleTypes.FLAME.get(), FlameParticle::provider);
	}
}
