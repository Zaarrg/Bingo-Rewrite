package listeners;

import config.ConfigLanguage;
import functions.rejoin;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import scoreboards.Scoreboards;
import main.main;

public class onJoin implements Listener {

    @EventHandler
    public void onJoin(final PlayerJoinEvent e) {
        Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
        e.getPlayer().setPlayerListFooter(ConfigLanguage.getString("tablistfooter"));
        if (main.t1.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam1Colour")) + e.getPlayer().getName());
        } else if (main.t2.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam2Colour")) + e.getPlayer().getName());
        } else if (main.t3.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam3Colour")) + e.getPlayer().getName());
        } else if (main.t4.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam4Colour")) + e.getPlayer().getName());
        } else if (main.t5.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam5Colour")) + e.getPlayer().getName());
        } else if (main.t6.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam6Colour")) + e.getPlayer().getName());
        } else if (main.t7.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam7Colour")) + e.getPlayer().getName());
        } else if (main.t8.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam7Colour")) + e.getPlayer().getName());
        } else if (main.t9.contains(e.getPlayer())) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistTeam9Colour")) + e.getPlayer().getName());
        } else if (e.getPlayer().hasPermission("bingo.gamemaster")) {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistGamemasterColour")) + e.getPlayer().getName());
        } else {
            e.getPlayer().setPlayerListName(ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getString("TablistDefaultUserColour")) + e.getPlayer().getName());
        }
        if (!main.isRestarting) {
            if (main.GameStarted) {
                rejoin.onrejoin(e.getPlayer());
                e.getPlayer().setPlayerListHeader(ConfigLanguage.getString("tablistheaderingame"));
                e.getPlayer().setAllowFlight(false);
                e.getPlayer().setFlying(false);
                e.getPlayer().setInvulnerable(false);
                e.getPlayer().setCollidable(true);
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
                Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
                if (e.getPlayer().getGameMode() == GameMode.SPECTATOR) {
                    e.setJoinMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("spectatorjoined").replace("%player%", e.getPlayer().getName()));
                } else {
                    e.setJoinMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("playerjoined").replace("%player%", e.getPlayer().getName()));
                }
            } else {
                e.getPlayer().getInventory().clear();
                e.getPlayer().setGameMode(GameMode.SURVIVAL);
                e.getPlayer().setHealth(20.0);
                e.getPlayer().setFoodLevel(20);
                e.getPlayer().setPlayerListHeader(ConfigLanguage.getString("tablistheaderlobby"));
                final Location startloc = Bukkit.getWorld("world").getSpawnLocation();
                e.getPlayer().teleport(startloc);
                if (Bukkit.getServer().getOnlinePlayers().size() >= 19) {
                    e.setJoinMessage(null);
                    e.getPlayer().kickPlayer(ConfigLanguage.getString("lobbyisfullkick"));
                } else {
                    Scoreboards.setLobbyScoreboardWithTeam(e.getPlayer());
                    e.setJoinMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("playerjoined").replace("%player%", e.getPlayer().getName()));
                    if (Bukkit.getServer().getOnlinePlayers().size() == 6) {
                        Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamewillstart"));
                        new BukkitRunnable() {
                            public void run() {
                                final boolean gameStarted = main.GameStarted;
                                if (main.seconds != 0) {
                                    Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamestartsin").replace("%seconds%", String.valueOf(main.seconds)));
                                    for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
                                        soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 0.3f, 1.0f);
                                    }
                                    --main.seconds;
                                } else {
                                    Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("gamestarts"));
                                    this.cancel();
                                    main.seconds = 10;
                                    functions.startGame.startGame();
                                }
                            }
                        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
                    }
                }
                final ItemStack is = new ItemStack(Material.NETHER_STAR, 1);
                final ItemMeta im = is.getItemMeta();
                im.setDisplayName(ConfigLanguage.getString("teamselection"));
                is.setItemMeta(im);
                e.getPlayer().getInventory().setItem(4, is);
                e.getPlayer().setAllowFlight(false);
                e.getPlayer().setFlying(false);
                e.getPlayer().setInvulnerable(false);
                e.getPlayer().setCollidable(false);
            }
        } else {
            e.getPlayer().kickPlayer(ConfigLanguage.getString("roundisrestartingkick"));
        }
    }




}
