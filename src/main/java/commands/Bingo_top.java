package commands;

import config.ConfigLanguage;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import main.main;
import config.Config;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Bingo_top implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (args.length == 0) {
                if (p.getGameMode() == GameMode.SURVIVAL) {
                    if (p.getWorld() == Bukkit.getWorld("world")) {
                        final Location temploc = p.getLocation();
                        final Block b = p.getWorld().getHighestBlockAt(temploc.getBlockX(), temploc.getBlockZ());
                        final Location temploc2 = new Location(b.getLocation().getWorld(), (double)b.getLocation().getBlockX(), (double)(b.getLocation().getBlockY() + 1), (double)b.getLocation().getBlockZ());
                        p.teleport(temploc2);
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("teleportedtop"));
                    }
                    else if (p.getWorld() == Bukkit.getWorld("world_nether") || p.getWorld() == Bukkit.getWorld("world_the_end")) {
                        final Location topdim = Bukkit.getWorld("world").getSpawnLocation();
                        p.teleport(topdim);
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("teleportedworld"));
                    }
                    else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("mustbingoworld"));
                    }
                }
                else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("nospectatortop"));
                }
            }
            else {
                p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagetop"));
            }
        }
        else {
            sender.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("noconsole"));
        }
        return true;
    }

}
