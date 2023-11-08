package net.frogipher.fauna.entity.client;

import net.frogipher.fauna.Fauna;
import net.frogipher.fauna.entity.custom.GrizzlyBearEntity;
import net.frogipher.fauna.entity.layer.ModModelLayers;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GrizzlyBearRenderer extends MobEntityRenderer<GrizzlyBearEntity, GrizzlyBearModel<GrizzlyBearEntity>> {
    private static final Identifier TEXTURE = new Identifier(Fauna.MOD_ID, "textures/entity/grizzly_bear.png");

    public GrizzlyBearRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GrizzlyBearModel<>(ctx.getPart(ModModelLayers.GRIZZLY_BEAR)), 0.6f);
    }

    @Override
    public Identifier getTexture(GrizzlyBearEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(GrizzlyBearEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
