
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

public class FloraFaunaAndForagingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<CreativeModeTab> FLORA_FAUNA_AND_FORAGING = REGISTRY.register("flora_fauna_and_foraging", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.flora_fauna_and_foraging.flora_fauna_and_foraging")).icon(() -> new ItemStack(FloraFaunaAndForagingModItems.PRUNING_SHEARS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FloraFaunaAndForagingModBlocks.FIRETONGUE.get().asItem());
				tabData.accept(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP.get().asItem());
				tabData.accept(FloraFaunaAndForagingModItems.PRUNING_SHEARS.get());
				tabData.accept(FloraFaunaAndForagingModItems.HEAVENS_DEWDROP_BULB.get());
				tabData.accept(FloraFaunaAndForagingModBlocks.WILTING_NIGHTSHADE.get().asItem());
			})

			.build());
}
