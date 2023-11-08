package net.frogipher.fauna.entity.layer;

import net.frogipher.fauna.Fauna;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer GRIZZLY_BEAR =
            new EntityModelLayer(new Identifier(Fauna.MOD_ID, "grizzly_bear"), "main");

}
