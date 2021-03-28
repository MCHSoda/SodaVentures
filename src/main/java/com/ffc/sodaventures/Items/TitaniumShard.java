package com.ffc.sodaventures.Items;

import com.ffc.sodaventures.SodaVentures;
import net.minecraft.item.Item;

public class TitaniumShard extends Item {
    public TitaniumShard() {
        super(new Item.Properties()
                .maxStackSize(64)
                .group(SodaVentures.setup.itemGroup)
                );
        setRegistryName("titanium_shard");
    }
}
