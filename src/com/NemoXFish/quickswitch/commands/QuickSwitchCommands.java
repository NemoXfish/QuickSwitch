package com.NemoXFish.quickswitch.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class QuickSwitchCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("gmc")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§fSet own game mode to Creative Mode");
        }
        else if (cmd.getName().equalsIgnoreCase("gms")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§fSet own game mode to Survival Mode");
        }
        else if (cmd.getName().equalsIgnoreCase("gma")) {
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage("§fSet own game mode to Adventure Mode");
        }
        else if (cmd.getName().equalsIgnoreCase("gmsp")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage("§fSet own game mode to Spectator Mode");
        }

        return true;
    }
}
