package com.github.jbak920.transporter;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> transporterBlock = ITEMS.register("transporter_block", () -> new BlockItem(BlockRegistry.transporterBlock.get(), new Item.Properties().group(ModGroup.itemGroup)));
}
