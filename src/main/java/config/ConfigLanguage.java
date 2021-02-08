package config;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.Objects;


public class ConfigLanguage {



    private static File file;
    private static YamlConfiguration yml;
    public static boolean setup;
    public static boolean configCreated;

    static {
        ConfigLanguage.file = new File("plugins/Bingo/", "language.yml");
        ConfigLanguage.yml = YamlConfiguration.loadConfiguration(ConfigLanguage.file);
        ConfigLanguage.setup = false;
        ConfigLanguage.configCreated = false;
    }

    public static boolean loadLanguageConfiguration() {

        if (!ConfigLanguage.file.exists()) {
            //Create Config if no existing
            createConfiguration();
        }

        try {
            //Load Variables


        }
        catch (Exception e) {
            createConfiguration();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static boolean createConfiguration() {
        try {
            new File("plugins/Bingo/").mkdirs();
            ConfigLanguage.file.createNewFile();

            //Set Variables
            ConfigLanguage.yml.set("prefix", "&2[Bingo]");
            ConfigLanguage.yml.set("pluginstarted", "&aPlugin gestartet");
            ConfigLanguage.yml.set("pluginstopped", "&aPlugin gestoppt");
            ConfigLanguage.yml.set("kickmsgwinOnePlayer", "&2Bingo! &aGewinner: &c%player%");
            ConfigLanguage.yml.set("kickmsgwinTwoPlayer", "&2Bingo! &aGewinner: &c%player1% &a und &c%player2%");
            ConfigLanguage.yml.set("FollowingTeamTeleported", "&aFolgende Teams wurden Telepotiert:");
            ConfigLanguage.yml.set("T1OnePlayer", "&aTeam 1: &6%player%");
            ConfigLanguage.yml.set("T1TwoPlayer", "&aTeam 1: &6%player1% &aund &6%player2%");
            ConfigLanguage.yml.set("T2OnePlayer", "&aTeam 2: &c%player%");
            ConfigLanguage.yml.set("T2TwoPlayer", "&aTeam 2: &c%player1% &aund &c%player2%");
            ConfigLanguage.yml.set("T3OnePlayer", "&aTeam 3: &d%player%");
            ConfigLanguage.yml.set("T3TwoPlayer", "&aTeam 3: &d%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("T4OnePlayer", "&aTeam 4: &f%player%");
            ConfigLanguage.yml.set("T4TwoPlayer", "&aTeam 4: &f%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("T5OnePlayer", "&aTeam 5: &1%player%");
            ConfigLanguage.yml.set("T5TwoPlayer", "&aTeam 5: &1%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("T6OnePlayer", "&aTeam 6: &e%player%");
            ConfigLanguage.yml.set("T6TwoPlayer", "&aTeam 6: &e%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("T7OnePlayer", "&aTeam 7: &a%player%");
            ConfigLanguage.yml.set("T7TwoPlayer", "&aTeam 7: &a%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("T8OnePlayer", "&aTeam 8: &7%player%");
            ConfigLanguage.yml.set("T8TwoPlayer", "&aTeam 8: &7%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("T9OnePlayer", "&aTeam 9: &5%player%");
            ConfigLanguage.yml.set("T9TwoPlayer", "&aTeam 9: &5%player1% &aund &d%player2%");
            ConfigLanguage.yml.set("BoatName", "&aLets go!");
            ConfigLanguage.yml.set("StartMessage", "&aViel Glueck!");
            ConfigLanguage.yml.set("ActionBar", "&2Bingo >> &a/bingo &7|| &e%gotitems% &avon &b9 &aItems");
            ConfigLanguage.yml.set("nopermission", "&aKeine Rechte.");
            ConfigLanguage.yml.set("notavailable", "&aNicht mehr Verfuegbar");
            ConfigLanguage.yml.set("gamewillstart", "&aSpiel wird gestartet.");
            ConfigLanguage.yml.set("gamestartsin", "&aSpiel startet in &c%seconds%");
            ConfigLanguage.yml.set("gamestarts", "&aSpiel startet jetzt!");
            ConfigLanguage.yml.set("usagebingopl", "&aBenutze /bingopl <start>");
            ConfigLanguage.yml.set("noconsole", "&cNur Spieler koennen dies benutzen.");
            ConfigLanguage.yml.set("usagebingorestart", "&aBenutze /bingorestart");
            ConfigLanguage.yml.set("teleportedtop", "&aDu wurdest nach oben telepotiert");
            ConfigLanguage.yml.set("teleportedworld", "&aDu wurdest in die Overworld telepotiert");
            ConfigLanguage.yml.set("mustbingoworld", "&aDu musst in-game sein.");
            ConfigLanguage.yml.set("nospectatortop", "&aDu kannst diesen Command nicht als Spectator benutzen");
            ConfigLanguage.yml.set("usagetop", "&aBenutze /top");
            ConfigLanguage.yml.set("usagestart", "&aBenutze /start");
            ConfigLanguage.yml.set("bingoitemsinround", "&2Bingo Items in der Runde");
            ConfigLanguage.yml.set("teamfounditemTeam1", "&6Team 1 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam2", "&6Team 2 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam3", "&6Team 3 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam4", "&6Team 4 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam5", "&6Team 5 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam6", "&6Team 6 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam7", "&6Team 7 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam8", "&6Team 8 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("teamfounditemTeam9", "&6Team 9 &ahat folgendes Item gefunden: &e%item%");
            ConfigLanguage.yml.set("yourteamfoundfollowingitemsalready", "&aDein Team hat bereits dieses Item gefunden:");
            ConfigLanguage.yml.set("onlyingamecommand", "&aDieser Command ist nur in-game Verfuegbar.");
            ConfigLanguage.yml.set("usagebingo", "&aBenutze /bingo um die Items der Runde zu sehen oder /bingo start oder /bingorestart als admin");
            ConfigLanguage.yml.set("usagebrestart", "&aBenutze /brestart");
            ConfigLanguage.yml.set("teamselectorInventoryTitle", "&8Team Auswahl");
            ConfigLanguage.yml.set("teamselection", "&cTeam Auswahl");
            ConfigLanguage.yml.set("tablistheaderingame", "&2Bingo! - In Game");
            ConfigLanguage.yml.set("tablistheaderlobby", "&2Bingo! - Lobby");
            ConfigLanguage.yml.set("tablistfooter", "&aLUMPUSDUMPS &7|| &aBy Zarg");
            ConfigLanguage.yml.set("spectatorjoined", "&c%player% &aschaut nun zu.");
            ConfigLanguage.yml.set("lobbyisfullkick", "&aDie Runde ist voll, du kannst zuschauen wenn die Beschreibung auf &c[Status] &aIn-Game gesetzt ist");
            ConfigLanguage.yml.set("playerjoined", "&c%player% &aist beigetreten.");
            ConfigLanguage.yml.set("roundisrestartingkick", "&aRunde Restartet, versuch in 1 Minute nochmal.");
            ConfigLanguage.yml.set("jointeam1", "&aDu bist &6Team 1 &abeigetreten");
            ConfigLanguage.yml.set("alreadyteam1", "&aDu bist bereits in &6Team 1");
            ConfigLanguage.yml.set("team1full", "&cTeam 1 ist voll.");
            ConfigLanguage.yml.set("jointeam2", "&aDu bist &cTeam 2&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam2", "&aDu bist bereits in &cTeam 2");
            ConfigLanguage.yml.set("team2full", "&cTeam 2 ist voll.");
            ConfigLanguage.yml.set("jointeam3", "&aDu bist &dTeam 3 &abeigetreten");
            ConfigLanguage.yml.set("alreadyteam3", "&aDu bist bereits in &dTeam 3");
            ConfigLanguage.yml.set("team3full", "&cTeam 3 ist voll.");
            ConfigLanguage.yml.set("jointeam4", "&aDu bist &fTeam 4&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam4", "&aDu bist bereits in &fTeam 4");
            ConfigLanguage.yml.set("team4full", "&cTeam 4 ist voll.");
            ConfigLanguage.yml.set("jointeam5", "&aDu bist &1Team 5&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam5", "&aDu bist bereits in &1Team 5");
            ConfigLanguage.yml.set("team5full", "&cTeam 5 ist voll.");
            ConfigLanguage.yml.set("jointeam6", "&aDu bist &eTeam 6&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam6", "&aDu bist bereits in &eTeam 6");
            ConfigLanguage.yml.set("team6full", "&cTeam 6 ist voll.");
            ConfigLanguage.yml.set("jointeam7", "&aDu bist &aTeam 7&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam7", "&aDu bist beretis in &aTeam 7");
            ConfigLanguage.yml.set("team7full", "&cTeam 7 ist voll.");
            ConfigLanguage.yml.set("jointeam8", "&aDu bist &7Team 8&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam8", "&aDu bist bereits in &7Team 8");
            ConfigLanguage.yml.set("team8full", "&cTeam 8 ist voll.");
            ConfigLanguage.yml.set("jointeam9", "&aDu bist &5Team 9&a beigetreten");
            ConfigLanguage.yml.set("alreadyteam9", "&aDu bist bereits in &5Team 9");
            ConfigLanguage.yml.set("team9full", "&cTeam 9 ist voll.");
            ConfigLanguage.yml.set("TablistTeam1Colour", "&6");
            ConfigLanguage.yml.set("TablistTeam2Colour", "&c");
            ConfigLanguage.yml.set("TablistTeam3Colour", "&d");
            ConfigLanguage.yml.set("TablistTeam4Colour", "&f");
            ConfigLanguage.yml.set("TablistTeam5Colour", "&1");
            ConfigLanguage.yml.set("TablistTeam6Colour", "&e");
            ConfigLanguage.yml.set("TablistTeam7Colour", "&a");
            ConfigLanguage.yml.set("TablistTeam8Colour", "&7");
            ConfigLanguage.yml.set("TablistTeam9Colour", "&5");
            ConfigLanguage.yml.set("TablistGamemasterColour", "&c");
            ConfigLanguage.yml.set("TablistDefaultUserColour", "&8");
            ConfigLanguage.yml.set("TeablistGamemasterColour", "&4");
            ConfigLanguage.yml.set("deathmessage", "&c%player% &aist gestorben und wurde Respawned.");
            ConfigLanguage.yml.set("leftserverlobby", "&c%player% &ahat das Spiel verlassen.");
            ConfigLanguage.yml.set("leftserveringamespectator", "&c%player% &a(Spectator) hat das Spiel verlassen.");
            ConfigLanguage.yml.set("leftserveringame", "&c%player% &ahat das Spiel verlassen.");
            ConfigLanguage.yml.set("gameisrestarting", "&aSpiel ist am Restarten.");
            ConfigLanguage.yml.set("#", "The Player will have the colour which is set at \"chatcolourDefaultUser\" or \"chatcolourGamemaster\"");
            ConfigLanguage.yml.set("chatformatTeam1", "&6[Team 1] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam2", "&c[Team 2] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam3", "&d[Team 3] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam4", "&f[Team 4] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam5", "&1[Team 5] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam6", "&e[Team 6] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam7", "&a[Team 7] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam8", "&7[Team 8] %player% &7: %message%");
            ConfigLanguage.yml.set("chatformatTeam9", "&5[Team 9] %player% &7: %message%");
            ConfigLanguage.yml.set("#", "The Player Colour of \"chatformatwithoutteam\" will be one of two under that point.");
            ConfigLanguage.yml.set("chatformatwithoutteam", "%player%&7: %message%");
            ConfigLanguage.yml.set("chatcolourDefaultUser", "&8");
            ConfigLanguage.yml.set("chatcolourGamemaster", "&4");
            ConfigLanguage.yml.set("#", "Important: Scoreboard is marked as [WIP] = Work in Progress -> So do not wonder why it is not finished yet.");
            ConfigLanguage.yml.set("scoreboardTitle", "&2Bingo! - by Zarg");
            ConfigLanguage.yml.set("scoreboardYourTeam", "&aDein Team:");
            ConfigLanguage.yml.set("scoreboardTeam1", "&6Team 1");
            ConfigLanguage.yml.set("scoreboardTeam2", "&cTeam 2");
            ConfigLanguage.yml.set("scoreboardTeam3", "&dTeam 3");
            ConfigLanguage.yml.set("scoreboardTeam4", "&fTeam 4");
            ConfigLanguage.yml.set("scoreboardTeam5", "&1Team 5");
            ConfigLanguage.yml.set("scoreboardTeam6", "&eTeam 6");
            ConfigLanguage.yml.set("scoreboardTeam7", "&aTeam 7");
            ConfigLanguage.yml.set("scoreboardTeam8", "&7Team 8");
            ConfigLanguage.yml.set("scoreboardTeam9", "&5Team 9");
            ConfigLanguage.yml.set("scoreboardNoTeam", "&cKein Team");
            ConfigLanguage.yml.set("gameisrestarting", "Spiel ist am Restarten.");
            ConfigLanguage.yml.set("savemessage", "&a Einstellungen Erfolgreich gespeichert!");
            ConfigLanguage.yml.set("timeend", "Die Zeit ist abgelaufen!");

            //Timer
            ConfigLanguage.yml.set("second", "Sekunde");
            ConfigLanguage.yml.set("seconds", "Sekunden");
            ConfigLanguage.yml.set("minute", "Minute");
            ConfigLanguage.yml.set("minutes", "Minuten");
            ConfigLanguage.yml.set("hour", "Stunde");
            ConfigLanguage.yml.set("hours", "Stunden");

            //Save Yml
            ConfigLanguage.yml.save(ConfigLanguage.file);
            ConfigLanguage.configCreated = true;
            Bukkit.getConsoleSender().sendMessage("Language File successfully created!");
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            Bukkit.getConsoleSender().sendMessage("Language File could not be created. => Server Restarting!");
            Bukkit.spigot().restart();
            return false;
        }
    }

    public static String getString(String string) {
        return ChatColor.translateAlternateColorCodes('&', ConfigLanguage.getConfig().getString(string));
    }

    public static File getFile() {
        return ConfigLanguage.file;
    }



    public static YamlConfiguration getConfig() {
        return ConfigLanguage.yml;
    }

}
