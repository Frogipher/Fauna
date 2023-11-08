package net.frogipher.fauna.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.frogipher.fauna.Fauna;
import net.frogipher.fauna.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GRIZZLY_BEAR_SPAWN_EGG = registerItem("grizzly_bear_spawn_egg",
            new SpawnEggItem(ModEntities.GRIZZLY_BEAR, -1, -1, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Fauna.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Fauna.LOGGER.info("Registering Mod Items for " + Fauna.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::itemGroupIngredients);
    }

    private static void itemGroupIngredients(FabricItemGroupEntries entries) {
    }
}
