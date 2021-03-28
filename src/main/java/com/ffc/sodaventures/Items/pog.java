package com.ffc.sodaventures.Items;

import com.ffc.sodaventures.SodaVentures;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
public class pog extends AxeItem {



    public pog() {
        super(ItemTier.DIAMOND, 12.0F, -9.2F ,new Item.Properties()

                .maxStackSize(1)
                .group(SodaVentures.setup.itemGroup));

        setRegistryName("pog");
    }
}
