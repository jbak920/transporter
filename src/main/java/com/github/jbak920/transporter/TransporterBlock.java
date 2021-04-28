package com.github.jbak920.transporter;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TransporterBlock extends Block {
    public TransporterBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }
}
