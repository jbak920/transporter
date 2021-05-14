package com.github.jbak920.transporter;

import com.google.common.io.Closer;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Utils.MOD_ID);
    public static final RegistryObject<TileEntityType<ControlPanelTileEntity>> controlPanelTileEntity = TILE_ENTITIES.register("control_panel_tileentity", () -> TileEntityType.Builder.create(ControlPanelTileEntity::new, BlockRegistry.controlPanelBlock.get()).build(null));
}