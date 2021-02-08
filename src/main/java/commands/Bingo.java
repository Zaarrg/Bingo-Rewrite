package commands;

import config.Config;
import config.ConfigLanguage;
import config.data;
import functions.RandomItems;
import functions.resumeGame;
import main.main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class Bingo implements CommandExecutor {

    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (sender instanceof Player) {
            if (args.length == 0) {
                if (main.GameStarted) {
                    final Inventory bingo = Bukkit.createInventory((InventoryHolder)null, 9, ConfigLanguage.getString("bingoitemsinround"));
                    if (!main.randomized) {
                        RandomItems.getRandomItems();
                    }
                    bingo.setItem(0, main.b1);
                    bingo.setItem(1, main.b2);
                    bingo.setItem(2, main.b3);
                    bingo.setItem(3, main.b4);
                    bingo.setItem(4, main.b5);
                    bingo.setItem(5, main.b6);
                    bingo.setItem(6, main.b7);
                    bingo.setItem(7, main.b8);
                    bingo.setItem(8, main.b9);
                    p.openInventory(bingo);
                    if (main.t1.contains(p)) {
                        if (!main.foundItemsT1.isEmpty()) {
                            p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                            for (final ItemStack founditems : main.foundItemsT1) {
                                p.sendMessage("§2[Bingo] §e" + founditems.getType());
                            }
                        }
                    }
                    else if (main.t2.contains(p)) {
                        if (!main.foundItemsT2.isEmpty()) {
                            p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                            for (final ItemStack founditems : main.foundItemsT2) {
                                p.sendMessage("§2[Bingo] §e" + founditems.getType());
                            }
                        }
                    }
                    else if (main.t3.contains(p) && !main.foundItemsT3.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems : main.foundItemsT3) {
                            p.sendMessage("§2[Bingo] §e" + founditems.getType());
                        }
                    }
                }
                else if (main.t4.contains(p)) {
                    if (!main.foundItemsT4.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems2 : main.foundItemsT4) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (main.t5.contains(p)) {
                    if (!main.foundItemsT5.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems2 : main.foundItemsT5) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (main.t6.contains(p)) {
                    if (!main.foundItemsT6.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems2 : main.foundItemsT6) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (main.t7.contains(p)) {
                    if (!main.foundItemsT7.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems2 : main.foundItemsT7) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (main.t8.contains(p)) {
                    if (!main.foundItemsT8.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems2 : main.foundItemsT8) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else if (main.t9.contains(p)) {
                    if (!main.foundItemsT9.isEmpty()) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("yourteamfoundfollowingitemsalready"));
                        for (final ItemStack founditems2 : main.foundItemsT9) {
                            p.sendMessage("§2[Bingo] §e" + founditems2.getType());
                        }
                    }
                }
                else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("onlyingamecommand"));
                }
            }
            else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("start")) {
                    p.performCommand("bingopl start");
                }
                else if (args[0].equalsIgnoreCase("restart")) {
                    p.performCommand("bingoreset");
                }
                else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagebingo"));
                }

                if (args[0].equalsIgnoreCase("save")) {
                    main.timerpause = true;
                    main.savegame = true;
                    Config.saveConfiguration();
                    p.sendMessage(ConfigLanguage.getString("prefix") + ConfigLanguage.getString("savemessage"));
                }

                if (args[0].equalsIgnoreCase("resume")) {
                    main.timerpause = false;
                    resumeGame.resumeGame();
                    p.sendMessage(ConfigLanguage.getString("prefix") + "Bingo Game Resumed");
                }

                if (args[0].equalsIgnoreCase("pause")) {
                    Config.saveConfiguration();
                    main.timerpause = true;
                    p.sendMessage(ConfigLanguage.getString("prefix") + "Bingo Game Paused");
                }





            }
            else {
                p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("usagebingo"));
            }
        }
        else {
            p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("noconsole"));
        }
        return true;
    }

}
