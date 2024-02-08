package net.scaredrabbit.minibosses.command.subcommands;

import net.kyori.adventure.text.Component;
import net.scaredrabbit.minibosses.Main;
import net.scaredrabbit.minibosses.command.SubCommand;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.util.ColorUtil;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class ReloadCommand extends SubCommand {

    private static final Main plugin = Main.getInstance();

    @Override
    public String getName() {
        return "reload";
    }

    @Override
    public String getDescription() {
        return "Reloads the plugins data";
    }

    @Override
    public String getSyntax() {
        return "/minibosses reload";
    }

    @Override
    public void perform(Player p, String[] args) {
        CustomConfig.setup();

        plugin.reloadConfig();
        plugin.saveDefaultConfig();

        p.sendMessage(ColorUtil.translateColorCodes(CustomConfig.get().getString("Prefix") + CustomConfig.get().getString("ConfigReload")));

    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }
}
