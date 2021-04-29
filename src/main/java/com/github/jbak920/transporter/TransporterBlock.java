package com.github.jbak920.transporter;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class TransporterBlock extends Block {
    public TransporterBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        double curr_x = player.getPosX();
        double curr_y = player.getPosY();
        double curr_z = player.getPosZ();
        player.setPosition(curr_x + 2 * Math.random() - 1, curr_y, curr_z + 2 * Math.random() - 1);
        Math.random();
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }
}
