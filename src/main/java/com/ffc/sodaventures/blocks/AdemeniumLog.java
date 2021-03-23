package com.ffc.sodaventures.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AdemeniumLog extends Block {


    public AdemeniumLog() {


        super(Properties.create(Material.WOOD)
                .lightValue(14)
                .hardnessAndResistance(10f)
                .sound(SoundType.WOOD)
        );

        setRegistryName("ademenium_log");
    }
}
