
package net.mcreator.florafaunaandforaging.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.common.PlantType;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.florafaunaandforaging.procedures.FiretongueUpdateTickProcedure;
import net.mcreator.florafaunaandforaging.procedures.FiretonguePlantRightClickedProcedure;
import net.mcreator.florafaunaandforaging.procedures.FiretongueAdditionalGenerationConditionProcedure;

import java.util.List;
import java.util.Collections;

public class FiretongueBlock extends FlowerBlock {
	public FiretongueBlock() {
		super(() -> MobEffects.FIRE_RESISTANCE, 100, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).lightLevel(s -> 5)
				.noCollission().offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this));
	}

	@Override
	public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
		return groundState.is(Blocks.STONE) || groundState.is(Blocks.GRANITE) || groundState.is(Blocks.DIORITE) || groundState.is(Blocks.ANDESITE) || groundState.is(Blocks.TUFF) || groundState.is(Blocks.DEEPSLATE);
	}

	@Override
	public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.below();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.mayPlaceOn(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(BlockGetter world, BlockPos pos) {
		return PlantType.CAVE;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		FiretongueAdditionalGenerationConditionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void animateTick(BlockState blockstate, Level world, BlockPos pos, RandomSource random) {
		super.animateTick(blockstate, world, pos, random);
		FiretongueUpdateTickProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		FiretonguePlantRightClickedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return InteractionResult.SUCCESS;
	}
}
