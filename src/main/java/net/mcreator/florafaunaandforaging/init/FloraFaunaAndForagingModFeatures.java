
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.florafaunaandforaging.world.features.plants.WiltingNightshadeFeature;
import net.mcreator.florafaunaandforaging.world.features.plants.HeavensDewdropFeature;
import net.mcreator.florafaunaandforaging.world.features.plants.FrostFloretFeature;
import net.mcreator.florafaunaandforaging.world.features.plants.FiretongueFeature;
import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

@Mod.EventBusSubscriber
public class FloraFaunaAndForagingModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Feature<?>> FIRETONGUE = REGISTRY.register("firetongue", FiretongueFeature::new);
	public static final RegistryObject<Feature<?>> HEAVENS_DEWDROP = REGISTRY.register("heavens_dewdrop", HeavensDewdropFeature::new);
	public static final RegistryObject<Feature<?>> WILTING_NIGHTSHADE = REGISTRY.register("wilting_nightshade", WiltingNightshadeFeature::new);
	public static final RegistryObject<Feature<?>> FROST_FLORET = REGISTRY.register("frost_floret", FrostFloretFeature::new);
}
