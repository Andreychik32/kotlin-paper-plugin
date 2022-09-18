package com.groupname.kotlinplugin

import org.bukkit.plugin.java.JavaPlugin

class KotlinPlugin : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        server.consoleSender.sendMessage("KotlinPlugin started!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}