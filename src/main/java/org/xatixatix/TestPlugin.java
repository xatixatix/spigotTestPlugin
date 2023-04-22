package org.xatixatix;

import org.bukkit.plugin.java.JavaPlugin;
import org.xatixatix.commands.HelloWorld;
import org.xatixatix.commands.Leaderboard;
import org.xatixatix.commands.ListInventory;
import org.xatixatix.listeners.PlayerJoins;

public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        //registering commands
        this.getCommand("HelloWorld").setExecutor(new HelloWorld());
        this.getCommand("ListInventory").setExecutor(new ListInventory());
        this.getCommand("Leaderboard").setExecutor(new Leaderboard());

        //registering listeners
        getServer().getPluginManager().registerEvents(new PlayerJoins(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Bye :)");
    }

}
