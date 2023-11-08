package net.frogipher.fauna.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.frogipher.fauna.Fauna;
import net.frogipher.fauna.entity.custom.GrizzlyBearEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {

    public static final EntityType<GrizzlyBearEntity> GRIZZLY_BEAR = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(Fauna.MOD_ID, "grizzly_bear"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GrizzlyBearEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 1.3f)).build());

    public static void registerModEntities() {
        Fauna.LOGGER.info("Registering Mod Entities for " + Fauna.MOD_ID);
    }
}
