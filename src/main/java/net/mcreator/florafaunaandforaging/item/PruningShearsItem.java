
package net.mcreator.florafaunaandforaging.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PruningShearsItem extends Item {
	public PruningShearsItem() {
		super(new Item.Properties().durability(250).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 14;
	}
}
