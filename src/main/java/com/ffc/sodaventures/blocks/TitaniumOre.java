package com.ffc.sodaventures.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TitaniumOre extends Block{

    public TitaniumOre() {


        super(Block.Properties.create(Material.IRON)
                .lightValue(14)
                .hardnessAndResistance(8.0f)
                .sound(SoundType.METAL)
        );

        setRegistryName("titanium_ore");
    }
}
