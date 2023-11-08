package net.frogipher.fauna.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.frogipher.fauna.entity.ModEntities;
import net.frogipher.fauna.entity.custom.GrizzlyBearEntity;

public class ModRegistries {
    public static void registerModStuffs(){
        registerAttributes();
    }

    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.GRIZZLY_BEAR, GrizzlyBearEntity.createGrizzlyBearAttributes());
    }
}
