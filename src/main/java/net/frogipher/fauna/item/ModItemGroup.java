package net.frogipher.fauna.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frogipher.fauna.Fauna;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FAUNA = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Fauna.MOD_ID, "fauna"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fauna"))
                    .icon(() -> new ItemStack(ModItems.GRIZZLY_BEAR_SPAWN_EGG)).entries((displayContext, entries) -> {

                        entries.add(ModItems.GRIZZLY_BEAR_SPAWN_EGG);


                    }).build());

    public static void registerItemGroups() {

    }
}
