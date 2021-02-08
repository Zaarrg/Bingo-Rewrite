package reset;

import config.Config;
import config.ConfigLanguage;
import org.apache.commons.io.FileUtils;
import org.bukkit.*;
import org.bukkit.entity.Player;
import main.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Comparator;

public class reset {

    public static void reset() {

        for (final Player players : Bukkit.getOnlinePlayers()) {
            //Kick Players before Reset.
            players.kickPlayer(ConfigLanguage.getString("gameisrestarting") + " " + ConfigLanguage.getString("prefix"));
        }
        //Unload worlds if Reset
        Bukkit.getServer().unloadWorld("world", false);
        Bukkit.getServer().unloadWorld("world_nether", false);
        Bukkit.getServer().unloadWorld("world_the_end", false);
        //Delete Worlds
        deleteWorld();
        deleteNether();
        deleteEnd();

        //Set Reset to Default Value to prevent Looping
        Config.getConfig().set("reset.Reset", false);
        //Save Config
        try {
            Config.getConfig().save(Config.getFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //restart to load new world
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Server Restarting for Worlds to fully load!");
        Bukkit.spigot().restart();
    }




    public static void deleteWorld() {
        final File file = new File("world");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            FileUtils.deleteDirectory(file);
        } catch (Exception ex) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Server Restarting for Overworld to fully load!");
            Bukkit.spigot().restart();
        }
    }

    public static void deleteNether() {
        final File file = new File("world_nether");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            FileUtils.deleteDirectory(file);
        } catch (Exception ex) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Server Restarting for Nether to fully load!");
            Bukkit.spigot().restart();
        }
    }

    public static void deleteEnd() {
        final File file = new File("world_the_end");
        if (!file.exists() || !file.isDirectory()) {
            return;
        }
        try {
            FileUtils.deleteDirectory(file);
        } catch (Exception ex) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Server Restarting for End to fully load!");
            Bukkit.spigot().restart();
        }
    }

}




