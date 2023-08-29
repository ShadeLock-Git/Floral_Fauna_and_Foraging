
package net.mcreator.florafaunaandforaging.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.florafaunaandforaging.entity.HedgehogEntity;
import net.mcreator.florafaunaandforaging.client.model.Modelcustom_model;

public class HedgehogRenderer extends MobRenderer<HedgehogEntity, Modelcustom_model<HedgehogEntity>> {
	public HedgehogRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(HedgehogEntity entity) {
		return new ResourceLocation("flora_fauna_and_foraging:textures/entities/hedgehog_texture.png");
	}
}
