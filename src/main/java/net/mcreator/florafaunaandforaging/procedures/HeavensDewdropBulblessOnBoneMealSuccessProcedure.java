package net.mcreator.florafaunaandforaging.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.florafaunaandforaging.init.FloraFaunaAndForagingModBlocks;

import java.util.Map;

public class HeavensDewdropBulblessOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.8) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENSDEWDROPGROWTH_1.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEW_DROPGROWTH_2.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENS_DEW_DROPGROWTH_2.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROPGROW_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROPGROW_3.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		} else {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENSDEWDROPGROWTH_1.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROPGROW_3.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENS_DEW_DROPGROWTH_2.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROPGROW_3.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP_BULBLESS.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = FloraFaunaAndForagingModBlocks.HEAVENS_DEWDROP.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
						if (_property != null && _bs.getValue(_property) != null)
							try {
								_bs = _bs.setValue(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}
