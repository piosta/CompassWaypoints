package com.piosta.compasswaypoints;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

//public class CompassWaypoints implements ModInitializer {
	public class CompassWaypoints implements ClientModInitializer {

	public static final String MODID = "compasswaypoints";

	@Override
	public void onInitializeClient() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
