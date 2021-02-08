package functions;

import config.ConfigLanguage;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import main.main;
import functions.formatString;

import java.util.concurrent.ThreadLocalRandom;

public class startGame {

    public static void startGame() {

    CountDown.CountDown();
        for (final Player aplayer : Bukkit.getOnlinePlayers()) {
        if (!main.t1.contains(aplayer) && !main.t2.contains(aplayer) && !main.t3.contains(aplayer) && !main.t4.contains(aplayer) && !main.t5.contains(aplayer) && !main.t6.contains(aplayer) && !main.t7.contains(aplayer) && !main.t8.contains(aplayer) && !main.t9.contains(aplayer)) {
            if (main.t1.size() < main.Teamsize) {
                main.t1.add(aplayer);
            } else if (main.t2.size() < main.Teamsize) {
                main.t2.add(aplayer);
            } else if (main.t3.size() < main.Teamsize) {
                main.t3.add(aplayer);
            } else if (main.t4.size() < main.Teamsize) {
                main.t4.add(aplayer);
            } else if (main.t5.size() < main.Teamsize) {
                main.t5.add(aplayer);
            } else if (main.t6.size() < main.Teamsize) {
                main.t6.add(aplayer);
            } else if (main.t7.size() < main.Teamsize) {
                main.t7.add(aplayer);
            } else if (main.t8.size() < main.Teamsize) {
                main.t8.add(aplayer);
            } else if (main.t9.size() < main.Teamsize) {
                main.t9.add(aplayer);
            }
        }
        if (main.t1.contains(aplayer)) {
            aplayer.setPlayerListName("§6" + aplayer.getName());
        } else if (main.t2.contains(aplayer)) {
            aplayer.setPlayerListName("§c" + aplayer.getName());
        } else if (main.t3.contains(aplayer)) {
            aplayer.setPlayerListName("§d" + aplayer.getName());
        } else if (main.t4.contains(aplayer)) {
            aplayer.setPlayerListName("§f" + aplayer.getName());
        } else if (main.t5.contains(aplayer)) {
            aplayer.setPlayerListName("§1" + aplayer.getName());
        } else if (main.t6.contains(aplayer)) {
            aplayer.setPlayerListName("§e" + aplayer.getName());
        } else if (main.t7.contains(aplayer)) {
            aplayer.setPlayerListName("§a" + aplayer.getName());
        } else if (main.t8.contains(aplayer)) {
            aplayer.setPlayerListName("§7" + aplayer.getName());
        } else {
            if (!main.t9.contains(aplayer)) {
                continue;
            }
            aplayer.setPlayerListName("§5" + aplayer.getName());
        }
    }
    main.GameStarted = true;
        main.LobbyStatus = false;
        ConfigLanguage.loadLanguageConfiguration();
    final int l1x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l1z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l2x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l2z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l3x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l3z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l4x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l4z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l5x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l5z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l6x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l6z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l7x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l7z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l8x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l8z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l9x = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final int l9z = ThreadLocalRandom.current().nextInt(-main.SpawnArea, main.SpawnArea);
    final Location l1 = new Location(Bukkit.getWorld("world"), l1x, Bukkit.getWorld("world").getHighestBlockAt(l1x, l1z).getY(), l1z);
    final Location l2 = new Location(Bukkit.getWorld("world"), l2x, Bukkit.getWorld("world").getHighestBlockAt(l2x, l2z).getY(), l2z);
    final Location l3 = new Location(Bukkit.getWorld("world"), l3x, Bukkit.getWorld("world").getHighestBlockAt(l3x, l3z).getY(), l3z);
    final Location l4 = new Location(Bukkit.getWorld("world"), l4x, Bukkit.getWorld("world").getHighestBlockAt(l4x, l4z).getY(), l4z);
    final Location l5 = new Location(Bukkit.getWorld("world"), l5x, Bukkit.getWorld("world").getHighestBlockAt(l5x, l5z).getY(), l5z);
    final Location l6 = new Location(Bukkit.getWorld("world"), l6x, Bukkit.getWorld("world").getHighestBlockAt(l6x, l6z).getY(), l6z);
    final Location l7 = new Location(Bukkit.getWorld("world"), l7x, Bukkit.getWorld("world").getHighestBlockAt(l7x, l7z).getY(), l7z);
    final Location l8 = new Location(Bukkit.getWorld("world"), l8x, Bukkit.getWorld("world").getHighestBlockAt(l8x, l8z).getY(), l8z);
    final Location l9 = new Location(Bukkit.getWorld("world"), l9x, Bukkit.getWorld("world").getHighestBlockAt(l9x, l9z).getY(), l9z);
        Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("FollowingTeamTeleported"));
        if (!main.t1.isEmpty()) {
        if (main.t1.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T1OnePlayer").replace("%player%", main.t1.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T1TwoPlayer").replace("%player1%", main.t1.get(0).getName()).replace("%player2%", main.t1.get(1).getName()));
        }
    }
        if (!main.t2.isEmpty()) {
        if (main.t2.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T2OnePlayer").replace("%player%", main.t2.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T2TwoPlayer").replace("%player1%", main.t2.get(0).getName()).replace("%player2%", main.t2.get(1).getName()));
        }
    }
        if (!main.t3.isEmpty()) {
        if (main.t3.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T3OnePlayer").replace("%player%", main.t3.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T3TwoPlayer").replace("%player1%", main.t3.get(0).getName()).replace("%player2%", main.t3.get(1).getName()));
        }
    }
        if (!main.t4.isEmpty()) {
        if (main.t4.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T4OnePlayer").replace("%player%", main.t4.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T4TwoPlayer").replace("%player1%", main.t4.get(0).getName()).replace("%player2%", main.t4.get(1).getName()));
        }
    }
        if (!main.t5.isEmpty()) {
        if (main.t5.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T5OnePlayer").replace("%player%", main.t5.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T5TwoPlayer").replace("%player1%", main.t5.get(0).getName()).replace("%player2%", main.t5.get(1).getName()));
        }
    }
        if (!main.t6.isEmpty()) {
        if (main.t6.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T6OnePlayer").replace("%player%", main.t6.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T6TwoPlayer").replace("%player1%", main.t6.get(0).getName()).replace("%player2%", main.t6.get(1).getName()));
        }
    }
        if (!main.t7.isEmpty()) {
        if (main.t7.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T7OnePlayer").replace("%player%", main.t7.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T7TwoPlayer").replace("%player1%", main.t7.get(0).getName()).replace("%player2%", main.t7.get(1).getName()));
        }
    }
        if (!main.t8.isEmpty()) {
        if (main.t8.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T8OnePlayer").replace("%player%", main.t8.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T8TwoPlayer").replace("%player1%", main.t8.get(0).getName()).replace("%player2%", main.t8.get(1).getName()));
        }
    }
        if (!main.t9.isEmpty()) {
        if (main.t9.size() == 1) {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T9OnePlayer").replace("%player%", main.t9.get(0).getName()));
        } else {
            Bukkit.broadcastMessage(ConfigLanguage.getString("prefix") + " " + ConfigLanguage.getString("T9TwoPlayer").replace("%player1%", main.t9.get(0).getName()).replace("%player2%", main.t9.get(1).getName()));
        }
    }
        for (final Player tplayer : main.t1) {
        tplayer.teleport(l1);
    }
        for (final Player tplayer : main.t2) {
        tplayer.teleport(l2);
    }
        for (final Player tplayer : main.t3) {
        tplayer.teleport(l3);
    }
        for (final Player tplayer : main.t4) {
        tplayer.teleport(l4);
    }
        for (final Player tplayer : main.t5) {
        tplayer.teleport(l5);
    }
        for (final Player tplayer : main.t6) {
        tplayer.teleport(l6);
    }
        for (final Player tplayer : main.t7) {
        tplayer.teleport(l7);
    }
        for (final Player tplayer : main.t8) {
        tplayer.teleport(l8);
    }
        for (final Player tplayer : main.t9) {
        tplayer.teleport(l9);
    }
        for (final Player soundplayer : Bukkit.getOnlinePlayers()) {
        soundplayer.playSound(soundplayer.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 0.3f, 1.0f);
    }
        for (final Player player : Bukkit.getOnlinePlayers()) {
        player.setAllowFlight(false);
        player.getPlayer().setFlying(false);
        player.getPlayer().setCollidable(true);
        player.setHealth(20.0);
        player.setFoodLevel(20);
        player.getPlayer().getInventory().clear();
        final ItemStack boat = new ItemStack(Material.OAK_BOAT, 1);
        final ItemMeta boatmeta = boat.getItemMeta();
        boatmeta.setDisplayName(ConfigLanguage.getString("BoatName"));
        boat.setItemMeta(boatmeta);
        player.getInventory().setItem(0, boat);
        player.sendMessage(String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("StartMessage"));
        player.setPlayerListHeader(ConfigLanguage.getString("tablistheaderingame"));
        final String foundt1 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam1");
        final String foundt2 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam2");
        final String foundt3 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam3");
        final String foundt4 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam4");
        final String foundt5 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam5");
        final String foundt6 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam6");
        final String foundt7 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam7");
        final String foundt8 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam8");
        final String foundt9 = String.valueOf(ConfigLanguage.getString("prefix")) + " " + ConfigLanguage.getString("teamfounditemTeam9");
        new BukkitRunnable() {
            public void run() {
                if (main.t1.contains(player)) {
                    player.setPlayerListName("\u00ef¿½6" + player.getName());
                }
                if (main.t2.contains(player)) {
                    player.setPlayerListName("\u00ef¿½c" + player.getName());
                }
                if (main.t3.contains(player)) {
                    player.setPlayerListName("\u00ef¿½d" + player.getName());
                }
                if (main.t4.contains(player)) {
                    player.setPlayerListName("\u00ef¿½f" + player.getName());
                }
                if (main.t5.contains(player)) {
                    player.setPlayerListName("\u00ef¿½1" + player.getName());
                }
                if (main.t6.contains(player)) {
                    player.setPlayerListName("\u00ef¿½e" + player.getName());
                }
                if (main.t7.contains(player)) {
                    player.setPlayerListName("\u00ef¿½a" + player.getName());
                }
                if (main.t8.contains(player)) {
                    player.setPlayerListName("\u00ef¿½7" + player.getName());
                }
                if (main.t9.contains(player)) {
                    player.setPlayerListName("\u00ef¿½5" + player.getName());
                }
                final String Zeit = " " + ChatColor.GRAY + "||" + " " + ChatColor.GOLD + main.hours + " " + ChatColor.GREEN + main.HH + " " + ChatColor.GOLD + main.minutes + " " + ChatColor.GREEN + main.MM + " " + ChatColor.GOLD + main.seconds + " " + ChatColor.GREEN + main.SS;
                if (main.t1.contains(player)) {
                    final String actionbar1 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems1));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar1 + Zeit));
                } else if (main.t2.contains(player)) {
                    final String actionbar2 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems2));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar2 + Zeit));
                } else if (main.t3.contains(player)) {
                    final String actionbar3 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems3));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar3 + Zeit));
                } else if (main.t4.contains(player)) {
                    final String actionbar4 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems4));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar4 + Zeit));
                } else if (main.t5.contains(player)) {
                    final String actionbar5 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems5));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar5 + Zeit));
                } else if (main.t6.contains(player)) {
                    final String actionbar6 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems6));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar6 + Zeit));
                } else if (main.t7.contains(player)) {
                    final String actionbar7 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems7));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar7 + Zeit));
                } else if (main.t8.contains(player)) {
                    final String actionbar8 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems8));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar8 + Zeit));
                } else if (main.t9.contains(player)) {
                    final String actionbar9 = ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems9));
                    player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar9 + Zeit));
                }
                for (final Player p : Bukkit.getOnlinePlayers()) {
                    if (p.getInventory().containsAtLeast(main.b1, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b1t1) {
                                main.b1t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b1);
                                main.ColorGrayb1t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b1t2) {
                                main.b1t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b1);
                                main.ColorGrayb1t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b1t4) {
                                main.b1t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b1);
                                main.ColorGrayb1t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b1t5) {
                                main.b1t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b1);
                                main.ColorGrayb1t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b1t6) {
                                main.b1t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b1);
                                main.ColorGrayb1t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b1t7) {
                                main.b1t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b1);
                                main.ColorGrayb1t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b1t8) {
                                main.b1t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b1);
                                main.ColorGrayb1t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b1t9) {
                                main.b1t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b1);
                                main.ColorGrayb1t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b1.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b1t3) {
                            main.b1t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b1);
                            main.ColorGrayb1t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b1.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b2, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b2t1) {
                                main.b2t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b2);
                                main.ColorGrayb2t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b2t2) {
                                main.b2t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b2);
                                main.ColorGrayb2t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b2t4) {
                                main.b2t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b2);
                                main.ColorGrayb2t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b2t5) {
                                main.b2t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b2);
                                main.ColorGrayb2t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b2t6) {
                                main.b2t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b2);
                                main.ColorGrayb2t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b2t7) {
                                main.b2t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b2);
                                main.ColorGrayb2t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b2t8) {
                                main.b2t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b2);
                                main.ColorGrayb2t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b2t9) {
                                main.b2t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b2);
                                main.ColorGrayb2t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b2.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b2t3) {
                            main.b2t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b2);
                            main.ColorGrayb2t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b2.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b3, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b3t1) {
                                main.b3t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b3);
                                main.ColorGrayb3t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b3t2) {
                                main.b3t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b3);
                                main.ColorGrayb3t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b3t4) {
                                main.b3t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b3);
                                main.ColorGrayb3t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b3t5) {
                                main.b3t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b3);
                                main.ColorGrayb3t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b3t6) {
                                main.b3t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b3);
                                main.ColorGrayb3t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b3t7) {
                                main.b3t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b3);
                                main.ColorGrayb3t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b3t8) {
                                main.b3t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b3);
                                main.ColorGrayb3t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b3t9) {
                                main.b3t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b3);
                                main.ColorGrayb3t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b3.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b3t3) {
                            main.b3t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b3);
                            main.ColorGrayb3t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b3.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b4, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b4t1) {
                                main.b4t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b4);
                                main.ColorGrayb4t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b4t2) {
                                main.b4t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b4);
                                main.ColorGrayb4t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b4t4) {
                                main.b4t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b4);
                                main.ColorGrayb4t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b4t5) {
                                main.b4t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b4);
                                main.ColorGrayb4t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b4t6) {
                                main.b4t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b4);
                                main.ColorGrayb4t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b4t7) {
                                main.b4t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b4);
                                main.ColorGrayb4t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b4t8) {
                                main.b4t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b4);
                                main.ColorGrayb4t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b4t9) {
                                main.b4t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b4);
                                main.ColorGrayb4t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b4.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b4t3) {
                            main.b4t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b4);
                            main.ColorGrayb4t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b4.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b5, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b5t1) {
                                main.b5t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b5);
                                main.ColorGrayb5t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b5t2) {
                                main.b5t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b5);
                                main.ColorGrayb5t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b5t4) {
                                main.b5t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b5);
                                main.ColorGrayb5t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b5t5) {
                                main.b5t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b5);
                                main.ColorGrayb5t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b5t6) {
                                main.b5t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b5);
                                main.ColorGrayb5t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b5t7) {
                                main.b5t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b5);
                                main.ColorGrayb5t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b5t8) {
                                main.b5t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b5);
                                main.ColorGrayb5t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b5t9) {
                                main.b5t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b5);
                                main.ColorGrayb5t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b5.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b5t3) {
                            main.b5t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b5);
                            main.ColorGrayb5t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b5.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b6, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b6t1) {
                                main.b6t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b6);
                                main.ColorGrayb6t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b6t2) {
                                main.b6t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b6);
                                main.ColorGrayb6t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b6t4) {
                                main.b6t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b6);
                                main.ColorGrayb6t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b6t5) {
                                main.b6t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b6);
                                main.ColorGrayb6t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b6t6) {
                                main.b6t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b6);
                                main.ColorGrayb6t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b6t7) {
                                main.b6t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b6);
                                main.ColorGrayb6t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b6t8) {
                                main.b6t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b6);
                                main.ColorGrayb6t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b6t9) {
                                main.b6t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b6);
                                main.ColorGrayb6t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b6.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b6t3) {
                            main.b6t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b6);
                            main.ColorGrayb6t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b6.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b7, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b7t1) {
                                main.b7t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b7);
                                main.ColorGrayb7t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b7t2) {
                                main.b7t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b7);
                                main.ColorGrayb7t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b7t4) {
                                main.b7t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b7);
                                main.ColorGrayb7t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b7t5) {
                                main.b7t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b7);
                                main.ColorGrayb7t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b7t6) {
                                main.b7t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b7);
                                main.ColorGrayb7t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b7t7) {
                                main.b7t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b7);
                                main.ColorGrayb7t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b7t8) {
                                main.b7t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b7);
                                main.ColorGrayb7t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b7t9) {
                                main.b7t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b7);
                                main.ColorGrayb7t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b7.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b7t3) {
                            main.b7t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b7);
                            main.ColorGrayb7t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b7.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b8, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b8t1) {
                                main.b8t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b8);
                                main.ColorGrayb8t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b8t2) {
                                main.b8t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b8);
                                main.ColorGrayb8t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b8t4) {
                                main.b8t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b8);
                                main.ColorGrayb8t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b8t5) {
                                main.b8t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b8);
                                main.ColorGrayb8t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b8t6) {
                                main.b8t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b8);
                                main.ColorGrayb8t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b8t7) {
                                main.b8t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b8);
                                main.ColorGrayb8t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b8t8) {
                                main.b8t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b8);
                                main.ColorGrayb8t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b8t9) {
                                main.b8t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b8);
                                main.ColorGrayb8t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b8.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b8t3) {
                            main.b8t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b8);
                            main.ColorGrayb8t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b8.getType().name())));
                        }
                    }
                    if (p.getInventory().containsAtLeast(main.b9, 1)) {
                        if (main.t1.contains(p)) {
                            if (!main.b9t1) {
                                main.b9t1 = true;
                                ++main.gotitems1;
                                main.foundItemsT1.add(main.b9);
                                main.ColorGrayb9t1 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt1.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t2.contains(p)) {
                            if (!main.b9t2) {
                                main.b9t2 = true;
                                ++main.gotitems2;
                                main.foundItemsT2.add(main.b9);
                                main.ColorGrayb9t2 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt2.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t4.contains(p)) {
                            if (!main.b9t4) {
                                main.b9t4 = true;
                                ++main.gotitems4;
                                main.foundItemsT4.add(main.b9);
                                main.ColorGrayb9t4 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt4.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t5.contains(p)) {
                            if (!main.b9t5) {
                                main.b9t5 = true;
                                ++main.gotitems5;
                                main.foundItemsT5.add(main.b9);
                                main.ColorGrayb9t5 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt5.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t6.contains(p)) {
                            if (!main.b9t6) {
                                main.b9t6 = true;
                                ++main.gotitems6;
                                main.foundItemsT6.add(main.b9);
                                main.ColorGrayb9t6 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt6.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t7.contains(p)) {
                            if (!main.b9t7) {
                                main.b9t7 = true;
                                ++main.gotitems7;
                                main.foundItemsT7.add(main.b9);
                                main.ColorGrayb9t7 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt7.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t8.contains(p)) {
                            if (!main.b9t8) {
                                main.b9t8 = true;
                                ++main.gotitems8;
                                main.foundItemsT8.add(main.b9);
                                main.ColorGrayb9t8 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt8.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t9.contains(p)) {
                            if (!main.b9t9) {
                                main.b9t9 = true;
                                ++main.gotitems9;
                                main.foundItemsT9.add(main.b9);
                                main.ColorGrayb9t9 = ChatColor.GREEN;
                                Bukkit.broadcastMessage(foundt9.replace("%item%", formatString.item(main.b9.getType().name())));
                            }
                        } else if (main.t3.contains(p) && !main.b9t3) {
                            main.b9t3 = true;
                            ++main.gotitems3;
                            main.foundItemsT3.add(main.b9);
                            main.ColorGrayb9t3 = ChatColor.GREEN;
                            Bukkit.broadcastMessage(foundt3.replace("%item%", formatString.item(main.b9.getType().name())));
                        }
                    }
                    if (main.gotitems1 == 9) {
                        if (main.t1.size() == 1) {
                            main.winner1 = main.t1.get(0).getName();
                        } else {
                            main.winner1 = main.t1.get(0).getName();
                            main.winner2 = main.t1.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems2 == 9) {
                        if (main.t2.size() == 1) {
                            main.winner1 = main.t2.get(0).getName();
                        } else {
                            main.winner1 = main.t2.get(0).getName();
                            main.winner2 = main.t2.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems3 == 9) {
                        if (main.t3.size() == 1) {
                            main.winner1 = main.t3.get(0).getName();
                        } else {
                            main.winner1 = main.t3.get(0).getName();
                            main.winner2 = main.t3.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems4 == 9) {
                        if (main.t4.size() == 1) {
                            main.winner1 = main.t4.get(0).getName();
                        } else {
                            main.winner1 = main.t4.get(0).getName();
                            main.winner2 = main.t4.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems5 == 9) {
                        if (main.t5.size() == 1) {
                            main.winner1 = main.t5.get(0).getName();
                        } else {
                            main.winner1 = main.t5.get(0).getName();
                            main.winner2 = main.t5.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems6 == 9) {
                        if (main.t6.size() == 1) {
                            main.winner1 = main.t6.get(0).getName();
                        } else {
                            main.winner1 = main.t6.get(0).getName();
                            main.winner2 = main.t6.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems7 == 9) {
                        if (main.t7.size() == 1) {
                            main.winner1 = main.t7.get(0).getName();
                        } else {
                            main.winner1 = main.t7.get(0).getName();
                            main.winner2 = main.t7.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems8 == 9) {
                        if (main.t8.size() == 1) {
                            main.winner1 = main.t8.get(0).getName();
                        } else {
                            main.winner1 = main.t8.get(0).getName();
                            main.winner2 = main.t8.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                    if (main.gotitems9 == 9) {
                        if (main.t9.size() == 1) {
                            main.winner1 = main.t9.get(0).getName();
                        } else {
                            main.winner1 = main.t9.get(0).getName();
                            main.winner2 = main.t9.get(1).getName();
                        }
                        main.isRestarting = true;
                        RestartCountDown.RestartCountDown();
                        this.cancel();
                    }
                }
            }
        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
    }
}



}
