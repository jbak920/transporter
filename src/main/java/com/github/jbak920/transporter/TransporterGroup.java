package com.github.jbak920.transporter;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class TransporterGroup extends ItemGroup {
    public TransporterGroup() {
        super("transporter_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.transporterBlock.get());
    }
}