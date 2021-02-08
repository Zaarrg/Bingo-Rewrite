package main;

import commands.*;
import config.Config;
import config.data;
import listeners.listeners;
import listeners.onInteract;
import listeners.onBlock;
import listeners.onClick;
import listeners.onDamage;
import listeners.onJoin;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import reset.reset;
import config.ConfigLanguage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.UUID;


public final class main extends JavaPlugin {

    //Liste der Spieler in Teams
    public static ArrayList<Player> t1;
    public static ArrayList<Player> t2;
    public static ArrayList<Player> t3;
    public static ArrayList<Player> t4;
    public static ArrayList<Player> t5;
    public static ArrayList<Player> t6;
    public static ArrayList<Player> t7;
    public static ArrayList<Player> t8;
    public static ArrayList<Player> t9;

    //Leave Player List
    public static ArrayList<UUID> l1;
    public static ArrayList<UUID> l2;
    public static ArrayList<UUID> l3;
    public static ArrayList<UUID> l4;
    public static ArrayList<UUID> l5;
    public static ArrayList<UUID> l6;
    public static ArrayList<UUID> l7;
    public static ArrayList<UUID> l8;
    public static ArrayList<UUID> l9;


    //Winner Names
    public static String winner1;
    public static String winner2;

    //Timers
    public static int Restartseconds;

    //Some Varaiables to check
    public static boolean GameStarted;
    public static boolean LobbyStatus;
    public static boolean randomized;
    public static boolean isRestarting;
    public static int Teamsize;
    public static int SpawnArea;
    public static int players;
    public static int spectator;
    private static main instance;
    public static boolean savegame;


    //ItemList
    public static HashSet<ItemStack> itemlist;
    public static ArrayList<ItemStack> items;

    //Bingo Items
    public static ItemStack b1;
    public static ItemStack b2;
    public static ItemStack b3;
    public static ItemStack b4;
    public static ItemStack b5;
    public static ItemStack b6;
    public static ItemStack b7;
    public static ItemStack b8;
    public static ItemStack b9;

    //Amount of Items Got By Teams
    public static int gotitems1;
    public static int gotitems2;
    public static int gotitems3;
    public static int gotitems4;
    public static int gotitems5;
    public static int gotitems6;
    public static int gotitems7;
    public static int gotitems8;
    public static int gotitems9;

    //Items Got by Teams List
    public static ArrayList<ItemStack> foundItemsT1;
    public static ArrayList<ItemStack> foundItemsT2;
    public static ArrayList<ItemStack> foundItemsT3;
    public static ArrayList<ItemStack> foundItemsT4;
    public static ArrayList<ItemStack> foundItemsT5;
    public static ArrayList<ItemStack> foundItemsT6;
    public static ArrayList<ItemStack> foundItemsT7;
    public static ArrayList<ItemStack> foundItemsT8;
    public static ArrayList<ItemStack> foundItemsT9;

    //Detailed Items got by Teams
    public static boolean b1t1;
    public static boolean b2t1;
    public static boolean b3t1;
    public static boolean b4t1;
    public static boolean b5t1;
    public static boolean b6t1;
    public static boolean b7t1;
    public static boolean b8t1;
    public static boolean b9t1;
    public static boolean b1t2;
    public static boolean b2t2;
    public static boolean b3t2;
    public static boolean b4t2;
    public static boolean b5t2;
    public static boolean b6t2;
    public static boolean b7t2;
    public static boolean b8t2;
    public static boolean b9t2;
    public static boolean b1t3;
    public static boolean b2t3;
    public static boolean b3t3;
    public static boolean b4t3;
    public static boolean b5t3;
    public static boolean b6t3;
    public static boolean b7t3;
    public static boolean b8t3;
    public static boolean b9t3;
    public static boolean b1t4;
    public static boolean b2t4;
    public static boolean b3t4;
    public static boolean b4t4;
    public static boolean b5t4;
    public static boolean b6t4;
    public static boolean b7t4;
    public static boolean b8t4;
    public static boolean b9t4;
    public static boolean b1t5;
    public static boolean b2t5;
    public static boolean b3t5;
    public static boolean b4t5;
    public static boolean b5t5;
    public static boolean b6t5;
    public static boolean b7t5;
    public static boolean b8t5;
    public static boolean b9t5;
    public static boolean b1t6;
    public static boolean b2t6;
    public static boolean b3t6;
    public static boolean b4t6;
    public static boolean b5t6;
    public static boolean b6t6;
    public static boolean b7t6;
    public static boolean b8t6;
    public static boolean b9t6;
    public static boolean b1t7;
    public static boolean b2t7;
    public static boolean b3t7;
    public static boolean b4t7;
    public static boolean b5t7;
    public static boolean b6t7;
    public static boolean b7t7;
    public static boolean b8t7;
    public static boolean b9t7;
    public static boolean b1t8;
    public static boolean b2t8;
    public static boolean b3t8;
    public static boolean b4t8;
    public static boolean b5t8;
    public static boolean b6t8;
    public static boolean b7t8;
    public static boolean b8t8;
    public static boolean b9t8;
    public static boolean b1t9;
    public static boolean b2t9;
    public static boolean b3t9;
    public static boolean b4t9;
    public static boolean b5t9;
    public static boolean b6t9;
    public static boolean b7t9;
    public static boolean b8t9;
    public static boolean b9t9;

    //Timer
    public static boolean timercountdown;
    public static int hours;
    public static int minutes;
    public static int seconds;
    public static String MM;
    public static String SS;
    public static String HH;
    public static boolean timerpause;

    //Scoreboard Colors
    public static ChatColor ColorGrayb1t1;
    public static ChatColor ColorGrayb2t1;
    public static ChatColor ColorGrayb3t1;
    public static ChatColor ColorGrayb4t1;
    public static ChatColor ColorGrayb5t1;
    public static ChatColor ColorGrayb6t1;
    public static ChatColor ColorGrayb7t1;
    public static ChatColor ColorGrayb8t1;
    public static ChatColor ColorGrayb9t1;
    public static ChatColor ColorGrayb1t2;
    public static ChatColor ColorGrayb2t2;
    public static ChatColor ColorGrayb3t2;
    public static ChatColor ColorGrayb4t2;
    public static ChatColor ColorGrayb5t2;
    public static ChatColor ColorGrayb6t2;
    public static ChatColor ColorGrayb7t2;
    public static ChatColor ColorGrayb8t2;
    public static ChatColor ColorGrayb9t2;
    public static ChatColor ColorGrayb1t3;
    public static ChatColor ColorGrayb2t3;
    public static ChatColor ColorGrayb3t3;
    public static ChatColor ColorGrayb4t3;
    public static ChatColor ColorGrayb5t3;
    public static ChatColor ColorGrayb6t3;
    public static ChatColor ColorGrayb7t3;
    public static ChatColor ColorGrayb8t3;
    public static ChatColor ColorGrayb9t3;
    public static ChatColor ColorGrayb1t4;
    public static ChatColor ColorGrayb2t4;
    public static ChatColor ColorGrayb3t4;
    public static ChatColor ColorGrayb4t4;
    public static ChatColor ColorGrayb5t4;
    public static ChatColor ColorGrayb6t4;
    public static ChatColor ColorGrayb7t4;
    public static ChatColor ColorGrayb8t4;
    public static ChatColor ColorGrayb9t4;
    public static ChatColor ColorGrayb1t5;
    public static ChatColor ColorGrayb2t5;
    public static ChatColor ColorGrayb3t5;
    public static ChatColor ColorGrayb4t5;
    public static ChatColor ColorGrayb5t5;
    public static ChatColor ColorGrayb6t5;
    public static ChatColor ColorGrayb7t5;
    public static ChatColor ColorGrayb8t5;
    public static ChatColor ColorGrayb9t5;
    public static ChatColor ColorGrayb1t6;
    public static ChatColor ColorGrayb2t6;
    public static ChatColor ColorGrayb3t6;
    public static ChatColor ColorGrayb4t6;
    public static ChatColor ColorGrayb5t6;
    public static ChatColor ColorGrayb6t6;
    public static ChatColor ColorGrayb7t6;
    public static ChatColor ColorGrayb8t6;
    public static ChatColor ColorGrayb9t6;
    public static ChatColor ColorGrayb1t7;
    public static ChatColor ColorGrayb2t7;
    public static ChatColor ColorGrayb3t7;
    public static ChatColor ColorGrayb4t7;
    public static ChatColor ColorGrayb5t7;
    public static ChatColor ColorGrayb6t7;
    public static ChatColor ColorGrayb7t7;
    public static ChatColor ColorGrayb8t7;
    public static ChatColor ColorGrayb9t7;
    public static ChatColor ColorGrayb1t8;
    public static ChatColor ColorGrayb2t8;
    public static ChatColor ColorGrayb3t8;
    public static ChatColor ColorGrayb4t8;
    public static ChatColor ColorGrayb5t8;
    public static ChatColor ColorGrayb6t8;
    public static ChatColor ColorGrayb7t8;
    public static ChatColor ColorGrayb8t8;
    public static ChatColor ColorGrayb9t8;
    public static ChatColor ColorGrayb1t9;
    public static ChatColor ColorGrayb2t9;
    public static ChatColor ColorGrayb3t9;
    public static ChatColor ColorGrayb4t9;
    public static ChatColor ColorGrayb5t9;
    public static ChatColor ColorGrayb6t9;
    public static ChatColor ColorGrayb7t9;
    public static ChatColor ColorGrayb8t9;
    public static ChatColor ColorGrayb9t9;

    //Scoreboard Random Items(IDK)
    public static boolean s1;
    public static boolean s2;
    public static boolean s3;
    public static boolean s4;
    public static boolean s5;
    public static boolean s6;
    public static boolean s7;
    public static boolean s8;
    public static boolean s9;
    public static boolean s10;
    public static boolean s11;
    public static boolean s12;
    public static boolean s13;
    public static boolean s14;
    public static boolean s15;
    public static boolean s16;
    public static boolean s17;
    public static boolean s18;
    public static boolean f1;


    //Settings
    public static boolean damage;
    public static boolean hunger;
    public static boolean keepinventory;





    public static void defaultstatics() {
        //Liste der Spieler in Teams
        main.t1 = new ArrayList<Player>();
        main.t2 = new ArrayList<Player>();
        main.t3 = new ArrayList<Player>();
        main.t4 = new ArrayList<Player>();
        main.t5 = new ArrayList<Player>();
        main.t6 = new ArrayList<Player>();
        main.t7 = new ArrayList<Player>();
        main.t8 = new ArrayList<Player>();
        main.t9 = new ArrayList<Player>();

        //Rejoin Teams
        main.l1 = new ArrayList<UUID>();
        main.l2 = new ArrayList<UUID>();
        main.l3 = new ArrayList<UUID>();
        main.l4 = new ArrayList<UUID>();
        main.l5 = new ArrayList<UUID>();
        main.l6 = new ArrayList<UUID>();
        main.l7 = new ArrayList<UUID>();
        main.l8 = new ArrayList<UUID>();
        main.l9 = new ArrayList<UUID>();

        //Timers
        main.Restartseconds = 20;

        //Some Varaibles to Check
        main.GameStarted = false;
        main.LobbyStatus = true;
        main.randomized = false;
        main.isRestarting = false;
        main.players = 0;
        main.spectator = 0;
        main.SpawnArea = 100;
        main.Teamsize = 2;
        main.savegame = false;

        //Itemlist
        main.itemlist = new HashSet<ItemStack>();
        main.items = new ArrayList<ItemStack>();

        //Found Items by Teams list
        main.foundItemsT1 = new ArrayList<ItemStack>();
        main.foundItemsT2 = new ArrayList<ItemStack>();
        main.foundItemsT3 = new ArrayList<ItemStack>();
        main.foundItemsT4 = new ArrayList<ItemStack>();
        main.foundItemsT5 = new ArrayList<ItemStack>();
        main.foundItemsT6 = new ArrayList<ItemStack>();
        main.foundItemsT7 = new ArrayList<ItemStack>();
        main.foundItemsT8 = new ArrayList<ItemStack>();
        main.foundItemsT9 = new ArrayList<ItemStack>();

        //Detailed Items Got by Teams
        main.b1t1 = false;
        main.b2t1 = false;
        main.b3t1 = false;
        main.b4t1 = false;
        main.b5t1 = false;
        main.b6t1 = false;
        main.b7t1 = false;
        main.b8t1 = false;
        main.b9t1 = false;
        main.b1t2 = false;
        main.b2t2 = false;
        main.b3t2 = false;
        main.b4t2 = false;
        main.b5t2 = false;
        main.b6t2 = false;
        main.b7t2 = false;
        main.b8t2 = false;
        main.b9t2 = false;
        main.b1t3 = false;
        main.b2t3 = false;
        main.b3t3 = false;
        main.b4t3 = false;
        main.b5t3 = false;
        main.b6t3 = false;
        main.b7t3 = false;
        main.b8t3 = false;
        main.b9t3 = false;
        main.b1t4 = false;
        main.b2t4 = false;
        main.b3t4 = false;
        main.b4t4 = false;
        main.b5t4 = false;
        main.b6t4 = false;
        main.b7t4 = false;
        main.b8t4 = false;
        main.b9t4 = false;
        main.b1t5 = false;
        main.b2t5 = false;
        main.b3t5 = false;
        main.b4t5 = false;
        main.b5t5 = false;
        main.b6t5 = false;
        main.b7t5 = false;
        main.b8t5 = false;
        main.b9t5 = false;
        main.b1t6 = false;
        main.b2t6 = false;
        main.b3t6 = false;
        main.b4t6 = false;
        main.b5t6 = false;
        main.b6t6 = false;
        main.b7t6 = false;
        main.b8t6 = false;
        main.b9t6 = false;
        main.b1t7 = false;
        main.b2t7 = false;
        main.b3t7 = false;
        main.b4t7 = false;
        main.b5t7 = false;
        main.b6t7 = false;
        main.b7t7 = false;
        main.b8t7 = false;
        main.b9t7 = false;
        main.b1t8 = false;
        main.b2t8 = false;
        main.b3t8 = false;
        main.b4t8 = false;
        main.b5t8 = false;
        main.b6t8 = false;
        main.b7t8 = false;
        main.b8t8 = false;
        main.b9t8 = false;
        main.b1t9 = false;
        main.b2t9 = false;
        main.b3t9 = false;
        main.b4t9 = false;
        main.b5t9 = false;
        main.b6t9 = false;
        main.b7t9 = false;
        main.b8t9 = false;
        main.b9t9 = false;

        //Timer
        main.timercountdown = false;
        main.hours = 0;
        main.minutes = 10;
        main.seconds = 0;
        main.MM = "Minuten";
        main.SS = "Sekunden";
        main.HH = "Stunden";
        main.timerpause = false;

        //Scoreboard Colors
        main.ColorGrayb1t1 = ChatColor.GRAY;
        main.ColorGrayb2t1 = ChatColor.GRAY;
        main.ColorGrayb3t1 = ChatColor.GRAY;
        main.ColorGrayb4t1 = ChatColor.GRAY;
        main.ColorGrayb5t1 = ChatColor.GRAY;
        main.ColorGrayb6t1 = ChatColor.GRAY;
        main.ColorGrayb7t1 = ChatColor.GRAY;
        main.ColorGrayb8t1 = ChatColor.GRAY;
        main.ColorGrayb9t1 = ChatColor.GRAY;
        main.ColorGrayb1t2 = ChatColor.GRAY;
        main.ColorGrayb2t2 = ChatColor.GRAY;
        main.ColorGrayb3t2 = ChatColor.GRAY;
        main.ColorGrayb4t2 = ChatColor.GRAY;
        main.ColorGrayb5t2 = ChatColor.GRAY;
        main.ColorGrayb6t2 = ChatColor.GRAY;
        main.ColorGrayb7t2 = ChatColor.GRAY;
        main.ColorGrayb8t2 = ChatColor.GRAY;
        main.ColorGrayb9t2 = ChatColor.GRAY;
        main.ColorGrayb1t3 = ChatColor.GRAY;
        main.ColorGrayb2t3 = ChatColor.GRAY;
        main.ColorGrayb3t3 = ChatColor.GRAY;
        main.ColorGrayb4t3 = ChatColor.GRAY;
        main.ColorGrayb5t3 = ChatColor.GRAY;
        main.ColorGrayb6t3 = ChatColor.GRAY;
        main.ColorGrayb7t3 = ChatColor.GRAY;
        main.ColorGrayb8t3 = ChatColor.GRAY;
        main.ColorGrayb9t3 = ChatColor.GRAY;
        main.ColorGrayb1t4 = ChatColor.GRAY;
        main.ColorGrayb2t4 = ChatColor.GRAY;
        main.ColorGrayb3t4 = ChatColor.GRAY;
        main.ColorGrayb4t4 = ChatColor.GRAY;
        main.ColorGrayb5t4 = ChatColor.GRAY;
        main.ColorGrayb6t4 = ChatColor.GRAY;
        main.ColorGrayb7t4 = ChatColor.GRAY;
        main.ColorGrayb8t4 = ChatColor.GRAY;
        main.ColorGrayb9t4 = ChatColor.GRAY;
        main.ColorGrayb1t5 = ChatColor.GRAY;
        main.ColorGrayb2t5 = ChatColor.GRAY;
        main.ColorGrayb3t5 = ChatColor.GRAY;
        main.ColorGrayb4t5 = ChatColor.GRAY;
        main.ColorGrayb5t5 = ChatColor.GRAY;
        main.ColorGrayb6t5 = ChatColor.GRAY;
        main.ColorGrayb7t5 = ChatColor.GRAY;
        main.ColorGrayb8t5 = ChatColor.GRAY;
        main.ColorGrayb9t5 = ChatColor.GRAY;
        main.ColorGrayb1t6 = ChatColor.GRAY;
        main.ColorGrayb2t6 = ChatColor.GRAY;
        main.ColorGrayb3t6 = ChatColor.GRAY;
        main.ColorGrayb4t6 = ChatColor.GRAY;
        main.ColorGrayb5t6 = ChatColor.GRAY;
        main.ColorGrayb6t6 = ChatColor.GRAY;
        main.ColorGrayb7t6 = ChatColor.GRAY;
        main.ColorGrayb8t6 = ChatColor.GRAY;
        main.ColorGrayb9t6 = ChatColor.GRAY;
        main.ColorGrayb1t7 = ChatColor.GRAY;
        main.ColorGrayb2t7 = ChatColor.GRAY;
        main.ColorGrayb3t7 = ChatColor.GRAY;
        main.ColorGrayb4t7 = ChatColor.GRAY;
        main.ColorGrayb5t7 = ChatColor.GRAY;
        main.ColorGrayb6t7 = ChatColor.GRAY;
        main.ColorGrayb7t7 = ChatColor.GRAY;
        main.ColorGrayb8t7 = ChatColor.GRAY;
        main.ColorGrayb9t7 = ChatColor.GRAY;
        main.ColorGrayb1t8 = ChatColor.GRAY;
        main.ColorGrayb2t8 = ChatColor.GRAY;
        main.ColorGrayb3t8 = ChatColor.GRAY;
        main.ColorGrayb4t8 = ChatColor.GRAY;
        main.ColorGrayb5t8 = ChatColor.GRAY;
        main.ColorGrayb6t8 = ChatColor.GRAY;
        main.ColorGrayb7t8 = ChatColor.GRAY;
        main.ColorGrayb8t8 = ChatColor.GRAY;
        main.ColorGrayb9t8 = ChatColor.GRAY;
        main.ColorGrayb1t9 = ChatColor.GRAY;
        main.ColorGrayb2t9 = ChatColor.GRAY;
        main.ColorGrayb3t9 = ChatColor.GRAY;
        main.ColorGrayb4t9 = ChatColor.GRAY;
        main.ColorGrayb5t9 = ChatColor.GRAY;
        main.ColorGrayb6t9 = ChatColor.GRAY;
        main.ColorGrayb7t9 = ChatColor.GRAY;
        main.ColorGrayb8t9 = ChatColor.GRAY;
        main.ColorGrayb9t9 = ChatColor.GRAY;

        //Scoreboard Items(IDK)
        main.s1 = false;
        main.s2 = false;
        main.s3 = false;
        main.s4 = false;
        main.s5 = false;
        main.s6 = false;
        main.s7 = false;
        main.s8 = false;
        main.s9 = false;
        main.s10 = false;
        main.s11 = false;
        main.s12 = false;
        main.s13 = false;
        main.s14 = false;
        main.s15 = false;
        main.s16 = false;
        main.s17 = false;
        main.s18 = false;
        main.f1 = false;
    }


    public static main getPlugin() {
        return main.instance;
    }

    public static void setBorder() {
        final WorldBorder wb = Bukkit.getWorld("world").getWorldBorder();
        wb.setCenter(0.0, 0.0);
        wb.setSize(8000.0, 8000L);
        wb.setWarningTime(5);
        wb.setDamageAmount(0.5);
    }

    public static void timerreset() {
        if (!main.timercountdown) {
            main.hours = 0;
            main.minutes = 0;
            main.seconds = 0;
        } else if (main.timercountdown) {
            main.hours = 0;
            main.minutes = 10;
            main.seconds = 0;
        }
    }

    public static void setValuesDefault() {
        main.randomized = false;
        main.gotitems1 = 0;
        main.gotitems2 = 0;
        main.gotitems3 = 0;
        main.gotitems4 = 0;
        main.gotitems5 = 0;
        main.gotitems6 = 0;
        main.gotitems7 = 0;
        main.gotitems8 = 0;
        main.gotitems9 = 0;
        main.b1t1 = false;
        main.b2t1 = false;
        main.b3t1 = false;
        main.b4t1 = false;
        main.b5t1 = false;
        main.b6t1 = false;
        main.b7t1 = false;
        main.b8t1 = false;
        main.b9t1 = false;
        main.b1t2 = false;
        main.b2t2 = false;
        main.b3t2 = false;
        main.b4t2 = false;
        main.b5t2 = false;
        main.b6t2 = false;
        main.b7t2 = false;
        main.b8t2 = false;
        main.b9t2 = false;
        main.b1t3 = false;
        main.b2t3 = false;
        main.b3t3 = false;
        main.b4t3 = false;
        main.b5t3 = false;
        main.b6t3 = false;
        main.b7t3 = false;
        main.b8t3 = false;
        main.b9t3 = false;
        main.b1t4 = false;
        main.b2t4 = false;
        main.b3t4 = false;
        main.b4t4 = false;
        main.b5t4 = false;
        main.b6t4 = false;
        main.b7t4 = false;
        main.b8t4 = false;
        main.b9t4 = false;
        main.b1t5 = false;
        main.b2t5 = false;
        main.b3t5 = false;
        main.b4t5 = false;
        main.b5t5 = false;
        main.b6t5 = false;
        main.b7t5 = false;
        main.b8t5 = false;
        main.b9t5 = false;
        main.b1t6 = false;
        main.b2t6 = false;
        main.b3t6 = false;
        main.b4t6 = false;
        main.b5t6 = false;
        main.b6t6 = false;
        main.b7t6 = false;
        main.b8t6 = false;
        main.b9t6 = false;
        main.b1t7 = false;
        main.b2t7 = false;
        main.b3t7 = false;
        main.b4t7 = false;
        main.b5t7 = false;
        main.b6t7 = false;
        main.b7t7 = false;
        main.b8t7 = false;
        main.b9t7 = false;
        main.b1t8 = false;
        main.b2t8 = false;
        main.b3t8 = false;
        main.b4t8 = false;
        main.b5t8 = false;
        main.b6t8 = false;
        main.b7t8 = false;
        main.b8t8 = false;
        main.b9t8 = false;
        main.b1t9 = false;
        main.b2t9 = false;
        main.b3t9 = false;
        main.b4t9 = false;
        main.b5t9 = false;
        main.b6t9 = false;
        main.b7t9 = false;
        main.b8t9 = false;
        main.b9t9 = false;
        main.winner1 = null;
        main.winner2 = null;
        main.t1.clear();
        main.t2.clear();
        main.t3.clear();
        main.t4.clear();
        main.t5.clear();
        main.t6.clear();
        main.t7.clear();
        main.t8.clear();
        main.t9.clear();
        main.foundItemsT1.clear();
        main.foundItemsT2.clear();
        main.foundItemsT3.clear();
        main.foundItemsT4.clear();
        main.foundItemsT5.clear();
        main.foundItemsT6.clear();
        main.foundItemsT7.clear();
        main.foundItemsT8.clear();
        main.foundItemsT9.clear();
    }



    @Override
    public void onLoad() {

        Config.loadConfiguration();
        ConfigLanguage.loadLanguageConfiguration();
        defaultstatics();

            if (Config.getConfig().contains("reset.Reset") && Config.getConfig().getBoolean("reset.Reset")) {
                Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "World is Reseting!");
                reset.reset();
            } else {
                Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_RED + "World is not Reseting!");
            }
    }


    public static void clearTeams() {

        main.t1.clear();
        main.t2.clear();
        main.t3.clear();
        main.t4.clear();
        main.t5.clear();
        main.t6.clear();
        main.t7.clear();
        main.t8.clear();
        main.t9.clear();

        main.l1.clear();
        main.l2.clear();
        main.l3.clear();
        main.l4.clear();
        main.l5.clear();
        main.l6.clear();
        main.l7.clear();
        main.l8.clear();
        main.l9.clear();
    }


    @Override
    public void onEnable() {
        // Plugin startup logic
            //Clear Player Teams
            clearTeams();
            //Set World Border
            setBorder();
            //Reset Timer
            timerreset();


        //Register Commands
        getCommand("bingopl").setExecutor(new Bingo_guide());
        getCommand("bingorestart").setExecutor(new Bingo_restart());
        getCommand("top").setExecutor(new Bingo_top());
        getCommand("bingo").setExecutor(new Bingo());
        getCommand("start").setExecutor(new Start());
        getCommand("teams").setExecutor(new teams());
        getCommand("brestart").setExecutor(new Restart());
        getCommand("settings").setExecutor(new settings());
        getCommand("save").setExecutor(new Save());
        getCommand("reset").setExecutor(new Reset());


        //Listeners
        getServer().getPluginManager().registerEvents(new listeners(), this);

        getServer().getPluginManager().registerEvents(new onBlock(), this);
        getServer().getPluginManager().registerEvents(new onClick(), this);
        getServer().getPluginManager().registerEvents(new onDamage(), this);
        getServer().getPluginManager().registerEvents(new onInteract(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);



        Bukkit.getConsoleSender().sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("pluginstarted"));

    }

    public void checkteam(Player e) {
        if (e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
            if (main.t1.contains(e.getPlayer())) {
                main.t1.remove(e.getPlayer());
                main.l1.add(e.getPlayer().getUniqueId());
                Bukkit.broadcastMessage("Player Kicked Team 1");
            } else if (main.t2.contains(e.getPlayer())) {
                main.t2.remove(e.getPlayer());
                main.l2.add(e.getPlayer().getUniqueId());
            } else if (main.t3.contains(e.getPlayer())) {
                main.t3.remove(e.getPlayer());
                main.l3.add(e.getPlayer().getUniqueId());
            } else if (main.t4.contains(e.getPlayer())) {
                main.t4.remove(e.getPlayer());
                main.l4.add(e.getPlayer().getUniqueId());
            } else if (main.t5.contains(e.getPlayer())) {
                main.t5.remove(e.getPlayer());
                main.l5.add(e.getPlayer().getUniqueId());
            } else if (main.t6.contains(e.getPlayer())) {
                main.t6.remove(e.getPlayer());
                main.l6.add(e.getPlayer().getUniqueId());
            } else if (main.t7.contains(e.getPlayer())) {
                main.t7.remove(e.getPlayer());
                main.l7.add(e.getPlayer().getUniqueId());
            } else if (main.t8.contains(e.getPlayer())) {
                main.t8.remove(e.getPlayer());
                main.l8.add(e.getPlayer().getUniqueId());
            } else if (main.t9.contains(e.getPlayer())) {
                main.t9.remove(e.getPlayer());
                main.l9.add(e.getPlayer().getUniqueId());
            }
        }
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        for (Player aplayer : Bukkit.getOnlinePlayers()) {
            aplayer.kickPlayer(ChatColor.GREEN + "Server Stopping");
        }


        try {
            Config.saveConfiguration();
            Config.getConfig().save(Config.getFile());
            ConfigLanguage.getConfig().save(ConfigLanguage.getFile());
            Bukkit.getConsoleSender().sendMessage(ConfigLanguage.getString("prefix") + " " + ChatColor.GREEN + "Config Saved");
        } catch (IOException e) {
            Bukkit.getConsoleSender().sendMessage(ConfigLanguage.getString("prefix") + " " + ChatColor.RED + "Config could not be Saved");
            e.printStackTrace();
        }

        if (Config.getConfig().contains("reset.Reset") && Config.getConfig().getBoolean("reset.Reset")) {
            //Unload worlds if Reset
            Bukkit.getServer().unloadWorld("world", false);
            Bukkit.getServer().unloadWorld("world_nether", false);
            Bukkit.getServer().unloadWorld("world_the_end", false);
        }


        Bukkit.getConsoleSender().sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("pluginstopped"));
    }
}
