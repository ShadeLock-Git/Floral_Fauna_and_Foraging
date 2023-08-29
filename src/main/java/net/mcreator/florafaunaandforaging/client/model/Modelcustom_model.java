package net.mcreator.florafaunaandforaging.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("flora_fauna_and_foraging", "modelcustom_model"), "main");
	public final ModelPart Body;
	public final ModelPart spines;
	public final ModelPart leg;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;
	public final ModelPart head;

	public Modelcustom_model(ModelPart root) {
		this.Body = root.getChild("Body");
		this.spines = root.getChild("spines");
		this.leg = root.getChild("leg");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -6.0F, 10.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 29).addBox(-4.5F, -3.0F, -5.5F, 9.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(28, 14)
						.addBox(-3.0F, -7.0F, -6.0F, 6.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(4, 4).addBox(-0.5F, -3.0F, 6.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, -6.0F, -7.0F, 8.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(34, 37).addBox(-3.0F, -5.0F, 1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition spines = partdefinition.addOrReplaceChild("spines",
				CubeListBuilder.create().texOffs(32, 0).addBox(-6.0F, -10.0F, 0.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(29, 29).addBox(-6.0F, -10.0F, -2.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.0F, -9.0F, -4.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 8).addBox(-6.0F, -8.5F, -5.75F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 45)
						.addBox(-6.0F, -9.0F, 2.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 45).addBox(-6.0F, -7.0F, 5.25F, 12.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leg = partdefinition.addOrReplaceChild("leg", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 22.0F, 4.5F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 22.0F, 4.5F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 22.0F, -4.5F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(6, 0).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 22.0F, -4.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -0.8333F, -1.4833F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-1.0F, 0.1667F, -2.4833F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.5F, 1.1667F, -4.4833F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 1).addBox(-3.0F, -1.8333F, -0.4833F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -1.8333F, -0.4833F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 25).addBox(-4.0F, -2.8333F, 0.4167F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.8333F, -7.5167F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		spines.render(poseStack, buffer, packedLight, packedOverlay);
		leg.render(poseStack, buffer, packedLight, packedOverlay);
		leg2.render(poseStack, buffer, packedLight, packedOverlay);
		leg3.render(poseStack, buffer, packedLight, packedOverlay);
		leg4.render(poseStack, buffer, packedLight, packedOverlay);
		head.render(poseStack, buffer, packedLight, packedOverlay);
	}
}
