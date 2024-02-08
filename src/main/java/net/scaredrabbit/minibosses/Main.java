package net.scaredrabbit.minibosses;

import net.scaredrabbit.minibosses.command.CommandManager;
import net.scaredrabbit.minibosses.listener.overworldMobs.zombie.ZombieL;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;
    @Override
    public void onEnable() {
        // Plugin startup
        instance = this;
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        reloadConfig();


        getServer().getPluginManager().registerEvents(new ZombieL(), this);
        getCommand("minibosses").setExecutor(new CommandManager());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Main getInstance() {
        return instance;
    }
}
