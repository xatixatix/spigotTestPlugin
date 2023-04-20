package org.xatixatix;

import org.bukkit.plugin.java.JavaPlugin;
import org.xatixatix.commands.HelloWorld;
import org.xatixatix.commands.ListInventory;

public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("HelloWorld").setExecutor(new HelloWorld());
        this.getCommand("ListInventory").setExecutor(new ListInventory());
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}
