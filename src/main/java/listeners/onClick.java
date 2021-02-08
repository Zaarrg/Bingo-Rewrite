package listeners;

import commands.settings;
import config.Config;
import config.ConfigLanguage;
import functions.RandomEnchantment;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import main.main;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import scoreboards.Scoreboards;

import java.util.ArrayList;

public class onClick implements Listener {

    @EventHandler
    public void onClick(final InventoryClickEvent e) {
        if (e.getCurrentItem() == null) {
            return;
        }
        if (e.getView().getTitle() == "§4Difficulties" || e.getView().getTitle() == "§2Einstellungen") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((main.LobbyStatus || main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.GRASS_BLOCK)) {
                main.s1 = !main.s1;
            } else if (e.getCurrentItem().getType().equals(Material.GRASS_PATH)) {
                main.s2 = !main.s2;
            } else if (e.getCurrentItem().getType().equals(Material.WARPED_NYLIUM)) {
                main.s3 = !main.s3;
            } else if (e.getCurrentItem().getType().equals(Material.CRIMSON_NYLIUM)) {
                main.s4 = !main.s4;
            } else if (e.getCurrentItem().getType().equals(Material.WITHER_SKELETON_SKULL)) {
                main.s5 = !main.s5;
            } else if (e.getCurrentItem().getType().equals(Material.END_STONE)) {
                main.s6 = !main.s6;
            } else if (e.getCurrentItem().getType().equals(Material.END_STONE_BRICKS)) {
                main.s7 = !main.s7;
            } else if (e.getCurrentItem().getType().equals(Material.ENDER_PEARL)) {
                main.s8 = !main.s8;
            } else if (e.getCurrentItem().getType().equals(Material.ENDER_EYE)) {
                main.s9 = !main.s9;
            } else if (e.getCurrentItem().getType().equals(Material.WARPED_STEM)) {
                main.s10 = !main.s10;
            } else if (e.getCurrentItem().getType().equals(Material.END_PORTAL_FRAME)) {
                main.s11 = !main.s11;
            } else if (e.getCurrentItem().getType().equals(Material.OBSIDIAN)) {
                main.s12 = !main.s12;
            } else if (e.getCurrentItem().getType().equals(Material.BLACKSTONE)) {
                main.s13 = !main.s13;
            } else if (e.getCurrentItem().getType().equals(Material.CRYING_OBSIDIAN)) {
                main.s14 = !main.s14;
            } else if (e.getCurrentItem().getType().equals(Material.CRIMSON_HYPHAE)) {
                main.s15 = !main.s15;
            } else if (e.getCurrentItem().getType().equals(Material.WARPED_HYPHAE)) {
                main.s16 = !main.s16;
            } else if (e.getCurrentItem().getType().equals(Material.NETHER_GOLD_ORE)) {
                main.s17 = !main.s17;
            } else if (e.getCurrentItem().getType().equals(Material.GILDED_BLACKSTONE)) {
                main.s18 = !main.s18;
            } else if (e.getCurrentItem().getType().equals(Material.NETHERITE_SWORD)) {
                main.f1 = !main.f1;
            } else if (e.getCurrentItem().getType().equals(Material.BOOKSHELF)) {
                if (RandomEnchantment.Wahrscheinlichkeit >= 1.0) {
                    RandomEnchantment.Wahrscheinlichkeit = 0.0;
                } else {
                    RandomEnchantment.Wahrscheinlichkeit();
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
                k.getPlayer().openInventory(settings.settings);
            }
            listeners.s1 = new ItemStack(Material.GRASS_BLOCK, 1);
            final ItemMeta st1im = listeners.s1.getItemMeta();
            st1im.setDisplayName("§aOVERWORLD");
            final ArrayList<String> lore1 = new ArrayList<String>();
            if (main.s1) {
                st1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore1.clear();
                lore1.add("§7- §2All Items Findabel");
                lore1.add("§7- §2in the Nature");
                lore1.add("§7- §aTurned On");
            } else {
                lore1.clear();
                lore1.add("§7- §2All Items Findabel");
                lore1.add("§7- §2in the Nature");
                lore1.add("§7- §cTurned Off");
            }
            st1im.setLore(lore1);
            listeners.s1.setItemMeta(st1im);
            listeners.s2 = new ItemStack(Material.GRASS_PATH, 1);
            final ItemMeta st2im = listeners.s2.getItemMeta();
            st2im.setDisplayName("§aOVERWORLD");
            final ArrayList<String> lore2 = new ArrayList<String>();
            if (main.s2) {
                st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore2.add("§7- §2All Items which are");
                lore2.add("§7- §2processed further");
                lore2.add("§7- §aTurned On");
            } else {
                lore2.add("§7- §2All Items which are");
                lore2.add("§7- §2processed further");
                lore2.add("§7- §cTurned Off");
            }
            st2im.setLore(lore2);
            listeners.s2.setItemMeta(st2im);
            listeners.s3 = new ItemStack(Material.WARPED_NYLIUM, 1);
            final ItemMeta st3im = listeners.s3.getItemMeta();
            st3im.setDisplayName("§aOVERWORLD | NETHER");
            final ArrayList<String> lore3 = new ArrayList<String>();
            if (main.s3) {
                st3im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st3im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore3.add("§7- §2Items from Overworld and Nether");
                lore3.add("§7- §2Drops of Mobs from the Overworld");
                lore3.add("§7- §aTurned On");
            } else {
                lore3.add("§7- §2Items from Overworld and Nether");
                lore3.add("§7- §2Drops of Mobs from the Overworld");
                lore3.add("§7- §cTurned Off");
            }
            st3im.setLore(lore3);
            listeners.s3.setItemMeta(st3im);
            listeners.s4 = new ItemStack(Material.CRIMSON_NYLIUM, 1);
            final ItemMeta st4im = listeners.s4.getItemMeta();
            st4im.setDisplayName("§2OVERWORLD | NETHER");
            final ArrayList<String> lore4 = new ArrayList<String>();
            if (main.s4) {
                st4im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st4im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore4.add("§7- §aFindabel Items from the Overworld");
                lore4.add("§7- §aFindeable Items from the Nether");
                lore4.add("§7- §aDrops of Mobs from the Overworld");
                lore4.add("§7- §aTurned On");
            } else {
                lore4.add("§7- §aFindabel Items from the Overworld");
                lore4.add("§7- §aFindeable Items from the Nether");
                lore4.add("§7- §aDrops of Mobs from the Overworld");
                lore4.add("§7- §cTurned Off");
            }
            st4im.setLore(lore4);
            listeners.s4.setItemMeta(st4im);
            listeners.s5 = new ItemStack(Material.WITHER_SKELETON_SKULL, 1);
            final ItemMeta st5im = listeners.s5.getItemMeta();
            st5im.setDisplayName("§2OVERWORLD | NETHER");
            final ArrayList<String> lore5 = new ArrayList<String>();
            if (main.s5) {
                st5im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st5im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore5.add("§7- §aItems from the Nether");
                lore5.add("§7- §aRare drops of Mobs from the Overworld");
                lore5.add("§7- §aTurned On");
            } else {
                lore5.add("§7- §aItems from the Nether");
                lore5.add("§7- §aRare drops of Mobs from the Overworld");
                lore5.add("§7- §cTurned Off");
            }
            st5im.setLore(lore5);
            listeners.s5.setItemMeta(st5im);
            listeners.s6 = new ItemStack(Material.END_STONE, 1);
            final ItemMeta st6im = listeners.s6.getItemMeta();
            st6im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore6 = new ArrayList<String>();
            if (main.s6) {
                st6im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st6im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore6.add("§7- Overworld + Items from the End");
                lore6.add("§7- Items which a not processed further");
                lore6.add("§7- §aTurned On");
            } else {
                lore6.add("§7- Overworld + Items from the End");
                lore6.add("§7- Items which a not processed further");
                lore6.add("§7- §cTurned Off");
            }
            st6im.setLore(lore6);
            listeners.s6.setItemMeta(st6im);
            listeners.s7 = new ItemStack(Material.END_STONE_BRICKS, 1);
            final ItemMeta st7im = listeners.s7.getItemMeta();
            st7im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore7 = new ArrayList<String>();
            if (main.s7) {
                st7im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st7im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore7.add("§7- Overworld + Items from the End");
                lore7.add("§7- §aTurned On");
            } else {
                lore7.add("§7- Overworld + Items from the End");
                lore7.add("§7- §cTurned Off");
            }
            st7im.setLore(lore7);
            listeners.s7.setItemMeta(st7im);
            listeners.s8 = new ItemStack(Material.ENDER_PEARL, 1);
            final ItemMeta st8im = listeners.s8.getItemMeta();
            st8im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore8 = new ArrayList<String>();
            if (main.s8) {
                st8im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st8im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore8.add("§7- Findable Items from the Overworld");
                lore8.add("§7- Drops of Mobs from the Overworld");
                lore8.add("§7- Items from the End");
                lore8.add("§7- §aTurned On");
            } else {
                lore8.add("§7- Findable Items from the Overworld");
                lore8.add("§7- Drops of Mobs from the Overworld");
                lore8.add("§7- Items from the End");
                lore8.add("§7- §cTurned Off");
            }
            st8im.setLore(lore8);
            listeners.s8.setItemMeta(st8im);
            listeners.s9 = new ItemStack(Material.ENDER_EYE, 1);
            final ItemMeta st9im = listeners.s9.getItemMeta();
            st9im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore9 = new ArrayList<String>();
            if (main.s9) {
                st9im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st9im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore9.add("§7- Findable Items from the Overworld");
                lore9.add("§7- Drops of Mobs from the Overworld");
                lore9.add("§7- Items from the End");
                lore9.add("§7- Dragonegg");
                lore9.add("§7- §aTurned On");
            } else {
                lore9.add("§7- Findable Items from the Overworld");
                lore9.add("§7- Drops of Mobs from the Overworld");
                lore9.add("§7- Items from the End");
                lore9.add("§7- Dragonegg");
                lore9.add("§7- §cTurned Off");
            }
            st9im.setLore(lore9);
            listeners.s9.setItemMeta(st9im);
            listeners.s10 = new ItemStack(Material.WARPED_STEM, 1);
            final ItemMeta st10im = listeners.s10.getItemMeta();
            st10im.setDisplayName("§8OVERWORLD | END");
            final ArrayList<String> lore10 = new ArrayList<String>();
            if (main.s10) {
                st10im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st10im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore10.add("§7- Rare Item drops of Mobs from the Overworld");
                lore10.add("§7- Items from the End");
                lore10.add("§7- Dragonegg");
                lore10.add("§7- §aTurned On");
            } else {
                lore10.add("§7- Rare Item drops of Mobs from the Overworld");
                lore10.add("§7- Items from the End");
                lore10.add("§7- Dragonegg");
                lore10.add("§7- §cTurned Off");
            }
            st10im.setLore(lore10);
            listeners.s10.setItemMeta(st10im);
            listeners.s11 = new ItemStack(Material.END_PORTAL_FRAME, 1);
            final ItemMeta st11im = listeners.s11.getItemMeta();
            st11im.setDisplayName("§8END");
            final ArrayList<String> lore11 = new ArrayList<String>();
            if (main.s11) {
                st11im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st11im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore11.add("§7- §fItems from the End");
                lore11.add("§7- §fDragonegg");
                lore11.add("§7- §aTurned On");
            } else {
                lore11.add("§7- §fItems from the End");
                lore11.add("§7- §fDragonegg");
                lore11.add("§7- §cTurned Off");
            }
            st11im.setLore(lore11);
            listeners.s11.setItemMeta(st11im);
            listeners.s12 = new ItemStack(Material.OBSIDIAN, 1);
            final ItemMeta st12im = listeners.s12.getItemMeta();
            st12im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore12 = new ArrayList<String>();
            if (main.s12) {
                st12im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st12im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore12.add("§7- §cItems from the Nether");
                lore12.add("§7- §cItems from the End");
                lore12.add("§7- §aTurned On");
            } else {
                lore12.add("§7- §cItems from the Nether");
                lore12.add("§7- §cItems from the End");
                lore12.add("§7- §cTurned Off");
            }
            st12im.setLore(lore12);
            listeners.s12.setItemMeta(st12im);
            listeners.s13 = new ItemStack(Material.BLACKSTONE, 1);
            final ItemMeta st13im = listeners.s13.getItemMeta();
            st13im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore13 = new ArrayList<String>();
            if (main.s13) {
                st13im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st13im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore13.add("§7- §cItems from the Nether");
                lore13.add("§7- §cItems from the End");
                lore13.add("§7- §aTurned On");
            } else {
                lore13.add("§7- §cItems from the Nether");
                lore13.add("§7- §cItems from the End");
                lore13.add("§7- §cTurned Off");
            }
            st13im.setLore(lore13);
            listeners.s13.setItemMeta(st13im);
            listeners.s14 = new ItemStack(Material.CRYING_OBSIDIAN, 1);
            final ItemMeta st14im = listeners.s14.getItemMeta();
            st14im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore14 = new ArrayList<String>();
            if (main.s14) {
                st14im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st14im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore14.add("§7- §cItems from the Nether");
                lore14.add("§7- §cItems from the End");
                lore14.add("§7- §cDragonegg");
                lore14.add("§7- §aTurned On");
            } else {
                lore14.add("§7- §cItems from the Nether");
                lore14.add("§7- §cItems from the End");
                lore14.add("§7- §cDragonegg");
                lore14.add("§7- §cTurned Off");
            }
            st14im.setLore(lore14);
            listeners.s14.setItemMeta(st14im);
            listeners.s15 = new ItemStack(Material.CRIMSON_HYPHAE, 1);
            final ItemMeta st15im = listeners.s15.getItemMeta();
            st15im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore15 = new ArrayList<String>();
            if (main.s15) {
                st15im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st15im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore15.add("§7- §cItems from the Nether");
                lore15.add("§7- §cItems from the End");
                lore15.add("§7- §cDragonegg");
                lore15.add("§7- §aTurned On");
            } else {
                lore15.add("§7- §cItems from the Nether");
                lore15.add("§7- §cItems from the End");
                lore15.add("§7- §cDragonegg");
                lore15.add("§7- §cTurned Off");
            }
            st15im.setLore(lore15);
            listeners.s15.setItemMeta(st15im);
            listeners.s16 = new ItemStack(Material.WARPED_HYPHAE, 1);
            final ItemMeta st16im = listeners.s16.getItemMeta();
            st16im.setDisplayName("§4NETHER | END");
            final ArrayList<String> lore16 = new ArrayList<String>();
            if (main.s16) {
                st16im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st16im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore16.add("§7- §cItems from the Nether");
                lore16.add("§7- §cDrops of Mobs from the Nether");
                lore16.add("§7- §cItems from the End");
                lore16.add("§7- §cDragonegg");
                lore16.add("§7- §aTurned On");
            } else {
                lore16.add("§7- §cItems from the Nether");
                lore16.add("§7- §cDrops of Mobs from the Nether");
                lore16.add("§7- §cItems from the End");
                lore16.add("§7- §cDragonegg");
                lore16.add("§7- §cTurned Off");
            }
            st16im.setLore(lore16);
            listeners.s16.setItemMeta(st16im);
            listeners.s17 = new ItemStack(Material.NETHER_GOLD_ORE, 1);
            final ItemMeta st17im = listeners.s17.getItemMeta();
            st17im.setDisplayName("§cNether");
            final ArrayList<String> lore17 = new ArrayList<String>();
            if (main.s17) {
                st17im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st17im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore17.add("§7- §4Items from the Nether");
                lore17.add("§7- §4Drops of Mobs from the Nether");
                lore17.add("§7- §aTurned On");
            } else {
                lore17.add("§7- §4Items from the Nether");
                lore17.add("§7- §4Drops of Mobs from the Nether");
                lore17.add("§7- §cTurned Off");
            }
            st17im.setLore(lore17);
            listeners.s17.setItemMeta(st17im);
            listeners.s18 = new ItemStack(Material.GILDED_BLACKSTONE, 1);
            final ItemMeta st18im = listeners.s18.getItemMeta();
            st18im.setDisplayName("§5Newest Items");
            final ArrayList<String> lore18 = new ArrayList<String>();
            if (main.s18) {
                st18im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st18im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore18.add("§7- §dItems from 1.16");
                lore18.add("§7- §aTurned On");
            } else {
                lore18.add("§7- §dItems from 1.16");
                lore18.add("§7- §cTurned Off");
            }
            st18im.setLore(lore18);
            listeners.s18.setItemMeta(st18im);
            listeners.f1 = new ItemStack(Material.NETHERITE_SWORD, 1);
            final ItemMeta f1 = listeners.f1.getItemMeta();
            f1.setDisplayName("§5Netherite Filter");
            final ArrayList<String> loref1 = new ArrayList<String>();
            if (main.f1) {
                f1.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                f1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                loref1.add("§7- §dTurn Off Netherite Items");
                loref1.add("§7- §aActivated");
            } else {
                loref1.add("§7- §dTurn Off Netherite Items");
                loref1.add("§7- §cDeactivated");
            }
            f1.setLore(loref1);
            listeners.f1.setItemMeta(f1);
            listeners.f2 = new ItemStack(Material.BOOKSHELF, 1);
            final ItemMeta f2 = listeners.f2.getItemMeta();
            f2.setDisplayName("§5Enchantments");
            final ArrayList<String> loref2 = new ArrayList<String>();
            if (RandomEnchantment.Wahrscheinlichkeit > 0.0) {
                f2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                f2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                loref2.add("§7- §dTurn On Enchanted Items");
                loref2.add("§7- §dWahrscheinlichkeit: " + ChatColor.GREEN + RandomEnchantment.InProzent());
                loref2.add("§7- §aActivated");
            } else if (RandomEnchantment.Wahrscheinlichkeit <= 0.0) {
                loref2.add("§7- §dTurn On Enchanted Items");
                loref2.add("§7- §dWahrscheinlichkeit: " + ChatColor.GREEN + RandomEnchantment.InProzent());
                loref2.add("§7- §cDeactivated");
            }
            f2.setLore(loref2);
            listeners.f2.setItemMeta(f2);
            listeners.back = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
            final ItemMeta back1 = listeners.back.getItemMeta();
            back1.setDisplayName(ChatColor.RED + "Back");
            listeners.back.setItemMeta(back1);
            listeners.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim = listeners.ph.getItemMeta();
            phim.setDisplayName(" ");
            listeners.ph.setItemMeta(phim);
            if (e.getCurrentItem().getType().equals(Material.DRAGON_EGG) || e.getCurrentItem().getType().equals(listeners.f1.getType()) || e.getCurrentItem().getType().equals(listeners.f2.getType()) || e.getCurrentItem().getType().equals(listeners.s1.getType()) || e.getCurrentItem().getType().equals(listeners.s2.getType()) || e.getCurrentItem().getType().equals(listeners.s3.getType()) || e.getCurrentItem().getType().equals(listeners.s4.getType()) || e.getCurrentItem().getType().equals(listeners.s5.getType()) || e.getCurrentItem().getType().equals(listeners.s6.getType()) || e.getCurrentItem().getType().equals(listeners.s7.getType()) || e.getCurrentItem().getType().equals(listeners.s8.getType()) || e.getCurrentItem().getType().equals(listeners.s9.getType()) || e.getCurrentItem().getType().equals(listeners.s10.getType()) || e.getCurrentItem().getType().equals(listeners.s11.getType()) || e.getCurrentItem().getType().equals(listeners.s12.getType()) || e.getCurrentItem().getType().equals(listeners.s13.getType()) || e.getCurrentItem().getType().equals(listeners.s14.getType()) || e.getCurrentItem().getType().equals(listeners.s15.getType()) || e.getCurrentItem().getType().equals(listeners.s16.getType()) || e.getCurrentItem().getType().equals(listeners.s17.getType()) || e.getCurrentItem().getType().equals(listeners.s18.getType())) {
                final Inventory schwierigkeit = Bukkit.createInventory(null, 54, "§4Difficulties");
                schwierigkeit.setItem(9, listeners.s1);
                schwierigkeit.setItem(10, listeners.s2);
                schwierigkeit.setItem(11, listeners.s3);
                schwierigkeit.setItem(12, listeners.s4);
                schwierigkeit.setItem(13, listeners.s5);
                schwierigkeit.setItem(14, listeners.s6);
                schwierigkeit.setItem(15, listeners.s7);
                schwierigkeit.setItem(16, listeners.s8);
                schwierigkeit.setItem(17, listeners.s9);
                schwierigkeit.setItem(18, listeners.s10);
                schwierigkeit.setItem(19, listeners.s11);
                schwierigkeit.setItem(20, listeners.s12);
                schwierigkeit.setItem(21, listeners.s13);
                schwierigkeit.setItem(22, listeners.s14);
                schwierigkeit.setItem(23, listeners.s15);
                schwierigkeit.setItem(24, listeners.s16);
                schwierigkeit.setItem(25, listeners.s17);
                schwierigkeit.setItem(26, listeners.s18);
                schwierigkeit.setItem(36, listeners.f1);
                schwierigkeit.setItem(37, listeners.f2);
                schwierigkeit.setItem(53, listeners.back);
                for (int i = 0; i < schwierigkeit.getSize(); ++i) {
                    if (schwierigkeit.getItem(i) == null || schwierigkeit.getItem(i).getType().equals(Material.AIR)) {
                        schwierigkeit.setItem(i, listeners.ph);
                    }
                }
                k.getPlayer().openInventory(schwierigkeit);
            }
        }
        if (e.getView().getTitle() == "§2Game Settings" || e.getView().getTitle() == "§2Einstellungen") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((main.LobbyStatus || main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.CLOCK)) {
                if (main.timercountdown) {
                    main.timercountdown = false;
                    main.hours = 0;
                    main.minutes = 0;
                    main.seconds = 0;
                } else if (!main.timercountdown) {
                    main.timercountdown = true;
                    main.hours = 0;
                    main.minutes = 10;
                    main.seconds = 0;
                }
            } else if (e.getCurrentItem().getType().equals(Material.TOTEM_OF_UNDYING)) {
                if (e.getClick().isLeftClick()) {
                    main.SpawnArea += 10;
                } else if (e.getClick().isRightClick()) {
                    if (main.SpawnArea == 10) {
                        return;
                    }
                    main.SpawnArea -= 10;
                }
            } else if (e.getCurrentItem().getType().equals(Material.SPRUCE_LOG)) {
                if (!Config.getConfig().getBoolean("reset.Reset")) {
                    Config.getConfig().set("reset.Reset", true);
                } else if (Config.getConfig().getBoolean("reset.Reset")) {
                    Config.getConfig().set("reset.Reset", false);
                }
            } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cPlus")) {
                if (main.minutes == 60) {
                    main.minutes = 0;
                    ++main.hours;
                } else if (main.timercountdown) {
                    main.minutes += 10;
                } else if (!main.timercountdown) {
                    return;
                }
            } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cMinus")) {
                if (main.minutes == 0 && main.timercountdown) {
                    main.minutes = 60;
                    --main.hours;
                } else {
                    if (main.minutes < 10 || (main.minutes == 10 && main.hours == 0)) {
                        return;
                    }
                    if (main.minutes == 0 && !main.timercountdown) {
                        return;
                    }
                    main.minutes -= 10;
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
                k.getPlayer().openInventory(settings.settings);
            } else if (e.getCurrentItem().getType().equals(Material.NOTE_BLOCK) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§aResume | Pause")) {
                main.timerpause = !main.timerpause;
            }
            listeners.g1 = new ItemStack(Material.CLOCK, 1);
            final ItemMeta st1im = listeners.g1.getItemMeta();
            st1im.setDisplayName("§aTimer");
            final ArrayList<String> lore1 = new ArrayList<String>();
            lore1.add(new StringBuilder().append(ChatColor.GOLD).append(main.hours).append(":").append(ChatColor.GOLD).append(main.minutes).append(":").append(ChatColor.GOLD).append(main.seconds).toString());
            if (!main.timercountdown) {
                lore1.add(ChatColor.DARK_GREEN + "Counting Up");
            } else if (main.timercountdown) {
                lore1.add(ChatColor.RED + "Counting Down");
            }
            st1im.setLore(lore1);
            listeners.g1.setItemMeta(st1im);
            listeners.g2 = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
            final ItemMeta st2im = listeners.g2.getItemMeta();
            st2im.setDisplayName("§aSpawnArea");
            final ArrayList<String> lore2 = new ArrayList<String>();
            st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            lore2.add("§2Set the Spawnarea in Blocks");
            lore2.add("§c+ 10 Blocks§2 per §6LeftClick");
            lore2.add("§c- 10 Blocks§2 per §6RightClick");
            lore2.add("§2Current Spawnarea: " + ChatColor.GOLD + main.SpawnArea);
            st2im.setLore(lore2);
            listeners.g2.setItemMeta(st2im);
            listeners.g3 = new ItemStack(Material.SPRUCE_LOG, 1);
            final ItemMeta st3im = listeners.g3.getItemMeta();
            st3im.setDisplayName("§aReset");
            final ArrayList<String> lore3 = new ArrayList<String>();
            if (Config.getConfig().getBoolean("reset.Reset")) {
                st3im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st3im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore3.add("§2Turn Reset ON or OFF");
                lore3.add("§aTurned On");
            } else if (!Config.getConfig().getBoolean("reset.Reset")) {
                lore3.clear();
                lore3.add("§2Turn Reset ON or OFF");
                lore3.add("§cTurned Off");
            }
            st3im.setLore(lore3);
            listeners.g3.setItemMeta(st3im);

            listeners.g5 = new ItemStack(Material.NOTE_BLOCK, 1);
            final ItemMeta st5im = listeners.g5.getItemMeta();
            st5im.setDisplayName("§aResume | Pause");
            final ArrayList<String> lore5 = new ArrayList<String>();
            if (main.timerpause) {
                st5im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st5im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore5.add("§2Pause and Resume the Timer");
                lore5.add("§aTimer Paused!");
            } else if (!main.timerpause) {
                lore5.clear();
                lore5.add("§2Pause and Resume the Timer");
                lore5.add("§cTimer is Resumed!");
            }
            st5im.setLore(lore5);
            listeners.g5.setItemMeta(st5im);

            listeners.g4 = new ItemStack(Material.PLAYER_HEAD, 1);
            final ItemMeta st4im = listeners.g4.getItemMeta();
            st4im.setDisplayName("§aPlayer Settings");
            final ArrayList<String> lore4 = new ArrayList<String>();
            st4im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            st4im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            lore4.add("§7- §2Player Settings");
            st4im.setLore(lore4);
            listeners.g4.setItemMeta(st4im);
            listeners.b1 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b1im = listeners.b1.getItemMeta();
            b1im.setDisplayName("§cMinus");
            final ArrayList<String> blore = new ArrayList<String>();
            b1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore.add(new StringBuilder().append(ChatColor.GOLD).append(main.hours).append(":").append(ChatColor.GOLD).append(main.minutes).append(":").append(ChatColor.GOLD).append(main.seconds).toString());
            b1im.setLore(blore);
            listeners.b1.setItemMeta(b1im);
            listeners.b2 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b2im = listeners.b2.getItemMeta();
            b2im.setDisplayName("§cPlus");
            final ArrayList<String> blore2 = new ArrayList<String>();
            b2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore2.add(new StringBuilder().append(ChatColor.GOLD).append(main.hours).append(":").append(ChatColor.GOLD).append(main.minutes).append(":").append(ChatColor.GOLD).append(main.seconds).toString());
            b2im.setLore(blore2);
            listeners.b2.setItemMeta(b2im);
            listeners.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim2 = listeners.ph.getItemMeta();
            phim2.setDisplayName(" ");
            listeners.ph.setItemMeta(phim2);
            if (e.getCurrentItem().getType().equals(Material.COMMAND_BLOCK) || e.getCurrentItem().getType().equals(Material.NOTE_BLOCK) || e.getCurrentItem().getType().equals(Material.STONE_BUTTON) || e.getCurrentItem().getType().equals(Material.CLOCK) || e.getCurrentItem().getType().equals(Material.TOTEM_OF_UNDYING) || e.getCurrentItem().getType().equals(Material.SPRUCE_LOG)) {
                listeners.gameset.setItem(19, listeners.g1);
                listeners.gameset.setItem(21, listeners.g2);
                listeners.gameset.setItem(23, listeners.g3);
                listeners.gameset.setItem(25, listeners.g4);
                listeners.gameset.setItem(10, listeners.b2);
                listeners.gameset.setItem(28, listeners.b1);
                listeners.gameset.setItem(44, listeners.back);
                listeners.gameset.setItem(1, listeners.g5);
                for (int j = 0; j < listeners.gameset.getSize(); ++j) {
                    if (listeners.gameset.getItem(j) == null || listeners.gameset.getItem(j).getType().equals(Material.AIR)) {
                        listeners.gameset.setItem(j, listeners.ph);
                    }
                }
                k.getPlayer().openInventory(listeners.gameset);
            }
        }
        if (e.getView().getTitle() == "§2Game Settings" || e.getView().getTitle() == "§2Player Settings") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((main.LobbyStatus || main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.TRIDENT)) {
                if (!main.damage) {
                    main.damage = true;
                } else if (main.damage) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        player.setHealth(20.0);
                    }
                    main.damage = false;
                }
            } else if (e.getCurrentItem().getType().equals(Material.MUSHROOM_STEW)) {
                if (main.hunger) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        player.setFoodLevel(20);
                    }
                    main.hunger = false;
                } else if (!main.hunger) {
                    main.hunger = true;
                }
            } else if (e.getCurrentItem().getType().equals(Material.CHEST)) {
                if (main.keepinventory) {
                    main.keepinventory = false;
                } else if (!main.keepinventory) {
                    main.keepinventory = true;
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE) && e.getView().getTitle() == "§2Player Settings") {
                k.getPlayer().openInventory(listeners.gameset);
            }
            listeners.p1 = new ItemStack(Material.TRIDENT, 1);
            final ItemMeta p1im = listeners.p1.getItemMeta();
            p1im.setDisplayName("§aDamage");
            final ArrayList<String> lore1 = new ArrayList<String>();
            if (main.damage) {
                p1im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                p1im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore1.add("§2Turn Damage ON or OFF");
                lore1.add("§aTurned On");
            } else if (!main.damage) {
                lore1.clear();
                lore1.add("§2Turn Damage ON or OFF");
                lore1.add("§cTurned Off");
            }
            p1im.setLore(lore1);
            listeners.p1.setItemMeta(p1im);
            listeners.p2 = new ItemStack(Material.MUSHROOM_STEW, 1);
            final ItemMeta st2im = listeners.p2.getItemMeta();
            st2im.setDisplayName("§aHunger");
            final ArrayList<String> lore2 = new ArrayList<String>();
            if (main.hunger) {
                st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore2.add("§2Turn Hunger ON or OFF");
                lore2.add("§aTurned On");
            } else if (!main.hunger) {
                lore2.clear();
                lore2.add("§2Turn Hunger ON or OFF");
                lore2.add("§cTurned Off");
            }
            st2im.setLore(lore2);
            listeners.p2.setItemMeta(st2im);
            listeners.p3 = new ItemStack(Material.CHEST, 1);
            final ItemMeta st3im = listeners.p3.getItemMeta();
            st3im.setDisplayName("§aKeep Inventory");
            final ArrayList<String> lore3 = new ArrayList<String>();
            if (main.keepinventory) {
                st2im.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
                st2im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                lore3.add("§2Turn Keepinventory ON or OFF");
                lore3.add("§aTurned On");
            } else if (!main.keepinventory) {
                lore3.clear();
                lore3.add("§2Turn Keepinventory ON or OFF");
                lore3.add("§cTurned Off");
            }
            st3im.setLore(lore3);
            listeners.p3.setItemMeta(st3im);
            listeners.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim3 = listeners.ph.getItemMeta();
            phim3.setDisplayName(" ");
            listeners.ph.setItemMeta(phim3);
            if (e.getCurrentItem().getType().equals(Material.PLAYER_HEAD) || e.getCurrentItem().getType().equals(Material.TRIDENT) || e.getCurrentItem().getType().equals(Material.MUSHROOM_STEW) || e.getCurrentItem().getType().equals(Material.CHEST)) {
                final Inventory playerset = Bukkit.createInventory(null, 45, "§2Player Settings");
                playerset.setItem(19, listeners.p1);
                playerset.setItem(21, listeners.p2);
                playerset.setItem(23, listeners.p3);
                playerset.setItem(44, listeners.back);
                for (int l = 0; l < playerset.getSize(); ++l) {
                    if (playerset.getItem(l) == null || playerset.getItem(l).getType().equals(Material.AIR)) {
                        playerset.setItem(l, listeners.ph);
                    }
                }
                k.getPlayer().openInventory(playerset);
            }
        }
        if (e.getView().getTitle() == "§2Team Settings" || e.getView().getTitle() == "§2Einstellungen") {
            e.setCancelled(true);
            final Player k = (Player) e.getWhoClicked();
            if ((main.LobbyStatus || main.GameStarted) && e.getCurrentItem() == null) {
                e.setCancelled(true);
            }
            if (e.getCurrentItem().getType().equals(Material.ARMOR_STAND)) {
                return;
            }
            if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cPlus")) {
                if (main.Teamsize == 1) {
                    ++main.Teamsize;
                } else if (main.Teamsize == 2) {
                    return;
                }
            } else if (e.getCurrentItem().getType().equals(Material.STONE_BUTTON) && e.getCurrentItem().getItemMeta().getDisplayName().equals("§cMinus")) {
                if (main.Teamsize == 2) {
                    --main.Teamsize;
                } else if (main.Teamsize == 1) {
                    return;
                }
            } else if (e.getCurrentItem().getType().equals(Material.RED_STAINED_GLASS_PANE)) {
                k.getPlayer().openInventory(settings.settings);
            }
            listeners.g1 = new ItemStack(Material.ARMOR_STAND, 1);
            final ItemMeta st1im = listeners.g1.getItemMeta();
            st1im.setDisplayName("§aTeamsize");
            final ArrayList<String> lore1 = new ArrayList<String>();
            lore1.add("§2Current Teamsize:" + ChatColor.GOLD + " " + main.Teamsize);
            st1im.setLore(lore1);
            listeners.g1.setItemMeta(st1im);
            listeners.b1 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b1im2 = listeners.b1.getItemMeta();
            b1im2.setDisplayName("§cMinus");
            final ArrayList<String> blore3 = new ArrayList<String>();
            b1im2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b1im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore3.add("§2Current Teamsize:" + ChatColor.GOLD + " " + main.Teamsize);
            b1im2.setLore(blore3);
            listeners.b1.setItemMeta(b1im2);
            listeners.b2 = new ItemStack(Material.STONE_BUTTON, 1);
            final ItemMeta b2im2 = listeners.b2.getItemMeta();
            b2im2.setDisplayName("§cPlus");
            final ArrayList<String> blore4 = new ArrayList<String>();
            b2im2.addEnchant(Enchantment.FIRE_ASPECT, 1, false);
            b2im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            blore4.add("§2Current Teamsize:" + ChatColor.GOLD + " " + main.Teamsize);
            b2im2.setLore(blore4);
            listeners.b2.setItemMeta(b2im2);
            listeners.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim3 = listeners.ph.getItemMeta();
            phim3.setDisplayName(" ");
            listeners.ph.setItemMeta(phim3);
            if (e.getCurrentItem().getType().equals(Material.RED_BANNER) || e.getCurrentItem().getType().equals(Material.STONE_BUTTON) || e.getCurrentItem().getType().equals(Material.ARMOR_STAND)) {
                final Inventory teamset = Bukkit.createInventory(null, 45, "§2Team Settings");
                teamset.setItem(22, listeners.g1);
                teamset.setItem(13, listeners.b2);
                teamset.setItem(31, listeners.b1);
                teamset.setItem(44, listeners.back);
                for (int l = 0; l < teamset.getSize(); ++l) {
                    if (teamset.getItem(l) == null || teamset.getItem(l).getType().equals(Material.AIR)) {
                        teamset.setItem(l, listeners.ph);
                    }
                }
                k.getPlayer().openInventory(teamset);
            }
        }
        if (e.getView().getTitle().equals(ConfigLanguage.getString("bingoitemsinround"))) {
            e.setCancelled(true);
        }
        final Player p = (Player) e.getWhoClicked();
        listeners.t1is = new ItemStack(Material.ORANGE_CONCRETE, 1);
        final ItemMeta t1im = listeners.t1is.getItemMeta();
        t1im.setDisplayName("§6Team 1");
        listeners.t1is.setItemMeta(t1im);
        listeners.t2is = new ItemStack(Material.RED_CONCRETE, 1);
        final ItemMeta t2im = listeners.t1is.getItemMeta();
        t2im.setDisplayName("§cTeam 2");
        listeners.t2is.setItemMeta(t2im);
        listeners.t3is = new ItemStack(Material.PINK_CONCRETE, 1);
        final ItemMeta t3im = listeners.t1is.getItemMeta();
        t3im.setDisplayName("§dTeam 3");
        listeners.t3is.setItemMeta(t3im);
        listeners.t4is = new ItemStack(Material.WHITE_CONCRETE, 1);
        final ItemMeta t4im = listeners.t1is.getItemMeta();
        t4im.setDisplayName("§fTeam 4");
        listeners.t4is.setItemMeta(t4im);
        listeners.t5is = new ItemStack(Material.LIGHT_BLUE_CONCRETE, 1);
        final ItemMeta t5im = listeners.t1is.getItemMeta();
        t5im.setDisplayName("§9Team 5");
        listeners.t5is.setItemMeta(t5im);
        listeners.t6is = new ItemStack(Material.YELLOW_CONCRETE, 1);
        final ItemMeta t6im = listeners.t1is.getItemMeta();
        t6im.setDisplayName("§eTeam 6");
        listeners.t6is.setItemMeta(t6im);
        listeners.t7is = new ItemStack(Material.LIME_CONCRETE, 1);
        final ItemMeta t7im = listeners.t1is.getItemMeta();
        t7im.setDisplayName("§aTeam 7");
        listeners.t7is.setItemMeta(t7im);
        listeners.t8is = new ItemStack(Material.GRAY_CONCRETE, 1);
        final ItemMeta t8im = listeners.t1is.getItemMeta();
        t8im.setDisplayName("§7Team 8");
        listeners.t8is.setItemMeta(t8im);
        listeners.t9is = new ItemStack(Material.PURPLE_CONCRETE, 1);
        final ItemMeta t9im = listeners.t1is.getItemMeta();
        t9im.setDisplayName("§5Team 9");
        listeners.t9is.setItemMeta(t9im);
        if (main.LobbyStatus || main.GameStarted) {
            if (e.getCurrentItem() == null) {
                e.setCancelled(true);
            } else if (e.getCurrentItem().getType().equals(Material.ORANGE_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t1.size() < main.Teamsize) {
                    if (!main.t1.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam1") );
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t1.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam1"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t1.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam1"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team1full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.RED_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t2.size() < main.Teamsize) {
                    if (!main.t2.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam2"));
                        main.t1.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t2.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam2"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t2.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam2"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team2full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.PINK_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t3.size() < main.Teamsize) {
                    if (!main.t3.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam3"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t3.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam3"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t3.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam3"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team3full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.WHITE_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t4.size() < main.Teamsize) {
                    if (!main.t4.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam4"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t4.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam4"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t4.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam4"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team4full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.LIGHT_BLUE_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t5.size() < main.Teamsize) {
                    if (!main.t5.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam5"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t5.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam5"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t5.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam5"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team5full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.YELLOW_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t6.size() < main.Teamsize) {
                    if (!main.t6.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam6"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t6.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam6"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t6.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam6"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team6full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.LIME_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t7.size() < main.Teamsize) {
                    if (!main.t7.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam7"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t8.remove(p);
                        main.t9.remove(p);
                        main.t7.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam7"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t7.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam7"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team7full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.GRAY_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t8.size() < main.Teamsize) {
                    if (!main.t8.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam8"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t9.remove(p);
                        main.t8.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam8"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t8.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam8"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team8full"));
                }
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.PURPLE_CONCRETE) && e.getView().getTitle().contains(ConfigLanguage.getString("teamselectorInventoryTitle"))) {
                if (main.t9.size() < main.Teamsize) {
                    if (!main.t9.contains(p)) {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("jointeam9"));
                        main.t1.remove(p);
                        main.t2.remove(p);
                        main.t3.remove(p);
                        main.t4.remove(p);
                        main.t5.remove(p);
                        main.t6.remove(p);
                        main.t7.remove(p);
                        main.t8.remove(p);
                        main.t9.add(p);
                    } else {
                        p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam9"));
                    }
                    Scoreboards.setLobbyScoreboardWithTeam(p);
                } else if (main.t9.contains(p)) {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("alreadyteam9"));
                } else {
                    p.sendMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("team9full"));
                }
                p.closeInventory();
            } else if (e.getClickedInventory().getType() == InventoryType.PLAYER && e.getCurrentItem().getType().equals(Material.NETHER_STAR) && main.LobbyStatus && e.getCurrentItem().getItemMeta().getDisplayName().contains(ConfigLanguage.getString("teamselection"))) {
                e.setCancelled(true);
            } else if (e.getClickedInventory().getType() == InventoryType.PLAYER && e.getCurrentItem().getType().equals(Material.NETHER_STAR) && main.GameStarted && e.getCurrentItem().getItemMeta().getDisplayName().contains(ConfigLanguage.getString("teamselection"))) {
                e.setCancelled(true);
            }
        } else if (e.getWhoClicked().isInvulnerable() && e.getClickedInventory().getType() != InventoryType.PLAYER) {
            e.setCancelled(true);
        }
        if (main.t1.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam1Colour")) + p.getName());
        } else if (main.t2.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam2Colour")) + p.getName());
        } else if (main.t3.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam3Colour")) + p.getName());
        } else if (main.t4.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam4Colour")) + p.getName());
        } else if (main.t5.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam5Colour")) + p.getName());
        } else if (main.t6.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam6Colour")) + p.getName());
        } else if (main.t7.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam7Colour")) + p.getName());
        } else if (main.t8.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam8Colour")) + p.getName());
        } else if (main.t9.contains(p)) {
            p.setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam9Colour")) + p.getName());
        }
        if (e.getClick().isLeftClick() && e.getView().getTitle().equals(ConfigLanguage.getString("bingoitemsinround"))) {
            if (main.GameStarted) {
                final String BingoItem = "r %Item%";
                if (e.getCurrentItem().getType().equals(main.b1.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b1.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b2.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b2.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b3.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b3.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b4.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b4.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b5.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b5.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b6.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b6.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b7.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b7.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b8.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b8.getType().name()));
                } else if (e.getCurrentItem().getType().equals(main.b9.getType())) {
                    p.performCommand(BingoItem.replace("%Item%", main.b9.getType().name()));
                }
            } else {
                e.setCancelled(true);
            }
        }
    }


}
