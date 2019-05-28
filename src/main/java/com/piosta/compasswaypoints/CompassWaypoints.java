package com.piosta.compasswaypoints;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//public class CompassWaypoints implements ModInitializer {
	public class CompassWaypoints implements ClientModInitializer {

	public static final String MODID = "compasswaypoints";
	public static final Item FABRIC_ITEM = new Item(new Item.Settings().itemGroup(ItemGroup.MISC));

	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public void onInitializeClient() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier(MODID, "fabric_item"), FABRIC_ITEM);
		System.out.println("Hello Fabric world!");
	}

	public static void MODLOG(String string) {
		MODLOG(Level.INFO, string);
	}

	public static void MODLOG(Level level, String string) {
		LOGGER.log(level, "[ComapssWaipoints] " + string);
	}
}
