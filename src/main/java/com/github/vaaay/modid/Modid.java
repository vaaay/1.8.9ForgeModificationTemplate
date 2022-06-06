package com.github.vaaay.modid;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = "modid",
        name = "Modid",
        version = "1.0.0",
        acceptedMinecraftVersions = "[1.8.9]"
)
public class Modid {
    public static final Minecraft mc = Minecraft.getMinecraft();

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    }
}
