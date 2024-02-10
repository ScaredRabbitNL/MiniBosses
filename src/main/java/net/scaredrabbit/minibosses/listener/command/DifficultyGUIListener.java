package net.scaredrabbit.minibosses.listener.command;

import net.scaredrabbit.minibosses.Main;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.util.IColorUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class DifficultyGUIListener implements Listener {

    private static final Main plugin = Main.getInstance();

    @EventHandler
    public static void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equalsIgnoreCase(IColorUtil.translateColorCodes("&c&lDifficulty: "))){
            e.setCancelled(true);
            if (e.getCurrentItem() == null){
                return;
            } else if (e.getCurrentItem().getType().equals(Material.BARRIER)) {
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.GOLDEN_APPLE)) {
                plugin.getConfig().set("opMobsUseMaterial", "DIAMOND");
                CustomConfig.reload();
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.ENCHANTED_GOLDEN_APPLE)) {
                plugin.getConfig().set("opMobsUseMaterial", "NETHERITE");
                CustomConfig.reload();
                p.closeInventory();
            }
        }
    }
}
