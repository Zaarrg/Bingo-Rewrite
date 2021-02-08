package functions;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.io.IOException;
import main.main;

public class restartGame {

    public static void restartGame() {
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
            if (main.winner2 == null && main.winner1 != null) {
                player.kickPlayer(config.ConfigLanguage.getString("prefix") + " " + config.ConfigLanguage.getString("kickmsgwinOnePlayer").replace("%player%", main.winner1));
            } else if (main.winner1 == null && main.winner2 == null) {
                player.kickPlayer(config.ConfigLanguage.getString("prefix") + " " + ChatColor.GREEN + "Kein Gewinner" + " " + ChatColor.RED + "Gleichstand!");
            } else {
                if (main.winner1 == null || main.winner2 == null) {
                    continue;
                }
                player.kickPlayer(String.valueOf(config.ConfigLanguage.getString("prefix")) + " " + config.ConfigLanguage.getString("kickmsgwinTwoPlayer").replace("%player1%", main.winner1).replace("%player2%", main.winner2));
            }
        }
        if (config.Config.getConfig().contains("reset.Reset") && config.Config.getConfig().getBoolean("reset.Reset")) {
            main.GameStarted = false;
            main.LobbyStatus = true;
            config.Config.getConfig().set("reset.Reset", true);
            try {
                config.Config.getConfig().save(config.Config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
           main.setValuesDefault();
        }
        Bukkit.spigot().restart();
    }

}
