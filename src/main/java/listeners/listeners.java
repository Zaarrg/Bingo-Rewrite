package listeners;

import config.ConfigLanguage;
import config.data;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.*;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import main.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class listeners implements Listener {

    public static double i;
    public static Inventory gameset;

    //Scoreboard Items Variables
    public static ItemStack t1is;
    public static ItemStack t2is;
    public static ItemStack t3is;
    public static ItemStack t4is;
    public static ItemStack t5is;
    public static ItemStack t6is;
    public static ItemStack t7is;
    public static ItemStack t8is;
    public static ItemStack t9is;
    public static ItemStack s1;
    public static ItemStack s2;
    public static ItemStack s3;
    public static ItemStack s4;
    public static ItemStack s5;
    public static ItemStack s6;
    public static ItemStack s7;
    public static ItemStack s8;
    public static ItemStack s9;
    public static ItemStack s10;
    public static ItemStack s11;
    public static ItemStack s12;
    public static ItemStack s13;
    public static ItemStack s14;
    public static ItemStack s15;
    public static ItemStack s16;
    public static ItemStack s17;
    public static ItemStack s18;
    public static ItemStack f1;
    public static ItemStack f2;
    public static ItemStack g1;
    public static ItemStack g2;
    public static ItemStack g3;
    public static ItemStack g4;
    public static ItemStack g5;
    public static ItemStack b1;
    public static ItemStack b2;
    public static ItemStack ph;
    public static ItemStack p1;
    public static ItemStack p2;
    public static ItemStack p3;
    public static ItemStack back;
    ArrayList<Player> livingplayer;
    int seconds;

    static {
        listeners.i = 0.05;
        listeners.gameset = Bukkit.createInventory(null, 45, "§2Game Settings");
    }





    @EventHandler
    public void onTarget(final EntityTargetLivingEntityEvent e) {
        if (e.getTarget() instanceof Player && (e.getTarget().isInvulnerable() || main.LobbyStatus)) {
            e.setCancelled(true);
        }
        if (!main.damage) {
            e.setCancelled(true);
        } else if (main.damage) {
            return;
        }

        if (main.timerpause) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onFoodChange(final FoodLevelChangeEvent e) {
        final Player p = (Player) e.getEntity();
        if (main.LobbyStatus || p.isInvulnerable()) {
            e.setCancelled(true);
        }
        if (!main.hunger) {
            e.setCancelled(true);
        } else if (main.hunger) {
            return;
        }

        if (main.timerpause) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDeath(final PlayerDeathEvent e) {
        if (main.keepinventory) {
            e.setKeepInventory(true);
        } else if (!main.keepinventory) {
            e.setKeepInventory(false);
        }
        e.setDeathMessage(null);
    }

    @EventHandler
    public void onRespawn(final PlayerRespawnEvent e) {
        final int l1x = ThreadLocalRandom.current().nextInt(-3000, 3000);
        final int l1z = ThreadLocalRandom.current().nextInt(-3000, 3000);
        final Location l1 = new Location(Bukkit.getWorld("world"), l1x, Bukkit.getWorld("world").getHighestBlockAt(l1x, l1z).getY(), l1z);
        e.setRespawnLocation(l1);
        e.getPlayer().teleport(l1);
        e.getPlayer().playSound(e.getPlayer().getLocation(), Sound.ITEM_CHORUS_FRUIT_TELEPORT, 0.3f, 1.0f);
        Bukkit.broadcastMessage(ConfigLanguage.getString("deathmessage").replace("%player%", e.getPlayer().getName()));
        final ItemStack boat = new ItemStack(Material.OAK_BOAT, 1);
        final ItemMeta boatmeta = boat.getItemMeta();
        boatmeta.setDisplayName(ConfigLanguage.getString("BoatName"));
        boat.setItemMeta(boatmeta);
        e.getPlayer().getInventory().setItem(0, boat);
    }




        @EventHandler
        public void onQuit ( final PlayerQuitEvent e){
            if (!main.GameStarted && !main.isRestarting) {
                if (main.t1.contains(e.getPlayer())) {
                    main.t1.remove(e.getPlayer());
                } else if (main.t2.contains(e.getPlayer())) {
                    main.t2.remove(e.getPlayer());
                } else if (main.t3.contains(e.getPlayer())) {
                    main.t3.remove(e.getPlayer());
                } else if (main.t4.contains(e.getPlayer())) {
                    main.t4.remove(e.getPlayer());
                } else if (main.t5.contains(e.getPlayer())) {
                    main.t5.remove(e.getPlayer());
                } else if (main.t6.contains(e.getPlayer())) {
                    main.t6.remove(e.getPlayer());
                } else if (main.t7.contains(e.getPlayer())) {
                    main.t7.remove(e.getPlayer());
                } else if (main.t8.contains(e.getPlayer())) {
                    main.t8.remove(e.getPlayer());
                } else main.t9.remove(e.getPlayer());
                e.setQuitMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("leftserverlobby").replace("%player%", e.getPlayer().getName()));
            }
            if (!main.isRestarting && main.GameStarted) {
                if (e.getPlayer().getGameMode() == GameMode.SURVIVAL) {
                    if (main.t1.contains(e.getPlayer())) {
                        main.t1.remove(e.getPlayer());
                        main.l1.add(e.getPlayer().getUniqueId());
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
                    e.setQuitMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("leftserveringame").replace("%player%", e.getPlayer().getName()));
                } else {
                    e.setQuitMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("leftserveringamespectator").replace("%player%", e.getPlayer().getName()));
                }
                for (final Player player : Bukkit.getOnlinePlayers()) {
                    ++main.players;
                    if (player.getGameMode() == GameMode.SPECTATOR) {
                        ++main.spectator;
                    }
                }
                --main.players;
                if (main.spectator == main.players && !main.GameStarted) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        player.kickPlayer(String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("gameisrestarting"));
                    }
                    new BukkitRunnable() {
                        public void run() {
                            functions.noPlayerRestart.noPlayerRestart();
                        }
                    }.runTaskLater(main.getPlugin(), 80L);
                }
                main.players = 0;
                main.spectator = 0;
            }
        }


    @EventHandler
    public void onAsyncChat(final AsyncPlayerChatEvent e) {
        if (e.getPlayer().hasPermission("bingo.gamemaster")) {
            if (main.t1.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam1").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t2.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam2").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t3.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam3").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t4.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam4").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t5.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam5").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t6.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam6").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t7.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam7").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t8.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam8").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else if (main.t9.contains(e.getPlayer())) {
                e.setFormat(ConfigLanguage.getString("chatformatTeam9").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
            } else {
                e.setFormat(ConfigLanguage.getString("chatformatwithoutteam").replace("%player%", String.valueOf(ConfigLanguage.getString("chatcolourGamemaster")) + e.getPlayer().getName()).replace("%message%", e.getMessage()));
            }
        } else if (main.t1.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam1").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t2.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam2").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t3.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam3").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t4.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam4").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t5.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam5").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t6.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam6").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t7.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam7").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t8.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam8").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else if (main.t9.contains(e.getPlayer())) {
            e.setFormat(ConfigLanguage.getString("chatformatTeam9").replace("%player%", e.getPlayer().getName()).replace("%message%", e.getMessage()));
        } else {
            e.setFormat(ConfigLanguage.getString("chatformatwithoutteam").replace("%player%", String.valueOf(ConfigLanguage.getString("chatcolourDefaultUser")) + e.getPlayer().getName()).replace("%message%", e.getMessage()));
        }
    }

    @EventHandler
    public void onBroadcast(final BroadcastMessageEvent e) {
        for (final Player player : Bukkit.getOnlinePlayers()) {



            if (e.getMessage().contains(ConfigLanguage.getString("teamfounditemTeam1").substring(10, 20))) {
                scoreboards.Scoreboards.setLobbyScoreboardWithTeam(player);
            }
        }
    }

    @EventHandler
    public void onDrop(final PlayerDropItemEvent e) {
        if (main.LobbyStatus || e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onTeleport(final PlayerTeleportEvent e) {
        if (main.GameStarted) {
            if (!main.randomized) {
                functions.RandomItems.getRandomItems();
            }
            scoreboards.Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
        }
    }



}
