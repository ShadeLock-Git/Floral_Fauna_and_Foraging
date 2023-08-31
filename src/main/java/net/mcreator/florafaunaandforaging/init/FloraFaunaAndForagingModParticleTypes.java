
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<SimpleParticleType> FLAME = REGISTRY.register("flame", () -> new SimpleParticleType(false));
}
