package com.ffc.sodaventures.Items;

import com.ffc.sodaventures.SodaVentures;
import net.minecraft.item.Item;

public class pog extends Item {


    public pog() {
        super(new Item.Properties()
                .maxStackSize(1)
                .defaultMaxDamage(9)
                .maxDamage(15)
                .group(SodaVentures.setup.itemGroup));

        setRegistryName("pog");
    }
}
