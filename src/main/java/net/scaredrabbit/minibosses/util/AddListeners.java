package net.scaredrabbit.minibosses.util;

import net.scaredrabbit.minibosses.Main;
import net.scaredrabbit.minibosses.listener.command.DifficultyGUIListener;
import net.scaredrabbit.minibosses.listener.overworldMobs.CreeperL;
import net.scaredrabbit.minibosses.listener.overworldMobs.SkeletonL;
import net.scaredrabbit.minibosses.listener.overworldMobs.zombie.ZombieL;
import net.scaredrabbit.minibosses.listener.overworldMobs.zombie.ZombieVillagerL;

public class AddListeners {
    private static final Main plugin = Main.getInstance();

    public static void addListeners(){
        plugin.getServer().getPluginManager().registerEvents(new ZombieL(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new ZombieVillagerL(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new SkeletonL(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new CreeperL(), plugin);

        plugin.getServer().getPluginManager().registerEvents(new DifficultyGUIListener(), plugin);

    }
}
