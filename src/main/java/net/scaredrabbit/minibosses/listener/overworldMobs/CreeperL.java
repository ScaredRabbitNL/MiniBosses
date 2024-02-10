package net.scaredrabbit.minibosses.listener.overworldMobs;

import net.scaredrabbit.minibosses.Main;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CreeperL implements Listener {

    private static final Main plugin = Main.getInstance();

    @EventHandler
    public void onCreeperSpawn(CreatureSpawnEvent e){
        if (plugin.getConfig().getBoolean("isCreeperMiniBossEnabled")){

            if (e.getEntityType() == EntityType.CREEPER){
                Creeper c = (Creeper) e.getEntity();
                c.setPowered(true);
            }
        }
    }
}
