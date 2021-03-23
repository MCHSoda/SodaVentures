package com.ffc.sodaventures;

import com.ffc.sodaventures.blocks.AdemeniumLog;
import com.ffc.sodaventures.blocks.ModBlocks;
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
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public SodaVentures() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {


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

            event.getRegistry()
                    .register(new BlockItem(ModBlocks.ADEMENIUMLOG, new Item.Properties()).setRegistryName("ademenium_log"));

        }
    }
}
