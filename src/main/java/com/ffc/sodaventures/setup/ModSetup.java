package com.ffc.sodaventures.setup;

import com.ffc.sodaventures.blocks.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("sodaventures") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.ADEMENIUMLOG);
        }




    };

    public void init() {
    }
}
