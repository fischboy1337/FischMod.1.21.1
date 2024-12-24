package eu.fischboy.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class FischMod implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        System.out.println("Mod intialized");
    }

    @Override
    public void onInitializeClient() {

    }
}
