
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<Item> HEDGEHOG_SPAWN_EGG = REGISTRY.register("hedgehog_spawn_egg", () -> new ForgeSpawnEggItem(FloraFaunaAndForagingModEntities.HEDGEHOG, -12309760, -3622747, new Item.Properties()));
}
