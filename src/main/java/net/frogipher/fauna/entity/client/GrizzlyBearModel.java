package net.frogipher.fauna.entity.client;

import net.frogipher.fauna.entity.animations.ModAnimations;
import net.frogipher.fauna.entity.custom.GrizzlyBearEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;

import javax.swing.text.AbstractDocument;

public class GrizzlyBearModel<T extends GrizzlyBearEntity> extends SinglePartEntityModel<T> {

    private final ModelPart grizzly_bear;
    private final ModelPart head;

    public GrizzlyBearModel(ModelPart root) {
        this.grizzly_bear = root.getChild("grizzly_bear");
        this.head = grizzly_bear.getChild("body").getChild("head");
        }

public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData whole = modelPartData.addChild("grizzly_bear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = whole.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

        ModelPartData rotation = body.addChild("rotation", ModelPartBuilder.create().uv(0, 30).cuboid(-9.5F, -13.0F, -6.5F, 19.0F, 12.0F, 13.0F, new Dilation(0.0F))
        .uv(0, 0).cuboid(-10.5F, -1.0F, -7.5F, 21.0F, 15.0F, 15.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 55).cuboid(-5.5F, -6.0F, -7.0F, 11.0F, 11.0F, 9.0F, new Dilation(0.0F))
        .uv(59, 65).cuboid(-2.5F, -1.0F, -12.0F, 5.0F, 6.0F, 5.0F, new Dilation(0.0F))
        .uv(0, 0).cuboid(-7.5F, -8.0F, -4.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F))
        .uv(0, 0).mirrored().cuboid(3.5F, -8.0F, -4.0F, 4.0F, 4.0F, 1.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 1.2F, -14.0F));

        ModelPartData leg4 = whole.addChild("leg4", ModelPartBuilder.create().uv(57, 0).mirrored().cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.5F, -9.0F, -9.0F));

        ModelPartData leg3 = whole.addChild("leg3", ModelPartBuilder.create().uv(57, 0).cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -9.0F, -9.0F));

        ModelPartData leg2 = whole.addChild("leg2", ModelPartBuilder.create().uv(57, 0).mirrored().cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(5.5F, -9.0F, 9.0F));

        ModelPartData leg1 = whole.addChild("leg1", ModelPartBuilder.create().uv(57, 0).cuboid(-3.0F, 0.0F, -3.0F, 6.0F, 9.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.5F, -9.0F, 9.0F));
        return TexturedModelData.of(modelData, 128, 128);
        }
@Override
public void setAngles(GrizzlyBearEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(entity, netHeadYaw, headPitch, ageInTicks);

        this.animateMovement(ModAnimations.GRIZZLY_BEAR_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.GRIZZLY_BEAR_IDLE, ageInTicks, 1f);

        }

    private void setHeadAngles(GrizzlyBearEntity entity, float headYaw, float headPitch, float animationProgress) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

@Override
public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
    grizzly_bear.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
        }

    @Override
    public ModelPart getPart() {
        return grizzly_bear;
    }
}
