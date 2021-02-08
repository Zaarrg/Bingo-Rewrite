package listeners;

import config.ConfigLanguage;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import main.main;
public class onInteract implements Listener {





    @EventHandler
    public void onInteract(final PlayerInteractEvent e) {
        if (main.LobbyStatus) {
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
            final Inventory teamselector = Bukkit.createInventory(null, 9, ConfigLanguage.getString("teamselectorInventoryTitle"));
            listeners.ph = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
            final ItemMeta phim = listeners.ph.getItemMeta();
            phim.setDisplayName(" ");
            listeners.ph.setItemMeta(phim);
            teamselector.setItem(0, listeners.t1is);
            teamselector.setItem(1, listeners.t2is);
            teamselector.setItem(2, listeners.t3is);
            teamselector.setItem(3, listeners.t4is);
            teamselector.setItem(4, listeners.t5is);
            teamselector.setItem(5, listeners.t6is);
            teamselector.setItem(6, listeners.t7is);
            teamselector.setItem(7, listeners.t8is);
            teamselector.setItem(8, listeners.t9is);
            if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.NETHER_STAR)) {
                if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains(ConfigLanguage.getString("teamselection"))) {
                    e.getPlayer().openInventory(teamselector);
                } else if (e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().contains(ConfigLanguage.getString("teamselection"))) {
                    e.setCancelled(true);
                }
            }
        }
        if (e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }
    }

}
