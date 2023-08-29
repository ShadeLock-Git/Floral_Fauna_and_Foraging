
package net.mcreator.florafaunaandforaging.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.florafaunaandforaging.entity.HedgehogEntity;

public class HedgehogRenderer extends HumanoidMobRenderer<HedgehogEntity, HumanoidModel<HedgehogEntity>> {
	public HedgehogRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.4f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(HedgehogEntity entity) {
		return new ResourceLocation("flora_fauna_and_foraging:textures/entities/hedgehog_texture.png");
	}
}
