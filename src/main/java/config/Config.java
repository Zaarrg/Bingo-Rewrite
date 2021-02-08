package config;

import functions.RandomEnchantment;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import main.main;

import java.io.File;

public class Config {

    private static File file;
    private static YamlConfiguration yml;
    public static boolean setup;
    public static boolean configCreated;

    static {
        Config.file = new File("plugins/Bingo/", "config.yml");
        Config.yml = YamlConfiguration.loadConfiguration(Config.file);
        Config.setup = false;
        Config.configCreated = false;
    }

    public static boolean loadConfiguration() {

        if (!Config.file.exists()) {
            //Create Config if no existing
            createConfiguration();
        }

        try {
            //Load Variables
            main.Teamsize = Config.getConfig().getInt("team.Size");
            main.SpawnArea = Config.getConfig().getInt("spawn.SpawnArea");
            main.keepinventory = Config.getConfig().getBoolean("Playersettings.keepinventory");
            main.hunger = Config.getConfig().getBoolean("Playersettings.hunger");
            main.damage = Config.getConfig().getBoolean("Playersettings.damage");

            main.s1 = Config.getConfig().getBoolean("difficulty.1");
            main.s2 = Config.getConfig().getBoolean("difficulty.2");
            main.s3 = Config.getConfig().getBoolean("difficulty.3");
            main.s4 = Config.getConfig().getBoolean("difficulty.4");
            main.s5 = Config.getConfig().getBoolean("difficulty.5");
            main.s6 = Config.getConfig().getBoolean("difficulty.6");
            main.s7 = Config.getConfig().getBoolean("difficulty.7");
            main.s8 = Config.getConfig().getBoolean("difficulty.8");
            main.s9 = Config.getConfig().getBoolean("difficulty.9");
            main.s10 = Config.getConfig().getBoolean("difficulty.10");
            main.s11 = Config.getConfig().getBoolean("difficulty.11");
            main.s12 = Config.getConfig().getBoolean("difficulty.12");
            main.s13 = Config.getConfig().getBoolean("difficulty.13");
            main.s14 = Config.getConfig().getBoolean("difficulty.14");
            main.s15 = Config.getConfig().getBoolean("difficulty.15");
            main.s16 = Config.getConfig().getBoolean("difficulty.16");
            main.s17 = Config.getConfig().getBoolean("difficulty.17");
            main.s18 = Config.getConfig().getBoolean("difficulty.18");
            //Filters
            main.f1 = Config.getConfig().getBoolean("filter.1");
            //Enchantments
            RandomEnchantment.Wahrscheinlichkeit = Config.getConfig().getDouble("RandomEnchantment.Chance");
            //Timer
            main.hours = Config.getConfig().getInt("Timer.hours");
            main.minutes = Config.getConfig().getInt("Timer.minutes");
            main.seconds = Config.getConfig().getInt("Timer.seconds");
            main.timerpause = Config.getConfig().getBoolean("Timer.pause");
            main.timercountdown = Config.getConfig().getBoolean("Timer.countdown");



        }
        catch (Exception e) {
            createConfiguration();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void saveConfiguration() {

        try {
            //Load Variables
            Config.getConfig().set("team.Size", main.Teamsize);
            Config.getConfig().set("spawn.SpawnArea", main.SpawnArea);
            Config.getConfig().set("Playersettings.keepinventory", main.keepinventory);
            Config.getConfig().set("Playersettings.hunger", main.hunger);
            Config.getConfig().set("Playersettings.damage", main.damage);

            Config.getConfig().set("difficulty.1", main.s1);
            Config.getConfig().set("difficulty.2", main.s2);
            Config.getConfig().set("difficulty.3", main.s3);
            Config.getConfig().set("difficulty.4", main.s4);
            Config.getConfig().set("difficulty.5", main.s5);
            Config.getConfig().set("difficulty.6", main.s6);
            Config.getConfig().set("difficulty.7", main.s7);
            Config.getConfig().set("difficulty.8", main.s8);
            Config.getConfig().set("difficulty.9", main.s9);
            Config.getConfig().set("difficulty.10", main.s10);
            Config.getConfig().set("difficulty.11", main.s11);
            Config.getConfig().set("difficulty.12", main.s12);
            Config.getConfig().set("difficulty.13", main.s13);
            Config.getConfig().set("difficulty.14", main.s14);
            Config.getConfig().set("difficulty.15", main.s15);
            Config.getConfig().set("difficulty.16", main.s16);
            Config.getConfig().set("difficulty.17", main.s17);
            Config.getConfig().set("difficulty.18", main.s18);
            //Filters
            Config.getConfig().set("filter.1", main.f1);
            //Enchantments
            Config.getConfig().set("RandomEnchantment.Chance", RandomEnchantment.Wahrscheinlichkeit);
            //Timer
            Config.getConfig().set("Timer.hours", main.hours);
            Config.getConfig().set("Timer.minutes", main.minutes);
            Config.getConfig().set("Timer.seconds", main.seconds);
            Config.getConfig().set("Timer.pause", main.timerpause);
            Config.getConfig().set("Timer.countdown", main.timercountdown);


            //Save yml
            Config.yml.save(Config.file);
        }
        catch (Exception e) {
            createConfiguration();
            e.printStackTrace();
        }
    }

    public static boolean createConfiguration() {
        try {
            new File("plugins/Bingo/").mkdirs();
            Config.file.createNewFile();

            //Set Variables
            Config.yml.set("reset.Reset", false);
            Config.yml.set("team.Size", 2);
            Config.yml.set("spawn.SpawnArea", 100);
            Config.yml.set("Playersettings.keepinventory", false);
            Config.yml.set("Playersettings.hunger", false);
            Config.yml.set("Playersettings.damage", false);

            //Dificulties
            Config.yml.set("difficulty.1", false);
            Config.yml.set("difficulty.2", false);
            Config.yml.set("difficulty.3", false);
            Config.yml.set("difficulty.4", false);
            Config.yml.set("difficulty.5", false);
            Config.yml.set("difficulty.6", false);
            Config.yml.set("difficulty.7", false);
            Config.yml.set("difficulty.8", false);
            Config.yml.set("difficulty.9", false);
            Config.yml.set("difficulty.10", false);
            Config.yml.set("difficulty.11", false);
            Config.yml.set("difficulty.12", false);
            Config.yml.set("difficulty.13", false);
            Config.yml.set("difficulty.14", false);
            Config.yml.set("difficulty.15", false);
            Config.yml.set("difficulty.16", false);
            Config.yml.set("difficulty.17", false);
            Config.yml.set("difficulty.18", false);
            //Filters
            Config.yml.set("filter.1", false);
            //Enchantments
            Config.yml.set("RandomEnchantment.Chance", 0.00);
            //Timer
            Config.yml.set("Timer.hours", 0);
            Config.yml.set("Timer.minutes", 10);
            Config.yml.set("Timer.seconds", 0);
            Config.yml.set("Timer.pause", false);
            Config.yml.set("Timer.countdown", false);




            //Save Yml
            Config.yml.save(Config.file);
            Config.configCreated = true;
            Bukkit.getConsoleSender().sendMessage("Configuration File successfully created!");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            Bukkit.getConsoleSender().sendMessage("Configuration File could not be created. => Server Restarting!");
            Bukkit.spigot().restart();
            return false;
        }
    }

    public static File getFile() {
        return Config.file;
    }

    public static YamlConfiguration getConfig() {
        return Config.yml;
    }


}
