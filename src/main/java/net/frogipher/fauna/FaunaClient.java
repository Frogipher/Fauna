package net.frogipher.fauna;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.frogipher.fauna.entity.ModEntities;
import net.frogipher.fauna.entity.client.GrizzlyBearModel;
import net.frogipher.fauna.entity.client.GrizzlyBearRenderer;
import net.frogipher.fauna.entity.layer.ModModelLayers;

public class FaunaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.GRIZZLY_BEAR, GrizzlyBearModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.GRIZZLY_BEAR, GrizzlyBearRenderer::new);

    }
}
