package com.troycardozo.lib.listeners;

import com.troycardozo.lib.App;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class PlayerDeath implements Listener {
    final App plugin;

    public PlayerDeath(App instance) {
        plugin = instance;
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerDeathEvent(PlayerDeathEvent event) {

        final Player player = event.getEntity().getPlayer();

    }


}
