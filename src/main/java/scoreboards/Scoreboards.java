package scoreboards;

import config.ConfigLanguage;
import main.main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class Scoreboards {

    public static void setLobbyScoreboardWithTeam(final Player p) {
        final Scoreboard lobbyboard = Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective obj = lobbyboard.registerNewObjective("bingo", "dummy", ConfigLanguage.getString("scoreboardTitle"));
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        final Score placeholder2 = obj.getScore(ChatColor.GREEN + " " + ChatColor.WHITE);
        placeholder2.setScore(45);
        final Score yourTeam = obj.getScore(ConfigLanguage.getString("scoreboardYourTeam"));
        yourTeam.setScore(44);
        final Score placeholder3 = obj.getScore(ChatColor.GRAY + " " + ChatColor.WHITE);
        placeholder3.setScore(43);
        if (main.t1.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(ChatColor.AQUA + " " + ChatColor.WHITE);
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam1"));
            obj.getScore(ChatColor.AQUA + " " + ChatColor.WHITE).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t1 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t1 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t1 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t1 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t1 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t1 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t1 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t1 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t1 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t2.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam2"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t2 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t2 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t2 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t2 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t2 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t2 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t2 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t2 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t2 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t3.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam3"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t3 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t3 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t3 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t3 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t3 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t3 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t3 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t3 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t3 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t4.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam4"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t4 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t4 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t4 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t4 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t4 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t4 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t4 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t4 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t4 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t5.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam5"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t5 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t5 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t5 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t5 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t5 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t5 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t5 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t5 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t5 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t6.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam6"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t6 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t6 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t6 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t6 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t6 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t6 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t6 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t6 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t6 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t7.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam7"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t7 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t7 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t7 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t7 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t7 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t7 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t7 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t7 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t7 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t8.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam8"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t8 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t8 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t8 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t8 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t8 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t8 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t8 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t8 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t8 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else if (main.t9.contains(p)) {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardTeam9"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
            if (main.GameStarted) {
                final String ItemOne = main.b1.getType().name();
                final String ItemTwo = main.b2.getType().name();
                final String ItemThree = main.b3.getType().name();
                final String ItemFour = main.b4.getType().name();
                final String ItemFive = main.b5.getType().name();
                final String ItemSix = main.b6.getType().name();
                final String ItemSeven = main.b7.getType().name();
                final String ItemEight = main.b8.getType().name();
                final String ItemNight = main.b9.getType().name();
                obj.getScore(main.ColorGrayb1t9 + ItemOne.substring(0, 1).toUpperCase() + ItemOne.substring(1).toLowerCase().replace("_", " ")).setScore(42);
                obj.getScore(main.ColorGrayb2t9 + ItemTwo.substring(0, 1).toUpperCase() + ItemTwo.substring(1).toLowerCase().replace("_", " ")).setScore(41);
                obj.getScore(main.ColorGrayb3t9 + ItemThree.substring(0, 1).toUpperCase() + ItemThree.substring(1).toLowerCase().replace("_", " ")).setScore(40);
                obj.getScore(main.ColorGrayb4t9 + ItemFour.substring(0, 1).toUpperCase() + ItemFour.substring(1).toLowerCase().replace("_", " ")).setScore(39);
                obj.getScore(main.ColorGrayb5t9 + ItemFive.substring(0, 1).toUpperCase() + ItemFive.substring(1).toLowerCase().replace("_", " ")).setScore(38);
                obj.getScore(main.ColorGrayb6t9 + ItemSix.substring(0, 1).toUpperCase() + ItemSix.substring(1).toLowerCase().replace("_", " ")).setScore(37);
                obj.getScore(main.ColorGrayb7t9 + ItemSeven.substring(0, 1).toUpperCase() + ItemSeven.substring(1).toLowerCase().replace("_", " ")).setScore(36);
                obj.getScore(main.ColorGrayb8t9 + ItemEight.substring(0, 1).toUpperCase() + ItemEight.substring(1).toLowerCase().replace("_", " ")).setScore(35);
                obj.getScore(main.ColorGrayb9t9 + ItemNight.substring(0, 1).toUpperCase() + ItemNight.substring(1).toLowerCase().replace("_", " ")).setScore(34);
            }
        }
        else {
            final Team team = lobbyboard.registerNewTeam("team");
            team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
            team.setPrefix(ConfigLanguage.getString("scoreboardNoTeam"));
            obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(44);
        }
        p.setScoreboard(lobbyboard);
    }
    

}
