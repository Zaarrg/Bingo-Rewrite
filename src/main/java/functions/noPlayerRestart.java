package functions;

import org.bukkit.Bukkit;

import java.io.IOException;
import main.main;

public class noPlayerRestart {

    public static void noPlayerRestart() {
        config.Config.loadConfiguration();
        if (config.Config.getConfig().contains("reset.Reset") && config.Config.getConfig().getBoolean("reset.Reset")) {
            main.GameStarted = false;
            main.LobbyStatus = true;
            config.Config.getConfig().set("reset.Reset", false);
            try {
                config.Config.getConfig().save(config.Config.getFile());
            } catch (IOException e) {
                e.printStackTrace();
            }
            main.setValuesDefault();
            Bukkit.spigot().restart();
        }

    }
}



