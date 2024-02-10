package net.scaredrabbit.minibosses;

import net.scaredrabbit.minibosses.command.CommandManager;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.listener.command.DifficultyGUIListener;
import net.scaredrabbit.minibosses.listener.overworldMobs.zombie.ZombieL;
import static net.scaredrabbit.minibosses.util.MessageConfigAddDefaults.addDefaults;
import static net.scaredrabbit.minibosses.util.AddListeners.addListeners;
import static net.scaredrabbit.minibosses.util.AddCustomConfig.addCustomConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main instance;
    @Override
    public void onEnable() {
        // Plugin startup
        instance = this;
        getConfig().options().copyDefaults();
        //Default Config
        saveDefaultConfig();
        reloadConfig();
        //Custom Stuff
        addCustomConfig();
        addListeners();

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
