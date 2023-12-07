package net.minok.mechpowered.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minok.mechpowered.MechPowered;

public class MechItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MechPowered.MOD_ID);
    public static final RegistryObject<Item> POWERCORE_COAL = ITEMS.register("powercore_coal",
            () -> new Item(new Item.Properties().durability(255)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
