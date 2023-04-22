package org.xatixatix;

import org.bukkit.plugin.java.JavaPlugin;
import org.xatixatix.commands.HelloWorld;
import org.xatixatix.commands.Leaderboard;
import org.xatixatix.commands.ListInventory;
import org.xatixatix.listeners.PlayerJoins;
import org.xatixatix.listeners.PlayerLeaves;

public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        //registering commands
        this.getCommand("HelloWorld").setExecutor(new HelloWorld());
        this.getCommand("Leaderboard").setExecutor(new Leaderboard());
        this.getCommand("ListInventory").setExecutor(new ListInventory());

        //registering listeners
        getServer().getPluginManager().registerEvents(new PlayerJoins(), this);
        getServer().getPluginManager().registerEvents(new PlayerLeaves(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye :)");
    }

}
