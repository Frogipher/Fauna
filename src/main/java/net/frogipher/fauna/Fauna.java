package net.frogipher.fauna;

import net.fabricmc.api.ModInitializer;

import net.frogipher.fauna.entity.ModEntities;
import net.frogipher.fauna.item.ModItemGroup;
import net.frogipher.fauna.item.ModItems;
import net.frogipher.fauna.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fauna implements ModInitializer {
	public static final String MOD_ID = "fauna";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModEntities.registerModEntities();
		ModRegistries.registerModStuffs();
		ModItems.registerModItems();
		ModItemGroup.registerItemGroups();

	}
}