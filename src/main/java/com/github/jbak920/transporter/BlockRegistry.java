package com.github.jbak920.transporter;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> transporterBlock = BLOCKS.register("transporter_block", TransporterBlock::new);
    public static final RegistryObject<Block> controlPanelBlock = BLOCKS.register("control_panel_block", ControlPanelBlock::new);
}
