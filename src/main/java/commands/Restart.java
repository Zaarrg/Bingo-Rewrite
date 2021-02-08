package commands;

import config.ConfigLanguage;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import main.main;
import config.Config;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Restart implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (args.length == 0) {
                if (p.hasPermission("bingo.restart")) {
                    p.performCommand("bingoreset");
                }
                else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("nopermission") + " " + ChatColor.DARK_PURPLE + "[bingo.restart]");
                }
            }
            else {
                p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagebrestart"));
            }
        }
        else {
            sender.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("noconsole"));
        }
        return true;
    }


}
