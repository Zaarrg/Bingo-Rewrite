package scoreboards;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class Sideboard {


    public void setLobbyScoreboard(final Player p) {
        final Scoreboard lobbyboard = Bukkit.getScoreboardManager().getNewScoreboard();
        final Objective obj = lobbyboard.registerNewObjective("§2Bingo!", "dummy", "§2Bingo! - Lobby");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        final Score yourTeam = obj.getScore("§aDein Team:");
        yourTeam.setScore(2);
        final Team team = lobbyboard.registerNewTeam("team");
        team.addEntry(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString());
        team.setPrefix("§cDu bist in keinem Team");
        obj.getScore(new StringBuilder().append(ChatColor.AQUA).append(ChatColor.WHITE).toString()).setScore(2);
        p.setScoreboard(lobbyboard);
    }

}
