package net.scaredrabbit.minibosses.util;

import net.scaredrabbit.minibosses.config.CustomConfig;

public class MessageConfigAddDefaults {

    public static void addDefaults(){
        CustomConfig.get().addDefault("Prefix","&#fb0000&lM&#fb1200&li&#fc2500&ln&#fc3700&li&#fd4900&lB&#fd5c00&lo&#fe6e00&ls&#fe8000&ls&#ff9300&le&#ffa500&ls &8&l» ");
        CustomConfig.get().addDefault("HelpPrefix","&#fb0000&lM&#fb1200&li&#fc2500&ln&#fc3700&li&#fd4900&lB&#fd5c00&lo&#fe6e00&ls&#fe8000&ls&#ff9300&le&#ffa500&ls ");
        CustomConfig.get().addDefault("ConfigReload","&aReloaded all of the plugin's config files!");
        CustomConfig.get().addDefault("HelpCommandReload", "&b/minibosses reload &7- &#271C1DReloads all config files that this plugin has");
        CustomConfig.get().addDefault("HelpCommandHelp", "&b/minibosses help &7- &#271C1DShows this message");
    }
}
