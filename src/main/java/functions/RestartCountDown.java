package functions;

import config.ConfigLanguage;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import main.main;

public class RestartCountDown {


    public static void RestartCountDown() {
        if (main.winner1 != null && main.winner2 != null) {
            for (final Player player : Bukkit.getOnlinePlayers()) {
                player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Die Gewinner sind", ChatColor.GOLD + main.winner1 + " " + ChatColor.GREEN + "und" + " " + ChatColor.GOLD + main.winner2, 20, 100, 40);
            }
        } else if (main.winner1 != null) {
            for (final Player player : Bukkit.getOnlinePlayers()) {
                player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Der Gewinner ist", ChatColor.GOLD + main.winner1, 20, 100, 40);
            }
        } else if (main.winner1 == null && main.winner2 == null) {
            for (final Player player : Bukkit.getOnlinePlayers()) {
                player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 0.3f, 1.0f);
                player.sendTitle(ChatColor.GREEN + "Kein Gewinner", ChatColor.RED + "Gleichstand!", 20, 100, 40);
            }
        }
        new BukkitRunnable() {
            public void run() {
                if (main.Restartseconds > 0) {
                    Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ChatColor.GREEN + "Spiel Restartet in:" + " " + ChatColor.RED + main.Restartseconds);
                    --main.Restartseconds;
                    if (main.Restartseconds < 10) {
                        for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                            soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                        }
                    }
                } else {
                    restartGame.restartGame();
                    this.cancel();
                }
            }
        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
    }

}
