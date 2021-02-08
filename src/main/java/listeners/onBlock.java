package listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import main.main;

public class onBlock implements Listener {

    @EventHandler
    public void onBlockPlace(final BlockPlaceEvent e) {
        if (main.LobbyStatus) {
            e.setCancelled(true);
        } else if (e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }

        if (main.timerpause) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockBreak(final BlockBreakEvent e) {
        if (main.LobbyStatus) {
            e.setCancelled(true);
        } else if (e.getPlayer().isInvulnerable()) {
            e.setCancelled(true);
        }

        if (main.timerpause) {
            e.setCancelled(true);
        }
    }


}
