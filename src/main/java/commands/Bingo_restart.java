package commands;

import config.ConfigLanguage;
import functions.manualRestart;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import main.main;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import config.Config;

import java.io.IOException;

public class Bingo_restart implements CommandExecutor  {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (p.hasPermission("bingo.restart")) {
                if (args.length == 0) {
                    main.isRestarting = true;
                    main.GameStarted = false;
                    main.LobbyStatus = true;
                    Config.getConfig().set("reset.isReset", (Object)true);
                    try {
                        Config.getConfig().save(Config.getFile());
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    manualRestart.manuallyRestarting();
                }
                else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagebingorestart"));
                }
            }
            else {
                p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("nopermission") + " " + ChatColor.DARK_PURPLE + "[bingo.restart]");
            }
        }
        else {
            sender.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("noconsole"));
        }
        return true;
    }

}
