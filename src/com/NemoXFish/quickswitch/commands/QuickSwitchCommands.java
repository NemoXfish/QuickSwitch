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
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("gmc")) {
            player.setGameMode(GameMode.CREATIVE);
        }
        else if (cmd.getName().equalsIgnoreCase("gms")) {
            player.setGameMode(GameMode.SURVIVAL);
        }
        else if (cmd.getName().equalsIgnoreCase("gma")) {
            player.setGameMode(GameMode.ADVENTURE);
        }
        else if (cmd.getName().equalsIgnoreCase("gmsp")) {
            player.setGameMode(GameMode.SPECTATOR);
        }

        return true;
    }
}
