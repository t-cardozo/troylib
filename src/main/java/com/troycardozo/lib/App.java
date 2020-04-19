package com.troycardozo.lib;

import com.troycardozo.lib.config.YmlConfig;
import com.troycardozo.lib.listeners.PlayerDeath;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class App extends JavaPlugin {

    public YmlConfig deathMsgsConfig;

    @Override
    public void onEnable() {
        setup();
    }

    @Override
    public void onDisable() {

    }

    void setup() {
        Bukkit.getConsoleSender().sendMessage("Loading Troy's Libs...");
        this.getServer().broadcastMessage("Hi");
        this.saveDefaultConfig();
        File deathmsgsFile = new File(this.getDataFolder(), "deathMsgs.yml");
        getServer().getPluginManager().registerEvents(new PlayerDeath(this), this);
    }

}
