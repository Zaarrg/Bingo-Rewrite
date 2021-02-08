package commands;

import config.ConfigLanguage;
import functions.startGame;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import main.main;
import config.Config;

public class Start implements CommandExecutor {

    int seconds;


    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (sender instanceof Player) {
            final Player p = (Player)sender;
            if (args.length == 0) {
                if (p.hasPermission("bingo.start")) {
                    if (!main.GameStarted) {
                        Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamewillstart"));
                        new BukkitRunnable() {
                            public void run() {
                                if (Start.this.seconds != 0) {
                                    Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamestartsin").replace("%seconds%", String.valueOf(Start.this.seconds)));
                                    for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                                        soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                                    }
                                    final Start this$0 = Start.this;
                                    --this$0.seconds;
                                }
                                else {
                                    Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamestarts"));
                                    this.cancel();
                                    Start.this.seconds = 10;
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
                p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagestart"));
            }
        }
        else {
            sender.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("noconsole"));
        }
        return true;
    }



}
