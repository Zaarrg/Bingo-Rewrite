package commands;

import config.ConfigLanguage;
import functions.startGame;
import main.main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import config.Config;

public class Bingo_guide implements CommandExecutor  {

    int seconds = 10;


    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (p.hasPermission("bingo.defaultcmd")) {
                if (args.length == 0) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("notavailable"));
                }
                else if (args.length == 1 && args[0].equalsIgnoreCase("help")) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("notavailable"));
                }
                else if (args.length == 1 && args[0].equalsIgnoreCase("prefixdebug")) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("notavailable"));
                }
                else if (args.length == 1 && args[0].equalsIgnoreCase("status")) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("notavailable"));
                }
                else if (args.length == 1 && args[0].equalsIgnoreCase("start")) {
                    if (p.hasPermission("bingo.start")) {
                        if (!main.GameStarted) {
                            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamewillstart"));
                            new BukkitRunnable() {
                                public void run() {
                                    if (Bingo_guide.this.seconds != 0) {
                                        Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamestartsin").replace("%seconds%", String.valueOf(Bingo_guide.this.seconds)));
                                        for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                                            soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                                        }
                                        final Bingo_guide this$0 = Bingo_guide.this;
                                        --this$0.seconds;
                                    }
                                    else {
                                        Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamestarts"));
                                        this.cancel();
                                        Bingo_guide.this.seconds = 10;
                                        startGame.startGame();
                                    }
                                }
                            }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
                        }
                        else {
                            p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamealreadystarts"));
                        }
                    }
                    else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("nopermission") + " " + ChatColor.DARK_PURPLE + "[bingo.start]");
                    }
                }
                else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagebingopl"));
                }
            }
            else {
                p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("nopermission") + " " + ChatColor.DARK_PURPLE + "[bingo.defautlcmd]");
            }
        }
        else {
            sender.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("noconsole"));
        }
        return true;
    }

}
