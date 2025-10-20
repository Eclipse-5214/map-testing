package com.example

import net.fabricmc.api.ClientModInitializer

object ExampleMod : ClientModInitializer {
    override fun onInitializeClient() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        println("Hello Fabric World!")
    }
}