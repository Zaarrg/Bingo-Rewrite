package functions;

import main.main;
import org.bukkit.entity.Player;
import scoreboards.Scoreboards;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class rejoin {


    public static void onrejoin(final Player p) {

        if (main.l1.contains(p.getPlayer().getUniqueId())) {
            main.t1.add(p);
            main.l1.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if(main.l2.contains(p.getPlayer().getUniqueId())) {
            main.t2.add(p);
            main.l2.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l3.contains(p.getPlayer().getUniqueId())) {
            main.t3.add(p);
            main.l3.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l4.contains(p.getPlayer().getUniqueId())) {
            main.t4.add(p);
            main.l4.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l5.contains(p.getPlayer().getUniqueId())) {
            main.t5.add(p);
            main.l5.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l6.contains(p.getPlayer().getUniqueId())) {
            main.t6.add(p);
            main.l6.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l7.contains(p.getPlayer().getUniqueId())) {
            main.t7.add(p);
            main.l7.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l8.contains(p.getPlayer().getUniqueId())) {
            main.t8.add(p);
            main.l8.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        } else if (main.l9.contains(p.getPlayer().getUniqueId())) {
            main.t9.add(p);
            main.l9.remove(p.getPlayer().getUniqueId());
            Scoreboards.setLobbyScoreboardWithTeam(p);
        }



    }

}
