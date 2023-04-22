package org.xatixatix.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoins implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.GREEN + "Welcome " + event.getPlayer().getName() + " to the server!");
    }
}
