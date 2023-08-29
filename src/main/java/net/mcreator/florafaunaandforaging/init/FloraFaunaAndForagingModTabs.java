
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.florafaunaandforaging.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.florafaunaandforaging.FloraFaunaAndForagingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FloraFaunaAndForagingModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FloraFaunaAndForagingMod.MODID);
	public static final RegistryObject<CreativeModeTab> FLORA_FAUNA_AND_FORAGING = REGISTRY.register("flora_fauna_and_foraging", () -> CreativeModeTab.builder()
			.title(Component.translatable("item_group.flora_fauna_and_foraging.flora_fauna_and_foraging")).icon(() -> new ItemStack(FloraFaunaAndForagingModItems.PRUNING_SHEARS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP.get().asItem());
				tabData.accept(FloraFaunaAndForagingModItems.PRUNING_SHEARS.get());
				tabData.accept(FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS.get().asItem());
				tabData.accept(FloraFaunaAndForagingModItems.HEAVENS_DEWDROP_BULB.get());
			})

			.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(FloraFaunaAndForagingModItems.HEDGEHOG_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(FloraFaunaAndForagingModBlocks.FIRETONGUE.get().asItem());
		}
	}
}
