package com.github.jbak920.transporter;

import net.minecraft.tileentity.TileEntity;

public class ControlPanelTileEntity extends TileEntity {
    private int counter = 0;

   public ControlPanelTileEntity() {
        super(TileEntityTypeRegistry.controlPanelTileEntity.get());
    }

    public int increase() {
        counter++;
        markDirty();
        return counter;
    }
}

