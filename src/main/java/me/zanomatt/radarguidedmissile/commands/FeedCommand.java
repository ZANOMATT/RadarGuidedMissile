package me.zanomatt.radarguidedmissile.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player p){
            p.setFoodLevel(20);
            p.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "La tua salute è stata rigenerata");
        }

        return true;
    }
}
