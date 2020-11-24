package com.NemoXFish.quickswitch;

import com.NemoXFish.quickswitch.commands.QuickSwitchCommands;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class QuickSwitch extends JavaPlugin {
    @Override
    public void onEnable() {
        QuickSwitchCommands commands = new QuickSwitchCommands();
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[QuickSwitch]: Plugin is enabled!");
        getCommand("gmc").setExecutor(commands);
        getCommand("gms").setExecutor(commands);
        getCommand("gma").setExecutor(commands);
        getCommand("gmsp").setExecutor(commands);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[QuickSwitch]: Plugin is disabled!");
    }
}