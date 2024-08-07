package com.kljiana.vendingmachine.entity.block;

import com.kljiana.vendingmachine.block.machine.MachineBlock;
import com.kljiana.vendingmachine.entity.ModEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class VendingMachine extends BlockEntity {
    public VendingMachine(BlockPos pos, BlockState state) {
        super(ModEntity.VENDING_MACHINE_BLOCK_ENTITY.get(), pos, state);
    }
}
