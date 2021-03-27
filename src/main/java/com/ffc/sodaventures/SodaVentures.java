package com.ffc.sodaventures;

import com.ffc.sodaventures.Items.pog;
import com.ffc.sodaventures.blocks.AdemeniumLog;
import com.ffc.sodaventures.blocks.ModBlocks;
import com.ffc.sodaventures.setup.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("sodaventures")
public class SodaVentures {

    //ide have stroke at this point
    public static ModSetup setup = new ModSetup();


    private static final Logger LOGGER = LogManager.getLogger();

    public SodaVentures() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

        setup.init();


    }


    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {


    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {


        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {

            event.getRegistry().register(new AdemeniumLog());

        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {


           Item.Properties builder =  new Item.Properties()
                   .group(setup.itemGroup);

            event.getRegistry()
                    .register(new BlockItem(ModBlocks.ADEMENIUMLOG, builder).setRegistryName("ademenium_log"));

            event.getRegistry().register(new pog());





        }
    }
}
