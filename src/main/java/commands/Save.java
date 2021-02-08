package commands;

import config.Config;
import config.ConfigLanguage;
import config.data;
import main.main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Save implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {

        final Player p = (Player)sender;
        if (p.hasPermission("bingo.save")) {
            main.savegame = true;
            Config.saveConfiguration();
            p.sendMessage(ConfigLanguage.getString("prefix") + ConfigLanguage.getString("savemessage"));
            return true;
        } else {
            p.sendMessage(ConfigLanguage.getString("prefix") + ConfigLanguage.getString("nopermission") + " " + ChatColor.DARK_PURPLE + "[bingo.save]");
            return false;
        }

    }

}
