package commands;

import config.Config;
import config.ConfigLanguage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import main.main;
import org.bukkit.entity.Player;

import java.io.IOException;

public class Reset implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        final Player p = (Player)sender;
        if (p.hasPermission("bingo.reset")) {
            Config.getConfig().set("reset.Reset", true);
            for (final Player player : Bukkit.getOnlinePlayers()) {
                if (main.t1.contains(player)) {
                    main.t1.remove(player);
                } else if (main.t2.contains(player)) {
                    main.t2.remove(player);
                } else if (main.t3.contains(player)) {
                    main.t3.remove(player);
                } else if (main.t4.contains(player)) {
                    main.t4.remove(player);
                } else if (main.t5.contains(player)) {
                    main.t5.remove(player);
                } else if (main.t6.contains(player)) {
                    main.t6.remove(player);
                } else if (main.t7.contains(player)) {
                    main.t7.remove(player);
                } else if (main.t8.contains(player)) {
                    main.t8.remove(player);
                } else main.t9.remove(player);
                player.kickPlayer(ConfigLanguage.getString("prefix") + " " + ChatColor.RED + "World is Reseting!");
            }
            try {
                Config.saveConfiguration();
                Config.getConfig().save(Config.getFile());
                ConfigLanguage.getConfig().save(ConfigLanguage.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            Bukkit.spigot().restart();
            return true;
        } else {
            p.sendMessage(ConfigLanguage.getString("prefix") + ConfigLanguage.getString("nopermission") + " " + net.md_5.bungee.api.ChatColor.DARK_PURPLE + "[bingo.reset]");
            return false;
        }
    }
}
