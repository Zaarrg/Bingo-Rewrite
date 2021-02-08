package config;

import main.main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class data {

        private static File file;
        private static YamlConfiguration yml;
        public static boolean setup;
        public static boolean configCreated;

        static {
            data.file = new File("plugins/Bingo/", "data.yml");
            data.yml = YamlConfiguration.loadConfiguration(data.file);
            data.setup = false;
            data.configCreated = false;
        }

        public static boolean loadConfiguration() {

            if (!data.file.exists()) {
                //Create Config if no existing
                createConfiguration();
            }

            try {
                //Load Variables
                //SaveGame
                Bukkit.broadcastMessage(ChatColor.RED + "LOADING SAVEGAME");

                main.GameStarted = data.getConfig().getBoolean("Game.started");
                main.savegame = data.getConfig().getBoolean("Game.saved");
                //Bingo items
                main.b1 = data.getConfig().getItemStack("Items.b1");
                main.b2 = data.getConfig().getItemStack("Items.b2");
                main.b3 = data.getConfig().getItemStack("Items.b3");
                main.b4 = data.getConfig().getItemStack("Items.b4");
                main.b5 = data.getConfig().getItemStack("Items.b5");
                main.b6 = data.getConfig().getItemStack("Items.b6");
                main.b7 = data.getConfig().getItemStack("Items.b7");
                main.b8 = data.getConfig().getItemStack("Items.b8");
                main.b9 = data.getConfig().getItemStack("Items.b9");

                //Player List Teams
                main.t1 = (ArrayList<Player>) data.getConfig().getList("Teams.t1");
                main.t2 = (ArrayList<Player>) data.getConfig().getList("Teams.t2");
                main.t3 = (ArrayList<Player>) data.getConfig().getList("Teams.t3");
                main.t4 = (ArrayList<Player>) data.getConfig().getList("Teams.t4");
                main.t5 = (ArrayList<Player>) data.getConfig().getList("Teams.t5");
                main.t6 = (ArrayList<Player>) data.getConfig().getList("Teams.t6");
                main.t7 = (ArrayList<Player>) data.getConfig().getList("Teams.t7");
                main.t8 = (ArrayList<Player>) data.getConfig().getList("Teams.t8");
                main.t9 = (ArrayList<Player>) data.getConfig().getList("Teams.t9");

                //Leaver List
                main.l1 = exportUUID(data.getConfig().getString("Teams.Leaver.l1"));
                main.l2 = exportUUID(data.getConfig().getString("Teams.Leaver.l2"));
                main.l3 = exportUUID(data.getConfig().getString("Teams.Leaver.l3"));
                main.l4 = exportUUID(data.getConfig().getString("Teams.Leaver.l4"));
                main.l5 = exportUUID(data.getConfig().getString("Teams.Leaver.l5"));
                main.l6 = exportUUID(data.getConfig().getString("Teams.Leaver.l6"));
                main.l7 = exportUUID(data.getConfig().getString("Teams.Leaver.l7"));
                main.l8 = exportUUID(data.getConfig().getString("Teams.Leaver.l8"));
                main.l9 = exportUUID(data.getConfig().getString("Teams.Leaver.l9"));

                //Check Value
                main.LobbyStatus = data.getConfig().getBoolean("Value.lobbystatus");
                main.randomized = data.getConfig().getBoolean("Value.randomized");
                main.isRestarting = data.getConfig().getBoolean("Value.isRestarting");
                main.players = data.getConfig().getInt("Value.players");
                main.spectator = data.getConfig().getInt("Value.spectator");


                //Amount of Items Got by Teams
                main.gotitems1 = data.getConfig().getInt("Items.gotitems1");
                main.gotitems2 = data.getConfig().getInt("Items.gotitems2");
                main.gotitems3 = data.getConfig().getInt("Items.gotitems3");
                main.gotitems4 = data.getConfig().getInt("Items.gotitems4");
                main.gotitems5 = data.getConfig().getInt("Items.gotitems5");
                main.gotitems6 = data.getConfig().getInt("Items.gotitems6");
                main.gotitems7 = data.getConfig().getInt("Items.gotitems7");
                main.gotitems8 = data.getConfig().getInt("Items.gotitems8");
                main.gotitems9 = data.getConfig().getInt("Items.gotitems9");


                //Items Got by Teams
                main.foundItemsT1 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT1");
                main.foundItemsT2 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT2");
                main.foundItemsT3 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT3");
                main.foundItemsT4 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT4");
                main.foundItemsT5 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT5");
                main.foundItemsT6 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT6");
                main.foundItemsT7 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT7");
                main.foundItemsT8 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT8");
                main.foundItemsT9 = (ArrayList<ItemStack>) data.getConfig().getList("Items.foundItemsT9");

                //Detailed Items Got
                //Detailed Items got by Teams
                main.b1t1 = data.getConfig().getBoolean("Items.b1t1");
                main.b2t1 = data.getConfig().getBoolean("Items.b2t1");
                main.b3t1 = data.getConfig().getBoolean("Items.b3t1");
                main.b4t1 = data.getConfig().getBoolean("Items.b4t1");
                main.b5t1 = data.getConfig().getBoolean("Items.b5t1");
                main.b6t1 = data.getConfig().getBoolean("Items.b6t1");
                main.b7t1 = data.getConfig().getBoolean("Items.b7t1");
                main.b8t1 = data.getConfig().getBoolean("Items.b8t1");
                main.b9t1 = data.getConfig().getBoolean("Items.b9t1");
                main.b1t2 = data.getConfig().getBoolean("Items.b1t2");
                main.b2t2 = data.getConfig().getBoolean("Items.b2t2");
                main.b3t2 = data.getConfig().getBoolean("Items.b3t2");
                main.b4t2 = data.getConfig().getBoolean("Items.b4t2");
                main.b5t2 = data.getConfig().getBoolean("Items.b5t2");
                main.b6t2 = data.getConfig().getBoolean("Items.b6t2");
                main.b7t2 = data.getConfig().getBoolean("Items.b7t2");
                main.b8t2 = data.getConfig().getBoolean("Items.b8t2");
                main.b9t2 = data.getConfig().getBoolean("Items.b9t2");
                main.b1t3 = data.getConfig().getBoolean("Items.b1t3");
                main.b2t3 = data.getConfig().getBoolean("Items.b2t3");
                main.b3t3 = data.getConfig().getBoolean("Items.b3t3");
                main.b4t3 = data.getConfig().getBoolean("Items.b4t3");
                main.b5t3 = data.getConfig().getBoolean("Items.b5t3");
                main.b6t3 = data.getConfig().getBoolean("Items.b6t3");
                main.b7t3 = data.getConfig().getBoolean("Items.b7t3");
                main.b8t3 = data.getConfig().getBoolean("Items.b8t3");
                main.b9t3 = data.getConfig().getBoolean("Items.b9t3");
                main.b1t4 = data.getConfig().getBoolean("Items.b1t4");
                main.b2t4 = data.getConfig().getBoolean("Items.b2t4");
                main.b3t4 = data.getConfig().getBoolean("Items.b3t4");
                main.b4t4 = data.getConfig().getBoolean("Items.b4t4");
                main.b5t4 = data.getConfig().getBoolean("Items.b5t4");
                main.b6t4 = data.getConfig().getBoolean("Items.b6t4");
                main.b7t4 = data.getConfig().getBoolean("Items.b7t4");
                main.b8t4 = data.getConfig().getBoolean("Items.b8t4");
                main.b9t4 = data.getConfig().getBoolean("Items.b9t4");
                main.b1t5 = data.getConfig().getBoolean("Items.b1t5");
                main.b2t5 = data.getConfig().getBoolean("Items.b2t5");
                main.b3t5 = data.getConfig().getBoolean("Items.b3t5");
                main.b4t5 = data.getConfig().getBoolean("Items.b4t5");
                main.b5t5 = data.getConfig().getBoolean("Items.b5t5");
                main.b6t5 = data.getConfig().getBoolean("Items.b6t5");
                main.b7t5 = data.getConfig().getBoolean("Items.b7t5");
                main.b8t5 = data.getConfig().getBoolean("Items.b8t5");
                main.b9t5 = data.getConfig().getBoolean("Items.b9t5");
                main.b1t6 = data.getConfig().getBoolean("Items.b1t6");
                main.b2t6 = data.getConfig().getBoolean("Items.b2t6");
                main.b3t6 = data.getConfig().getBoolean("Items.b3t6");
                main.b4t6 = data.getConfig().getBoolean("Items.b4t6");
                main.b5t6 = data.getConfig().getBoolean("Items.b5t6");
                main.b6t6 = data.getConfig().getBoolean("Items.b6t6");
                main.b7t6 = data.getConfig().getBoolean("Items.b7t6");
                main.b8t6 = data.getConfig().getBoolean("Items.b8t6");
                main.b9t6 = data.getConfig().getBoolean("Items.b9t6");
                main.b1t7 = data.getConfig().getBoolean("Items.b1t7");
                main.b2t7 = data.getConfig().getBoolean("Items.b2t7");
                main.b3t7 = data.getConfig().getBoolean("Items.b3t7");
                main.b4t7 = data.getConfig().getBoolean("Items.b4t7");
                main.b5t7 = data.getConfig().getBoolean("Items.b5t7");
                main.b6t7 = data.getConfig().getBoolean("Items.b6t7");
                main.b7t7 = data.getConfig().getBoolean("Items.b7t7");
                main.b8t7 = data.getConfig().getBoolean("Items.b8t7");
                main.b9t7 = data.getConfig().getBoolean("Items.b9t7");
                main.b1t8 = data.getConfig().getBoolean("Items.b1t8");
                main.b2t8 = data.getConfig().getBoolean("Items.b2t8");
                main.b3t8 = data.getConfig().getBoolean("Items.b3t8");
                main.b4t8 = data.getConfig().getBoolean("Items.b4t8");
                main.b5t8 = data.getConfig().getBoolean("Items.b5t8");
                main.b6t8 = data.getConfig().getBoolean("Items.b6t8");
                main.b7t8 = data.getConfig().getBoolean("Items.b7t8");
                main.b8t8 = data.getConfig().getBoolean("Items.b8t8");
                main.b9t8 = data.getConfig().getBoolean("Items.b9t8");
                main.b1t9 = data.getConfig().getBoolean("Items.b1t9");
                main.b2t9 = data.getConfig().getBoolean("Items.b2t9");
                main.b3t9 = data.getConfig().getBoolean("Items.b3t9");
                main.b4t9 = data.getConfig().getBoolean("Items.b4t9");
                main.b5t9 = data.getConfig().getBoolean("Items.b5t9");
                main.b6t9 = data.getConfig().getBoolean("Items.b6t9");
                main.b7t9 = data.getConfig().getBoolean("Items.b7t9");
                main.b8t9 = data.getConfig().getBoolean("Items.b8t9");
                main.b9t9 = data.getConfig().getBoolean("Items.b9t9");

                //Scoreboard Colors
                //Scoreboard Colors
                main.ColorGrayb1t1 = exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t1"));
                
                
                main.ColorGrayb2t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t1"));
                main.ColorGrayb3t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t1"));
                main.ColorGrayb4t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t1"));
                main.ColorGrayb5t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t1"));
                main.ColorGrayb6t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t1"));
                main.ColorGrayb7t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t1"));
                main.ColorGrayb8t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t1"));
                main.ColorGrayb9t1 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t1"));
                main.ColorGrayb1t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t2"));
                main.ColorGrayb2t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t2"));
                main.ColorGrayb3t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t2"));
                main.ColorGrayb4t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t2"));
                main.ColorGrayb5t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t2"));
                main.ColorGrayb6t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t2"));
                main.ColorGrayb7t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t2"));
                main.ColorGrayb8t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t2"));
                main.ColorGrayb9t2 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t2"));
                main.ColorGrayb1t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t3"));
                main.ColorGrayb2t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t3"));
                main.ColorGrayb3t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t3"));
                main.ColorGrayb4t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t3"));
                main.ColorGrayb5t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t3"));
                main.ColorGrayb6t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t3"));
                main.ColorGrayb7t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t3"));
                main.ColorGrayb8t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t3"));
                main.ColorGrayb9t3 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t3"));
                main.ColorGrayb1t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t4"));
                main.ColorGrayb2t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t4"));
                main.ColorGrayb3t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t4"));
                main.ColorGrayb4t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t4"));
                main.ColorGrayb5t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t4"));
                main.ColorGrayb6t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t4"));
                main.ColorGrayb7t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t4"));
                main.ColorGrayb8t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t4"));
                main.ColorGrayb9t4 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t4"));
                main.ColorGrayb1t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t5"));
                main.ColorGrayb2t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t5"));
                main.ColorGrayb3t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t5"));
                main.ColorGrayb4t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t5"));
                main.ColorGrayb5t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t5"));
                main.ColorGrayb6t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t5"));
                main.ColorGrayb7t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t5"));
                main.ColorGrayb8t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t5"));
                main.ColorGrayb9t5 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t5"));
                main.ColorGrayb1t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t6"));
                main.ColorGrayb2t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t6"));
                main.ColorGrayb3t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t6"));
                main.ColorGrayb4t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t6"));
                main.ColorGrayb5t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t6"));
                main.ColorGrayb6t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t6"));
                main.ColorGrayb7t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t6"));
                main.ColorGrayb8t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t6"));
                main.ColorGrayb9t6 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t6"));
                main.ColorGrayb1t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t7"));
                main.ColorGrayb2t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t7"));
                main.ColorGrayb3t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t7"));
                main.ColorGrayb4t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t7"));
                main.ColorGrayb5t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t7"));
                main.ColorGrayb6t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t7"));
                main.ColorGrayb7t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t7"));
                main.ColorGrayb8t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t7"));
                main.ColorGrayb9t7 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t7"));
                main.ColorGrayb1t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t8"));
                main.ColorGrayb2t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t8"));
                main.ColorGrayb3t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t8"));
                main.ColorGrayb4t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t8"));
                main.ColorGrayb5t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t8"));
                main.ColorGrayb6t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t8"));
                main.ColorGrayb7t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t8"));
                main.ColorGrayb8t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t8"));
                main.ColorGrayb9t8 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t8"));
                main.ColorGrayb1t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb1t9"));
                main.ColorGrayb2t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb2t9"));
                main.ColorGrayb3t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb3t9"));
                main.ColorGrayb4t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb4t9"));
                main.ColorGrayb5t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb5t9"));
                main.ColorGrayb6t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb6t9"));
                main.ColorGrayb7t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb7t9"));
                main.ColorGrayb8t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb8t9"));
                main.ColorGrayb9t9 =  exportChatcolor(data.getConfig().getString("Color.ColorGrayb9t9"));

                //Socreboard values
                main.s1 = data.getConfig().getBoolean("Scoreboard.s1");
                main.s2 = data.getConfig().getBoolean("Scoreboard.s2");
                main.s3 = data.getConfig().getBoolean("Scoreboard.s3");
                main.s4 = data.getConfig().getBoolean("Scoreboard.s4");
                main.s5 = data.getConfig().getBoolean("Scoreboard.s5");
                main.s6 = data.getConfig().getBoolean("Scoreboard.s6");
                main.s7 = data.getConfig().getBoolean("Scoreboard.s7");
                main.s8 = data.getConfig().getBoolean("Scoreboard.s8");
                main.s9 = data.getConfig().getBoolean("Scoreboard.s9");
                main.s10 = data.getConfig().getBoolean("Scoreboard.s10");
                main.s11 = data.getConfig().getBoolean("Scoreboard.s11");
                main.s12 = data.getConfig().getBoolean("Scoreboard.s12");
                main.s13 = data.getConfig().getBoolean("Scoreboard.s13");
                main.s14 = data.getConfig().getBoolean("Scoreboard.s14");
                main.s15 = data.getConfig().getBoolean("Scoreboard.s15");
                main.s16 = data.getConfig().getBoolean("Scoreboard.s16");
                main.s17 = data.getConfig().getBoolean("Scoreboard.s17");
                main.s18 = data.getConfig().getBoolean("Scoreboard.s18");
                main.f1 = data.getConfig().getBoolean("Scoreboard.f1");


            }
            catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            return true;
        }

        public static void saveConfiguration() {

            try {
                //Load Variables
                //Savegame
                data.getConfig().set("Game.started", main.GameStarted);
                data.getConfig().set("Game.saved", main.savegame);
                //Bingo items saved
                data.getConfig().set("Items.b1", main.b1);
                data.getConfig().set("Items.b2", main.b2);
                data.getConfig().set("Items.b3", main.b3);
                data.getConfig().set("Items.b4", main.b4);
                data.getConfig().set("Items.b5", main.b5);
                data.getConfig().set("Items.b6", main.b6);
                data.getConfig().set("Items.b7", main.b7);
                data.getConfig().set("Items.b8", main.b8);
                data.getConfig().set("Items.b9", main.b9);
                
                //Player List Teams
                data.getConfig().set("Teams.t1", main.t1);
                data.getConfig().set("Teams.t2", main.t2);
                data.getConfig().set("Teams.t3", main.t3);
                data.getConfig().set("Teams.t4", main.t4);
                data.getConfig().set("Teams.t5", main.t5);
                data.getConfig().set("Teams.t6", main.t6);
                data.getConfig().set("Teams.t7", main.t7);
                data.getConfig().set("Teams.t8", main.t8);
                data.getConfig().set("Teams.t9", main.t9);

                //Leaver List
                data.getConfig().set("Teams.Leaver.l1", convertUUID(main.l1));
                data.getConfig().set("Teams.Leaver.l2", convertUUID(main.l2));
                data.getConfig().set("Teams.Leaver.l3", convertUUID(main.l3));
                data.getConfig().set("Teams.Leaver.l4", convertUUID(main.l4));
                data.getConfig().set("Teams.Leaver.l5", convertUUID(main.l5));
                data.getConfig().set("Teams.Leaver.l6", convertUUID(main.l6));
                data.getConfig().set("Teams.Leaver.l7", convertUUID(main.l7));
                data.getConfig().set("Teams.Leaver.l8", convertUUID(main.l8));
                data.getConfig().set("Teams.Leaver.l9", convertUUID(main.l9));

                //Check Valuse
                data.getConfig().set("Value.lobbystatus", main.LobbyStatus);
                data.getConfig().set("Value.randomized", main.randomized);
                data.getConfig().set("Value.isRestarting", main.isRestarting);
                data.getConfig().set("Value.players", main.players);
                data.getConfig().set("Value.spectator", main.spectator);

                //Amount of Items Got by Teams
                data.getConfig().set("Items.gotitems1", main.gotitems1);
                data.getConfig().set("Items.gotitems2", main.gotitems2);
                data.getConfig().set("Items.gotitems3", main.gotitems3);
                data.getConfig().set("Items.gotitems4", main.gotitems4);
                data.getConfig().set("Items.gotitems5", main.gotitems5);
                data.getConfig().set("Items.gotitems6", main.gotitems6);
                data.getConfig().set("Items.gotitems7", main.gotitems7);
                data.getConfig().set("Items.gotitems8", main.gotitems8);
                data.getConfig().set("Items.gotitems9", main.gotitems9);

                //Items Got by Teams
                data.getConfig().set("Items.foundItemsT1", main.foundItemsT1);
                data.getConfig().set("Items.foundItemsT2", main.foundItemsT2);
                data.getConfig().set("Items.foundItemsT3", main.foundItemsT3);
                data.getConfig().set("Items.foundItemsT4", main.foundItemsT4);
                data.getConfig().set("Items.foundItemsT5", main.foundItemsT5);
                data.getConfig().set("Items.foundItemsT6", main.foundItemsT6);
                data.getConfig().set("Items.foundItemsT7", main.foundItemsT7);
                data.getConfig().set("Items.foundItemsT8", main.foundItemsT8);
                data.getConfig().set("Items.foundItemsT9", main.foundItemsT9);

                //Detailed Items Got
                //Detailed Items got by Teams
                data.getConfig().set("Items.b1t1", main.b1t1);
                data.getConfig().set("Items.b2t1", main.b2t1);
                data.getConfig().set("Items.b3t1", main.b3t1);
                data.getConfig().set("Items.b4t1", main.b4t1);
                data.getConfig().set("Items.b5t1", main.b5t1);
                data.getConfig().set("Items.b6t1", main.b6t1);
                data.getConfig().set("Items.b7t1", main.b7t1);
                data.getConfig().set("Items.b8t1", main.b8t1);
                data.getConfig().set("Items.b9t1", main.b9t1);
                data.getConfig().set("Items.b1t2", main.b1t2);
                data.getConfig().set("Items.b2t2", main.b2t2);
                data.getConfig().set("Items.b3t2", main.b3t2);
                data.getConfig().set("Items.b4t2", main.b4t2);
                data.getConfig().set("Items.b5t2", main.b5t2);
                data.getConfig().set("Items.b6t2", main.b6t2);
                data.getConfig().set("Items.b7t2", main.b7t2);
                data.getConfig().set("Items.b8t2", main.b8t2);
                data.getConfig().set("Items.b9t2", main.b9t2);
                data.getConfig().set("Items.b1t3", main.b1t3);
                data.getConfig().set("Items.b2t3", main.b2t3);
                data.getConfig().set("Items.b3t3", main.b3t3);
                data.getConfig().set("Items.b4t3", main.b4t3);
                data.getConfig().set("Items.b5t3", main.b5t3);
                data.getConfig().set("Items.b6t3", main.b6t3);
                data.getConfig().set("Items.b7t3", main.b7t3);
                data.getConfig().set("Items.b8t3", main.b8t3);
                data.getConfig().set("Items.b9t3", main.b9t3);
                data.getConfig().set("Items.b1t4", main.b1t4);
                data.getConfig().set("Items.b2t4", main.b2t4);
                data.getConfig().set("Items.b3t4", main.b3t4);
                data.getConfig().set("Items.b4t4", main.b4t4);
                data.getConfig().set("Items.b5t4", main.b5t4);
                data.getConfig().set("Items.b6t4", main.b6t4);
                data.getConfig().set("Items.b7t4", main.b7t4);
                data.getConfig().set("Items.b8t4", main.b8t4);
                data.getConfig().set("Items.b9t4", main.b9t4);
                data.getConfig().set("Items.b1t5", main.b1t5);
                data.getConfig().set("Items.b2t5", main.b2t5);
                data.getConfig().set("Items.b3t5", main.b3t5);
                data.getConfig().set("Items.b4t5", main.b4t5);
                data.getConfig().set("Items.b5t5", main.b5t5);
                data.getConfig().set("Items.b6t5", main.b6t5);
                data.getConfig().set("Items.b7t5", main.b7t5);
                data.getConfig().set("Items.b8t5", main.b8t5);
                data.getConfig().set("Items.b9t5", main.b9t5);
                data.getConfig().set("Items.b1t6", main.b1t6);
                data.getConfig().set("Items.b2t6", main.b2t6);
                data.getConfig().set("Items.b3t6", main.b3t6);
                data.getConfig().set("Items.b4t6", main.b4t6);
                data.getConfig().set("Items.b5t6", main.b5t6);
                data.getConfig().set("Items.b6t6", main.b6t6);
                data.getConfig().set("Items.b7t6", main.b7t6);
                data.getConfig().set("Items.b8t6", main.b8t6);
                data.getConfig().set("Items.b9t6", main.b9t6);
                data.getConfig().set("Items.b1t7", main.b1t7);
                data.getConfig().set("Items.b2t7", main.b2t7);
                data.getConfig().set("Items.b3t7", main.b3t7);
                data.getConfig().set("Items.b4t7", main.b4t7);
                data.getConfig().set("Items.b5t7", main.b5t7);
                data.getConfig().set("Items.b6t7", main.b6t7);
                data.getConfig().set("Items.b7t7", main.b7t7);
                data.getConfig().set("Items.b8t7", main.b8t7);
                data.getConfig().set("Items.b9t7", main.b9t7);
                data.getConfig().set("Items.b1t8", main.b1t8);
                data.getConfig().set("Items.b2t8", main.b2t8);
                data.getConfig().set("Items.b3t8", main.b3t8);
                data.getConfig().set("Items.b4t8", main.b4t8);
                data.getConfig().set("Items.b5t8", main.b5t8);
                data.getConfig().set("Items.b6t8", main.b6t8);
                data.getConfig().set("Items.b7t8", main.b7t8);
                data.getConfig().set("Items.b8t8", main.b8t8);
                data.getConfig().set("Items.b9t8", main.b9t8);
                data.getConfig().set("Items.b1t9", main.b1t9);
                data.getConfig().set("Items.b2t9", main.b2t9);
                data.getConfig().set("Items.b3t9", main.b3t9);
                data.getConfig().set("Items.b4t9", main.b4t9);
                data.getConfig().set("Items.b5t9", main.b5t9);
                data.getConfig().set("Items.b6t9", main.b6t9);
                data.getConfig().set("Items.b7t9", main.b7t9);
                data.getConfig().set("Items.b8t9", main.b8t9);
                data.getConfig().set("Items.b9t9", main.b9t9);

                //Scoreboard Colors
                data.getConfig().set("Color.ColorGrayb1t1", convertChatcolor(main.ColorGrayb1t1));
                data.getConfig().set("Color.ColorGrayb2t1", convertChatcolor(main.ColorGrayb2t1));
                data.getConfig().set("Color.ColorGrayb3t1", convertChatcolor(main.ColorGrayb3t1));
                data.getConfig().set("Color.ColorGrayb4t1", convertChatcolor(main.ColorGrayb4t1));
                data.getConfig().set("Color.ColorGrayb5t1", convertChatcolor(main.ColorGrayb5t1));
                data.getConfig().set("Color.ColorGrayb6t1", convertChatcolor(main.ColorGrayb6t1));
                data.getConfig().set("Color.ColorGrayb7t1", convertChatcolor(main.ColorGrayb7t1));
                data.getConfig().set("Color.ColorGrayb8t1", convertChatcolor(main.ColorGrayb8t1));
                data.getConfig().set("Color.ColorGrayb9t1", convertChatcolor(main.ColorGrayb9t1));
                data.getConfig().set("Color.ColorGrayb1t2", convertChatcolor(main.ColorGrayb1t2));
                data.getConfig().set("Color.ColorGrayb2t2", convertChatcolor(main.ColorGrayb2t2));
                data.getConfig().set("Color.ColorGrayb3t2", convertChatcolor(main.ColorGrayb3t2));
                data.getConfig().set("Color.ColorGrayb4t2", convertChatcolor(main.ColorGrayb4t2));
                data.getConfig().set("Color.ColorGrayb5t2", convertChatcolor(main.ColorGrayb5t2));
                data.getConfig().set("Color.ColorGrayb6t2", convertChatcolor(main.ColorGrayb6t2));
                data.getConfig().set("Color.ColorGrayb7t2", convertChatcolor(main.ColorGrayb7t2));
                data.getConfig().set("Color.ColorGrayb8t2", convertChatcolor(main.ColorGrayb8t2));
                data.getConfig().set("Color.ColorGrayb9t2", convertChatcolor(main.ColorGrayb9t2));
                data.getConfig().set("Color.ColorGrayb1t3", convertChatcolor(main.ColorGrayb1t3));
                data.getConfig().set("Color.ColorGrayb2t3", convertChatcolor(main.ColorGrayb2t3));
                data.getConfig().set("Color.ColorGrayb3t3", convertChatcolor(main.ColorGrayb3t3));
                data.getConfig().set("Color.ColorGrayb4t3", convertChatcolor(main.ColorGrayb4t3));
                data.getConfig().set("Color.ColorGrayb5t3", convertChatcolor(main.ColorGrayb5t3));
                data.getConfig().set("Color.ColorGrayb6t3", convertChatcolor(main.ColorGrayb6t3));
                data.getConfig().set("Color.ColorGrayb7t3", convertChatcolor(main.ColorGrayb7t3));
                data.getConfig().set("Color.ColorGrayb8t3", convertChatcolor(main.ColorGrayb8t3));
                data.getConfig().set("Color.ColorGrayb9t3", convertChatcolor(main.ColorGrayb9t3));
                data.getConfig().set("Color.ColorGrayb1t4", convertChatcolor(main.ColorGrayb1t4));
                data.getConfig().set("Color.ColorGrayb2t4", convertChatcolor(main.ColorGrayb2t4));
                data.getConfig().set("Color.ColorGrayb3t4", convertChatcolor(main.ColorGrayb3t4));
                data.getConfig().set("Color.ColorGrayb4t4", convertChatcolor(main.ColorGrayb4t4));
                data.getConfig().set("Color.ColorGrayb5t4", convertChatcolor(main.ColorGrayb5t4));
                data.getConfig().set("Color.ColorGrayb6t4", convertChatcolor(main.ColorGrayb6t4));
                data.getConfig().set("Color.ColorGrayb7t4", convertChatcolor(main.ColorGrayb7t4));
                data.getConfig().set("Color.ColorGrayb8t4", convertChatcolor(main.ColorGrayb8t4));
                data.getConfig().set("Color.ColorGrayb9t4", convertChatcolor(main.ColorGrayb9t4));
                data.getConfig().set("Color.ColorGrayb1t5", convertChatcolor(main.ColorGrayb1t5));
                data.getConfig().set("Color.ColorGrayb2t5", convertChatcolor(main.ColorGrayb2t5));
                data.getConfig().set("Color.ColorGrayb3t5", convertChatcolor(main.ColorGrayb3t5));
                data.getConfig().set("Color.ColorGrayb4t5", convertChatcolor(main.ColorGrayb4t5));
                data.getConfig().set("Color.ColorGrayb5t5", convertChatcolor(main.ColorGrayb5t5));
                data.getConfig().set("Color.ColorGrayb6t5", convertChatcolor(main.ColorGrayb6t5));
                data.getConfig().set("Color.ColorGrayb7t5", convertChatcolor(main.ColorGrayb7t5));
                data.getConfig().set("Color.ColorGrayb8t5", convertChatcolor(main.ColorGrayb8t5));
                data.getConfig().set("Color.ColorGrayb9t5", convertChatcolor(main.ColorGrayb9t5));
                data.getConfig().set("Color.ColorGrayb1t6", convertChatcolor(main.ColorGrayb1t6));
                data.getConfig().set("Color.ColorGrayb2t6", convertChatcolor(main.ColorGrayb2t6));
                data.getConfig().set("Color.ColorGrayb3t6", convertChatcolor(main.ColorGrayb3t6));
                data.getConfig().set("Color.ColorGrayb4t6", convertChatcolor(main.ColorGrayb4t6));
                data.getConfig().set("Color.ColorGrayb5t6", convertChatcolor(main.ColorGrayb5t6));
                data.getConfig().set("Color.ColorGrayb6t6", convertChatcolor(main.ColorGrayb6t6));
                data.getConfig().set("Color.ColorGrayb7t6", convertChatcolor(main.ColorGrayb7t6));
                data.getConfig().set("Color.ColorGrayb8t6", convertChatcolor(main.ColorGrayb8t6));
                data.getConfig().set("Color.ColorGrayb9t6", convertChatcolor(main.ColorGrayb9t6));
                data.getConfig().set("Color.ColorGrayb1t7", convertChatcolor(main.ColorGrayb1t7));
                data.getConfig().set("Color.ColorGrayb2t7", convertChatcolor(main.ColorGrayb2t7));
                data.getConfig().set("Color.ColorGrayb3t7", convertChatcolor(main.ColorGrayb3t7));
                data.getConfig().set("Color.ColorGrayb4t7", convertChatcolor(main.ColorGrayb4t7));
                data.getConfig().set("Color.ColorGrayb5t7", convertChatcolor(main.ColorGrayb5t7));
                data.getConfig().set("Color.ColorGrayb6t7", convertChatcolor(main.ColorGrayb6t7));
                data.getConfig().set("Color.ColorGrayb7t7", convertChatcolor(main.ColorGrayb7t7));
                data.getConfig().set("Color.ColorGrayb8t7", convertChatcolor(main.ColorGrayb8t7));
                data.getConfig().set("Color.ColorGrayb9t7", convertChatcolor(main.ColorGrayb9t7));
                data.getConfig().set("Color.ColorGrayb1t8", convertChatcolor(main.ColorGrayb1t8));
                data.getConfig().set("Color.ColorGrayb2t8", convertChatcolor(main.ColorGrayb2t8));
                data.getConfig().set("Color.ColorGrayb3t8", convertChatcolor(main.ColorGrayb3t8));
                data.getConfig().set("Color.ColorGrayb4t8", convertChatcolor(main.ColorGrayb4t8));
                data.getConfig().set("Color.ColorGrayb5t8", convertChatcolor(main.ColorGrayb5t8));
                data.getConfig().set("Color.ColorGrayb6t8", convertChatcolor(main.ColorGrayb6t8));
                data.getConfig().set("Color.ColorGrayb7t8", convertChatcolor(main.ColorGrayb7t8));
                data.getConfig().set("Color.ColorGrayb8t8", convertChatcolor(main.ColorGrayb8t8));
                data.getConfig().set("Color.ColorGrayb9t8", convertChatcolor(main.ColorGrayb9t8));
                data.getConfig().set("Color.ColorGrayb1t9", convertChatcolor(main.ColorGrayb1t9));
                data.getConfig().set("Color.ColorGrayb2t9", convertChatcolor(main.ColorGrayb2t9));
                data.getConfig().set("Color.ColorGrayb3t9", convertChatcolor(main.ColorGrayb3t9));
                data.getConfig().set("Color.ColorGrayb4t9", convertChatcolor(main.ColorGrayb4t9));
                data.getConfig().set("Color.ColorGrayb5t9", convertChatcolor(main.ColorGrayb5t9));
                data.getConfig().set("Color.ColorGrayb6t9", convertChatcolor(main.ColorGrayb6t9));
                data.getConfig().set("Color.ColorGrayb7t9", convertChatcolor(main.ColorGrayb7t9));
                data.getConfig().set("Color.ColorGrayb8t9", convertChatcolor(main.ColorGrayb8t9));
                data.getConfig().set("Color.ColorGrayb9t9", convertChatcolor(main.ColorGrayb9t9));

                //Socreboard values
                data.getConfig().set("Scoreboard.s1", main.s1);
                data.getConfig().set("Scoreboard.s2", main.s2);
                data.getConfig().set("Scoreboard.s3", main.s3);
                data.getConfig().set("Scoreboard.s4", main.s4);
                data.getConfig().set("Scoreboard.s5", main.s5);
                data.getConfig().set("Scoreboard.s6", main.s6);
                data.getConfig().set("Scoreboard.s7", main.s7);
                data.getConfig().set("Scoreboard.s8", main.s8);
                data.getConfig().set("Scoreboard.s9", main.s9);
                data.getConfig().set("Scoreboard.s10", main.s10);
                data.getConfig().set("Scoreboard.s11", main.s11);
                data.getConfig().set("Scoreboard.s12", main.s12);
                data.getConfig().set("Scoreboard.s13", main.s13);
                data.getConfig().set("Scoreboard.s14", main.s14);
                data.getConfig().set("Scoreboard.s15", main.s15);
                data.getConfig().set("Scoreboard.s16", main.s16);
                data.getConfig().set("Scoreboard.s17", main.s17);
                data.getConfig().set("Scoreboard.s18", main.s18);
                data.getConfig().set("Scoreboard.f1", main.f1);


                //Save yml
                data.yml.save(data.file);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static boolean createConfiguration() {
            try {
                new File("plugins/Bingo/").mkdirs();
                data.file.createNewFile();

                //Set Variables
                //Savegame
                data.yml.set("Game.started", false);
                data.yml.set("Game.saved", false);
                //Bingo items saved
                data.yml.set("Items.b1", main.b1);
                data.yml.set("Items.b2", main.b2);
                data.yml.set("Items.b3", main.b3);
                data.yml.set("Items.b4", main.b4);
                data.yml.set("Items.b5", main.b5);
                data.yml.set("Items.b6", main.b6);
                data.yml.set("Items.b7", main.b7);
                data.yml.set("Items.b8", main.b8);
                data.yml.set("Items.b9", main.b9);

                //Player List Teams
                data.yml.set("Teams.t1", main.t1);
                data.yml.set("Teams.t2", main.t2);
                data.yml.set("Teams.t3", main.t3);
                data.yml.set("Teams.t4", main.t4);
                data.yml.set("Teams.t5", main.t5);
                data.yml.set("Teams.t6", main.t6);
                data.yml.set("Teams.t7", main.t7);
                data.yml.set("Teams.t8", main.t8);
                data.yml.set("Teams.t9", main.t9);

                //Leaver List
                data.yml.set("Teams.Leaver.l1", convertUUID(main.l1));
                data.yml.set("Teams.Leaver.l2", convertUUID(main.l2));
                data.yml.set("Teams.Leaver.l3", convertUUID(main.l3));
                data.yml.set("Teams.Leaver.l4", convertUUID(main.l4));
                data.yml.set("Teams.Leaver.l5", convertUUID(main.l5));
                data.yml.set("Teams.Leaver.l6", convertUUID(main.l6));
                data.yml.set("Teams.Leaver.l7", convertUUID(main.l7));
                data.yml.set("Teams.Leaver.l8", convertUUID(main.l8));
                data.yml.set("Teams.Leaver.l9", convertUUID(main.l9));

                //Check Valuse
                data.yml.set("Value.lobbystatus", main.LobbyStatus);
                data.yml.set("Value.randomized", main.randomized);
                data.yml.set("Value.isRestarting", main.isRestarting);
                data.yml.set("Value.players", main.players);
                data.yml.set("Value.spectator", main.spectator);

                //Amount of Items Got by Teams
                data.yml.set("Items.gotitems1", main.gotitems1);
                data.yml.set("Items.gotitems2", main.gotitems2);
                data.yml.set("Items.gotitems3", main.gotitems3);
                data.yml.set("Items.gotitems4", main.gotitems4);
                data.yml.set("Items.gotitems5", main.gotitems5);
                data.yml.set("Items.gotitems6", main.gotitems6);
                data.yml.set("Items.gotitems7", main.gotitems7);
                data.yml.set("Items.gotitems8", main.gotitems8);
                data.yml.set("Items.gotitems9", main.gotitems9);

                //Items Got by Teams
                data.yml.set("Items.foundItemsT1", main.foundItemsT1);
                data.yml.set("Items.foundItemsT2", main.foundItemsT2);
                data.yml.set("Items.foundItemsT3", main.foundItemsT3);
                data.yml.set("Items.foundItemsT4", main.foundItemsT4);
                data.yml.set("Items.foundItemsT5", main.foundItemsT5);
                data.yml.set("Items.foundItemsT6", main.foundItemsT6);
                data.yml.set("Items.foundItemsT7", main.foundItemsT7);
                data.yml.set("Items.foundItemsT8", main.foundItemsT8);
                data.yml.set("Items.foundItemsT9", main.foundItemsT9);

                //Detailed Items Got
                //Detailed Items got by Teams


                data.getConfig().set("Items.b1t1", main.b1t1);
                data.getConfig().set("Items.b2t1", main.b2t1);
                data.getConfig().set("Items.b3t1", main.b3t1);
                data.getConfig().set("Items.b4t1", main.b4t1);
                data.getConfig().set("Items.b5t1", main.b5t1);
                data.getConfig().set("Items.b6t1", main.b6t1);
                data.getConfig().set("Items.b7t1", main.b7t1);
                data.getConfig().set("Items.b8t1", main.b8t1);
                data.getConfig().set("Items.b9t1", main.b9t1);
                data.getConfig().set("Items.b1t2", main.b1t2);
                data.getConfig().set("Items.b2t2", main.b2t2);
                data.getConfig().set("Items.b3t2", main.b3t2);
                data.getConfig().set("Items.b4t2", main.b4t2);
                data.getConfig().set("Items.b5t2", main.b5t2);
                data.getConfig().set("Items.b6t2", main.b6t2);
                data.getConfig().set("Items.b7t2", main.b7t2);
                data.getConfig().set("Items.b8t2", main.b8t2);
                data.getConfig().set("Items.b9t2", main.b9t2);
                data.getConfig().set("Items.b1t3", main.b1t3);
                data.getConfig().set("Items.b2t3", main.b2t3);
                data.getConfig().set("Items.b3t3", main.b3t3);
                data.getConfig().set("Items.b4t3", main.b4t3);
                data.getConfig().set("Items.b5t3", main.b5t3);
                data.getConfig().set("Items.b6t3", main.b6t3);
                data.getConfig().set("Items.b7t3", main.b7t3);
                data.getConfig().set("Items.b8t3", main.b8t3);
                data.getConfig().set("Items.b9t3", main.b9t3);
                data.getConfig().set("Items.b1t4", main.b1t4);
                data.getConfig().set("Items.b2t4", main.b2t4);
                data.getConfig().set("Items.b3t4", main.b3t4);
                data.getConfig().set("Items.b4t4", main.b4t4);
                data.getConfig().set("Items.b5t4", main.b5t4);
                data.getConfig().set("Items.b6t4", main.b6t4);
                data.getConfig().set("Items.b7t4", main.b7t4);
                data.getConfig().set("Items.b8t4", main.b8t4);
                data.getConfig().set("Items.b9t4", main.b9t4);
                data.getConfig().set("Items.b1t5", main.b1t5);
                data.getConfig().set("Items.b2t5", main.b2t5);
                data.getConfig().set("Items.b3t5", main.b3t5);
                data.getConfig().set("Items.b4t5", main.b4t5);
                data.getConfig().set("Items.b5t5", main.b5t5);
                data.getConfig().set("Items.b6t5", main.b6t5);
                data.getConfig().set("Items.b7t5", main.b7t5);
                data.getConfig().set("Items.b8t5", main.b8t5);
                data.getConfig().set("Items.b9t5", main.b9t5);
                data.getConfig().set("Items.b1t6", main.b1t6);
                data.getConfig().set("Items.b2t6", main.b2t6);
                data.getConfig().set("Items.b3t6", main.b3t6);
                data.getConfig().set("Items.b4t6", main.b4t6);
                data.getConfig().set("Items.b5t6", main.b5t6);
                data.getConfig().set("Items.b6t6", main.b6t6);
                data.getConfig().set("Items.b7t6", main.b7t6);
                data.getConfig().set("Items.b8t6", main.b8t6);
                data.getConfig().set("Items.b9t6", main.b9t6);
                data.getConfig().set("Items.b1t7", main.b1t7);
                data.getConfig().set("Items.b2t7", main.b2t7);
                data.getConfig().set("Items.b3t7", main.b3t7);
                data.getConfig().set("Items.b4t7", main.b4t7);
                data.getConfig().set("Items.b5t7", main.b5t7);
                data.getConfig().set("Items.b6t7", main.b6t7);
                data.getConfig().set("Items.b7t7", main.b7t7);
                data.getConfig().set("Items.b8t7", main.b8t7);
                data.getConfig().set("Items.b9t7", main.b9t7);
                data.getConfig().set("Items.b1t8", main.b1t8);
                data.getConfig().set("Items.b2t8", main.b2t8);
                data.getConfig().set("Items.b3t8", main.b3t8);
                data.getConfig().set("Items.b4t8", main.b4t8);
                data.getConfig().set("Items.b5t8", main.b5t8);
                data.getConfig().set("Items.b6t8", main.b6t8);
                data.getConfig().set("Items.b7t8", main.b7t8);
                data.getConfig().set("Items.b8t8", main.b8t8);
                data.getConfig().set("Items.b9t8", main.b9t8);
                data.getConfig().set("Items.b1t9", main.b1t9);
                data.getConfig().set("Items.b2t9", main.b2t9);
                data.getConfig().set("Items.b3t9", main.b3t9);
                data.getConfig().set("Items.b4t9", main.b4t9);
                data.getConfig().set("Items.b5t9", main.b5t9);
                data.getConfig().set("Items.b6t9", main.b6t9);
                data.getConfig().set("Items.b7t9", main.b7t9);
                data.getConfig().set("Items.b8t9", main.b8t9);
                data.getConfig().set("Items.b9t9", main.b9t9);

                //Scoreboard Colors
                data.yml.set("Color.ColorGrayb1t1", convertChatcolor(main.ColorGrayb1t1));
                data.yml.set("Color.ColorGrayb2t1", convertChatcolor(main.ColorGrayb2t1));
                data.yml.set("Color.ColorGrayb3t1", convertChatcolor(main.ColorGrayb3t1));
                data.yml.set("Color.ColorGrayb4t1", convertChatcolor(main.ColorGrayb4t1));
                data.yml.set("Color.ColorGrayb5t1", convertChatcolor(main.ColorGrayb5t1));
                data.yml.set("Color.ColorGrayb6t1", convertChatcolor(main.ColorGrayb6t1));
                data.yml.set("Color.ColorGrayb7t1", convertChatcolor(main.ColorGrayb7t1));
                data.yml.set("Color.ColorGrayb8t1", convertChatcolor(main.ColorGrayb8t1));
                data.yml.set("Color.ColorGrayb9t1", convertChatcolor(main.ColorGrayb9t1));
                data.yml.set("Color.ColorGrayb1t2", convertChatcolor(main.ColorGrayb1t2));
                data.yml.set("Color.ColorGrayb2t2", convertChatcolor(main.ColorGrayb2t2));
                data.yml.set("Color.ColorGrayb3t2", convertChatcolor(main.ColorGrayb3t2));
                data.yml.set("Color.ColorGrayb4t2", convertChatcolor(main.ColorGrayb4t2));
                data.yml.set("Color.ColorGrayb5t2", convertChatcolor(main.ColorGrayb5t2));
                data.yml.set("Color.ColorGrayb6t2", convertChatcolor(main.ColorGrayb6t2));
                data.yml.set("Color.ColorGrayb7t2", convertChatcolor(main.ColorGrayb7t2));
                data.yml.set("Color.ColorGrayb8t2", convertChatcolor(main.ColorGrayb8t2));
                data.yml.set("Color.ColorGrayb9t2", convertChatcolor(main.ColorGrayb9t2));
                data.yml.set("Color.ColorGrayb1t3", convertChatcolor(main.ColorGrayb1t3));
                data.yml.set("Color.ColorGrayb2t3", convertChatcolor(main.ColorGrayb2t3));
                data.yml.set("Color.ColorGrayb3t3", convertChatcolor(main.ColorGrayb3t3));
                data.yml.set("Color.ColorGrayb4t3", convertChatcolor(main.ColorGrayb4t3));
                data.yml.set("Color.ColorGrayb5t3", convertChatcolor(main.ColorGrayb5t3));
                data.yml.set("Color.ColorGrayb6t3", convertChatcolor(main.ColorGrayb6t3));
                data.yml.set("Color.ColorGrayb7t3", convertChatcolor(main.ColorGrayb7t3));
                data.yml.set("Color.ColorGrayb8t3", convertChatcolor(main.ColorGrayb8t3));
                data.yml.set("Color.ColorGrayb9t3", convertChatcolor(main.ColorGrayb9t3));
                data.yml.set("Color.ColorGrayb1t4", convertChatcolor(main.ColorGrayb1t4));
                data.yml.set("Color.ColorGrayb2t4", convertChatcolor(main.ColorGrayb2t4));
                data.yml.set("Color.ColorGrayb3t4", convertChatcolor(main.ColorGrayb3t4));
                data.yml.set("Color.ColorGrayb4t4", convertChatcolor(main.ColorGrayb4t4));
                data.yml.set("Color.ColorGrayb5t4", convertChatcolor(main.ColorGrayb5t4));
                data.yml.set("Color.ColorGrayb6t4", convertChatcolor(main.ColorGrayb6t4));
                data.yml.set("Color.ColorGrayb7t4", convertChatcolor(main.ColorGrayb7t4));
                data.yml.set("Color.ColorGrayb8t4", convertChatcolor(main.ColorGrayb8t4));
                data.yml.set("Color.ColorGrayb9t4", convertChatcolor(main.ColorGrayb9t4));
                data.yml.set("Color.ColorGrayb1t5", convertChatcolor(main.ColorGrayb1t5));
                data.yml.set("Color.ColorGrayb2t5", convertChatcolor(main.ColorGrayb2t5));
                data.yml.set("Color.ColorGrayb3t5", convertChatcolor(main.ColorGrayb3t5));
                data.yml.set("Color.ColorGrayb4t5", convertChatcolor(main.ColorGrayb4t5));
                data.yml.set("Color.ColorGrayb5t5", convertChatcolor(main.ColorGrayb5t5));
                data.yml.set("Color.ColorGrayb6t5", convertChatcolor(main.ColorGrayb6t5));
                data.yml.set("Color.ColorGrayb7t5", convertChatcolor(main.ColorGrayb7t5));
                data.yml.set("Color.ColorGrayb8t5", convertChatcolor(main.ColorGrayb8t5));
                data.yml.set("Color.ColorGrayb9t5", convertChatcolor(main.ColorGrayb9t5));
                data.yml.set("Color.ColorGrayb1t6", convertChatcolor(main.ColorGrayb1t6));
                data.yml.set("Color.ColorGrayb2t6", convertChatcolor(main.ColorGrayb2t6));
                data.yml.set("Color.ColorGrayb3t6", convertChatcolor(main.ColorGrayb3t6));
                data.yml.set("Color.ColorGrayb4t6", convertChatcolor(main.ColorGrayb4t6));
                data.yml.set("Color.ColorGrayb5t6", convertChatcolor(main.ColorGrayb5t6));
                data.yml.set("Color.ColorGrayb6t6", convertChatcolor(main.ColorGrayb6t6));
                data.yml.set("Color.ColorGrayb7t6", convertChatcolor(main.ColorGrayb7t6));
                data.yml.set("Color.ColorGrayb8t6", convertChatcolor(main.ColorGrayb8t6));
                data.yml.set("Color.ColorGrayb9t6", convertChatcolor(main.ColorGrayb9t6));
                data.yml.set("Color.ColorGrayb1t7", convertChatcolor(main.ColorGrayb1t7));
                data.yml.set("Color.ColorGrayb2t7", convertChatcolor(main.ColorGrayb2t7));
                data.yml.set("Color.ColorGrayb3t7", convertChatcolor(main.ColorGrayb3t7));
                data.yml.set("Color.ColorGrayb4t7", convertChatcolor(main.ColorGrayb4t7));
                data.yml.set("Color.ColorGrayb5t7", convertChatcolor(main.ColorGrayb5t7));
                data.yml.set("Color.ColorGrayb6t7", convertChatcolor(main.ColorGrayb6t7));
                data.yml.set("Color.ColorGrayb7t7", convertChatcolor(main.ColorGrayb7t7));
                data.yml.set("Color.ColorGrayb8t7", convertChatcolor(main.ColorGrayb8t7));
                data.yml.set("Color.ColorGrayb9t7", convertChatcolor(main.ColorGrayb9t7));
                data.yml.set("Color.ColorGrayb1t8", convertChatcolor(main.ColorGrayb1t8));
                data.yml.set("Color.ColorGrayb2t8", convertChatcolor(main.ColorGrayb2t8));
                data.yml.set("Color.ColorGrayb3t8", convertChatcolor(main.ColorGrayb3t8));
                data.yml.set("Color.ColorGrayb4t8", convertChatcolor(main.ColorGrayb4t8));
                data.yml.set("Color.ColorGrayb5t8", convertChatcolor(main.ColorGrayb5t8));
                data.yml.set("Color.ColorGrayb6t8", convertChatcolor(main.ColorGrayb6t8));
                data.yml.set("Color.ColorGrayb7t8", convertChatcolor(main.ColorGrayb7t8));
                data.yml.set("Color.ColorGrayb8t8", convertChatcolor(main.ColorGrayb8t8));
                data.yml.set("Color.ColorGrayb9t8", convertChatcolor(main.ColorGrayb9t8));
                data.yml.set("Color.ColorGrayb1t9", convertChatcolor(main.ColorGrayb1t9));
                data.yml.set("Color.ColorGrayb2t9", convertChatcolor(main.ColorGrayb2t9));
                data.yml.set("Color.ColorGrayb3t9", convertChatcolor(main.ColorGrayb3t9));
                data.yml.set("Color.ColorGrayb4t9", convertChatcolor(main.ColorGrayb4t9));
                data.yml.set("Color.ColorGrayb5t9", convertChatcolor(main.ColorGrayb5t9));
                data.yml.set("Color.ColorGrayb6t9", convertChatcolor(main.ColorGrayb6t9));
                data.yml.set("Color.ColorGrayb7t9", convertChatcolor(main.ColorGrayb7t9));
                data.yml.set("Color.ColorGrayb8t9", convertChatcolor(main.ColorGrayb8t9));
                data.yml.set("Color.ColorGrayb9t9", convertChatcolor(main.ColorGrayb9t9));

                //Socreboard values
                data.yml.set("Scoreboard.s1", main.s1);
                data.yml.set("Scoreboard.s2", main.s2);
                data.yml.set("Scoreboard.s3", main.s3);
                data.yml.set("Scoreboard.s4", main.s4);
                data.yml.set("Scoreboard.s5", main.s5);
                data.yml.set("Scoreboard.s6", main.s6);
                data.yml.set("Scoreboard.s7", main.s7);
                data.yml.set("Scoreboard.s8", main.s8);
                data.yml.set("Scoreboard.s9", main.s9);
                data.yml.set("Scoreboard.s10", main.s10);
                data.yml.set("Scoreboard.s11", main.s11);
                data.yml.set("Scoreboard.s12", main.s12);
                data.yml.set("Scoreboard.s13", main.s13);
                data.yml.set("Scoreboard.s14", main.s14);
                data.yml.set("Scoreboard.s15", main.s15);
                data.yml.set("Scoreboard.s16", main.s16);
                data.yml.set("Scoreboard.s17", main.s17);
                data.yml.set("Scoreboard.s18", main.s18);
                data.yml.set("Scoreboard.f1", main.f1);




                //Save Yml
                data.yml.save(data.file);
                data.configCreated = true;
                Bukkit.getConsoleSender().sendMessage("Data File successfully created!");
                return true;

            } catch (Exception e) {
                e.printStackTrace();
                Bukkit.getConsoleSender().sendMessage("Data File could not be created. => Server Restarting!");
                Bukkit.spigot().restart();
                return false;
            }
        }

        public static File getFile() {
            return config.data.file;
        }

        public static YamlConfiguration getConfig() {
            return config.data.yml;
        }

        public static String convertChatcolor(ChatColor s) {
            if (s == ChatColor.GRAY) {
                return "GRAY";
            } else if (s == ChatColor.GREEN) {
                return "GREEN";
            }
            return "null";
        }

        public static ChatColor exportChatcolor(String s) {
            if (s == "GRAY") {
                return ChatColor.GRAY;
            } else if(s == "GREEN") {
                return ChatColor.GREEN;
            }
            return ChatColor.GRAY;
        }

        public static String convertUUID(ArrayList<UUID> a) {
            return a.toString();
        }

        public static ArrayList<UUID> exportUUID(String s) {
            ArrayList<UUID> uuids = new ArrayList<UUID>();

            if (s.isEmpty()) {
              return uuids;
            }

            String[] str = s.split(",");

            for(String st: str) {
                uuids.add(UUID.fromString(st));
            }
            return uuids;
        }
    }
