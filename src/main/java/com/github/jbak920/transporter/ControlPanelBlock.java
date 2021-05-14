package com.github.jbak920.transporter;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class ControlPanelBlock extends Block {
    public ControlPanelBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ControlPanelTileEntity();
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (!worldIn.isRemote && handIn == Hand.MAIN_HAND) {
            ControlPanelTileEntity controlPanelBlockTileEntity = (ControlPanelTileEntity) worldIn.getTileEntity(pos);
            int counter = controlPanelBlockTileEntity.increase();
            TranslationTextComponent translationTextComponent = new TranslationTextComponent("message.transporter.control_panel.counter", counter);
            player.sendStatusMessage(translationTextComponent, false);
        }
        return ActionResultType.SUCCESS;
    }
}
