package functions;

import config.ConfigLanguage;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import main.main;

public class CountDown {

    public static void CountDown() {
        new BukkitRunnable() {
            public void run() {
                if (main.GameStarted) {
                    for (final Player player : Bukkit.getOnlinePlayers()) {
                        final String Zeit = " " + ChatColor.GRAY + "||" + " " + ChatColor.GOLD + main.hours + " " + ChatColor.GREEN + main.HH + " " + ChatColor.GOLD + main.minutes + " " + ChatColor.GREEN + main.MM + " " + ChatColor.GOLD + main.seconds + " " + ChatColor.GREEN + main.SS;
                        if (main.t1.contains(player)) {
                            final String actionbar1 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems1));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar1 + Zeit));
                        } else if (main.t2.contains(player)) {
                            final String actionbar2 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems2));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar2 + Zeit));
                        } else if (main.t3.contains(player)) {
                            final String actionbar3 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems3));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar3 + Zeit));
                        } else if (main.t4.contains(player)) {
                            final String actionbar4 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems4));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar4 + Zeit));
                        } else if (main.t5.contains(player)) {
                            final String actionbar5 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems5));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar5 + Zeit));
                        } else if (main.t6.contains(player)) {
                            final String actionbar6 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems6));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar6 + Zeit));
                        } else if (main.t7.contains(player)) {
                            final String actionbar7 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems7));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar7 + Zeit));
                        } else if (main.t8.contains(player)) {
                            final String actionbar8 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems8));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar8 + Zeit));
                        } else {
                            if (!main.t9.contains(player)) {
                                continue;
                            }
                            final String actionbar9 = config.ConfigLanguage.getString("ActionBar").replace("%gotitems%", String.valueOf(main.gotitems9));
                            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(actionbar9 + Zeit));
                        }
                    }
                }
                if (main.seconds == 1) {
                    main.SS = ConfigLanguage.getString("second");
                } else if (main.seconds == 0) {
                    main.SS = ConfigLanguage.getString("seconds");
                } else if (main.seconds > 1) {
                    main.SS = ConfigLanguage.getString("seconds");
                }
                if (main.minutes == 1) {
                    main.MM = ConfigLanguage.getString("minute");
                } else if (main.minutes == 0) {
                    main.MM = ConfigLanguage.getString("minutes");
                } else if (main.minutes > 1) {
                    main.MM = ConfigLanguage.getString("minutes");
                }
                if (main.hours == 1) {
                    main.HH = ConfigLanguage.getString("hour");
                } else if (main.hours > 1) {
                    main.HH = ConfigLanguage.getString("hours");
                } else if (main.hours == 0) {
                    main.HH = ConfigLanguage.getString("hours");
                }
                if (main.timercountdown && !main.timerpause) {
                    if (main.seconds > 0) {
                        --main.seconds;
                    } else if (main.seconds == 0 && main.minutes > 0) {
                        --main.minutes;
                        main.seconds = 60;
                    } else if (main.minutes == 0 && main.hours > 0) {
                        --main.hours;
                        main.minutes = 60;
                    } else if (main.minutes == 0 && main.seconds == 0 && main.hours == 0 && main.timercountdown) {
                        Bukkit.broadcastMessage(config.ConfigLanguage.getString("prefix") + " " + ChatColor.RED + ConfigLanguage.getString("timeend"));
                        if (main.gotitems1 > main.gotitems2 && main.gotitems1 > main.gotitems3 && main.gotitems1 > main.gotitems4 && main.gotitems1 > main.gotitems5 && main.gotitems1 > main.gotitems6 && main.gotitems1 > main.gotitems7 && main.gotitems1 > main.gotitems8 && main.gotitems1 > main.gotitems9) {
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
                        if (main.gotitems2 > main.gotitems1 && main.gotitems2 > main.gotitems3 && main.gotitems2 > main.gotitems4 && main.gotitems2 > main.gotitems5 && main.gotitems2 > main.gotitems6 && main.gotitems2 > main.gotitems7 && main.gotitems2 > main.gotitems8 && main.gotitems2 > main.gotitems9) {
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
                        if (main.gotitems3 > main.gotitems2 && main.gotitems3 > main.gotitems1 && main.gotitems3 > main.gotitems4 && main.gotitems3 > main.gotitems5 && main.gotitems3 > main.gotitems6 && main.gotitems3 > main.gotitems7 && main.gotitems3 > main.gotitems8 && main.gotitems3 > main.gotitems9) {
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
                        if (main.gotitems4 > main.gotitems2 && main.gotitems4 > main.gotitems3 && main.gotitems4 > main.gotitems1 && main.gotitems4 > main.gotitems5 && main.gotitems4 > main.gotitems6 && main.gotitems4 > main.gotitems7 && main.gotitems4 > main.gotitems8 && main.gotitems4 > main.gotitems9) {
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
                        if (main.gotitems5 > main.gotitems2 && main.gotitems5 > main.gotitems3 && main.gotitems5 > main.gotitems4 && main.gotitems5 > main.gotitems1 && main.gotitems5 > main.gotitems6 && main.gotitems5 > main.gotitems7 && main.gotitems5 > main.gotitems8 && main.gotitems5 > main.gotitems9) {
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
                        if (main.gotitems6 > main.gotitems2 && main.gotitems6 > main.gotitems3 && main.gotitems6 > main.gotitems4 && main.gotitems6 > main.gotitems5 && main.gotitems6 > main.gotitems1 && main.gotitems6 > main.gotitems7 && main.gotitems6 > main.gotitems8 && main.gotitems6 > main.gotitems9) {
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
                        if (main.gotitems7 > main.gotitems2 && main.gotitems7 > main.gotitems3 && main.gotitems7 > main.gotitems4 && main.gotitems7 > main.gotitems5 && main.gotitems7 > main.gotitems6 && main.gotitems7 > main.gotitems1 && main.gotitems7 > main.gotitems8 && main.gotitems7 > main.gotitems9) {
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
                        if (main.gotitems8 > main.gotitems2 && main.gotitems8 > main.gotitems3 && main.gotitems8 > main.gotitems4 && main.gotitems8 > main.gotitems5 && main.gotitems8 > main.gotitems6 && main.gotitems8 > main.gotitems7 && main.gotitems8 > main.gotitems1 && main.gotitems8 > main.gotitems9) {
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
                        if (main.gotitems9 > main.gotitems2 && main.gotitems9 > main.gotitems3 && main.gotitems9 > main.gotitems4 && main.gotitems9 > main.gotitems5 && main.gotitems9 > main.gotitems6 && main.gotitems9 > main.gotitems7 && main.gotitems9 > main.gotitems8 && main.gotitems9 > main.gotitems1) {
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
                        if (main.gotitems9 == main.gotitems2 && main.gotitems9 == main.gotitems3 && main.gotitems9 == main.gotitems4 && main.gotitems9 == main.gotitems5 && main.gotitems9 == main.gotitems6 && main.gotitems9 == main.gotitems7 && main.gotitems9 == main.gotitems8 && main.gotitems9 == main.gotitems1) {
                            main.isRestarting = true;
                            RestartCountDown.RestartCountDown();
                            this.cancel();
                        }
                    }
                }
                if (!main.timercountdown && !main.timerpause) {
                    if (main.hours == 0 && main.minutes == 0 && main.seconds == 0 && !main.timercountdown) {
                        main.seconds = 5;
                        main.seconds = 0;
                    }
                    if (main.seconds == 0 || (main.seconds > 0 && !main.timercountdown)) {
                        ++main.seconds;
                    }
                    if (main.seconds == 59 && !main.timercountdown) {
                        ++main.minutes;
                        main.seconds = 0;
                    }
                    if (main.minutes == 59 && !main.timercountdown) {
                        ++main.hours;
                        main.minutes = 0;
                    }
                }
            }
        }.runTaskTimer(Bukkit.getPluginManager().getPlugin("Bingo"), 0L, 20L);
    }


}
