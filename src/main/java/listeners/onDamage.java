package listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import main.main;

public class onDamage implements Listener {

    @EventHandler
    public void onDamage(final EntityDamageEvent e) {
        if (e.getEntity() instanceof Player && (e.getEntity().isInvulnerable() || main.LobbyStatus)) {
            e.setCancelled(true);
        }
        if (!main.damage && e.getEntity() instanceof Player) {
            e.setCancelled(true);
        } else if (main.damage && e.getEntity() instanceof Player) {
            return;
        }

        if (main.timerpause) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onDamage2(final EntityDamageByEntityEvent e) {
        final Entity p = e.getDamager();
        if (p instanceof Player) {
            if (p.isInvulnerable() || main.LobbyStatus) {
                e.setCancelled(true);
            } else {
                if (!main.t1.isEmpty() && main.t1.size() == 2) {
                    if (main.t1.get(0).equals(e.getDamager()) && main.t1.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t1.get(1).equals(e.getDamager()) && main.t1.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t2.isEmpty() && main.t2.size() == 2) {
                    if (main.t2.get(0).equals(e.getDamager()) && main.t2.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t2.get(1).equals(e.getDamager()) && main.t2.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t3.isEmpty() && main.t3.size() == 2) {
                    if (main.t3.get(0).equals(e.getDamager()) && main.t3.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t3.get(1).equals(e.getDamager()) && main.t3.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t4.isEmpty() && main.t4.size() == 2) {
                    if (main.t4.get(0).equals(e.getDamager()) && main.t4.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t4.get(1).equals(e.getDamager()) && main.t4.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t5.isEmpty() && main.t5.size() == 2) {
                    if (main.t5.get(0).equals(e.getDamager()) && main.t5.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t5.get(1).equals(e.getDamager()) && main.t5.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t6.isEmpty() && main.t6.size() == 2) {
                    if (main.t6.get(0).equals(e.getDamager()) && main.t6.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t6.get(1).equals(e.getDamager()) && main.t6.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t7.isEmpty() && main.t7.size() == 2) {
                    if (main.t7.get(0).equals(e.getDamager()) && main.t7.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t7.get(1).equals(e.getDamager()) && main.t7.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t8.isEmpty() && main.t8.size() == 2) {
                    if (main.t8.get(0).equals(e.getDamager()) && main.t8.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t8.get(1).equals(e.getDamager()) && main.t8.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
                if (!main.t9.isEmpty() && main.t9.size() == 2) {
                    if (main.t9.get(0).equals(e.getDamager()) && main.t9.get(1).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                    if (main.t9.get(1).equals(e.getDamager()) && main.t9.get(0).equals(e.getEntity())) {
                        e.setCancelled(true);
                    }
                }
            }
        }
    }


}
