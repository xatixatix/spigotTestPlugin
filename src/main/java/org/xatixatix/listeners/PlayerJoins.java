package org.xatixatix.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.xatixatix.utils.PlayerList;

public class PlayerJoins implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.setJoinMessage(ChatColor.GREEN + "Welcome " + event.getPlayer().getName() + " to the server!");

        //creating custom tab list
        PlayerList list = new PlayerList(event.getPlayer(),PlayerList.SIZE_TWO);
        list.initTable();
        list.updateSlot(0,"Top left");
        list.updateSlot(60,"Top right");
        list.setHeaderFooter(ChatColor.AQUA+"Welcome",event.getPlayer().getName());
    }
}
