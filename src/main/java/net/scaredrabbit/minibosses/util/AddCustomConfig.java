package net.scaredrabbit.minibosses.util;

import net.scaredrabbit.minibosses.config.CustomConfig;

import static net.scaredrabbit.minibosses.util.MessageConfigAddDefaults.addDefaults;

public class AddCustomConfig {

    public static void addCustomConfig(){
        CustomConfig.setup();
        addDefaults();
        CustomConfig.get().options().copyDefaults(true);
        CustomConfig.save();
    }
}
