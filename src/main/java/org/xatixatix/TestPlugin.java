package org.xatixatix;

import org.bukkit.plugin.java.JavaPlugin;
import org.xatixatix.commands.HelloWorld;

public class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("HelloWorld").setExecutor(new HelloWorld());
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}
