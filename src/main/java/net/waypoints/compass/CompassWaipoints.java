package net.waypoints.compass;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CompassWaipoints implements ModInitializer {

    // public static final FABRIC_ITEM = new Item(new
    // Item.Settings().group(ItemGroup.MISC));
    public static final Item FABRIC_ITEM = new FabricItem(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        // TODO Auto-generated method stub
        Registry.register(Registry.ITEM, new Identifier("compasswaipoints", "fabric_item"), FABRIC_ITEM);
    }

}
