package net.scaredrabbit.minibosses.command.subcommands;

import net.scaredrabbit.minibosses.Main;
import net.scaredrabbit.minibosses.command.SubCommand;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.util.IColorUtil;
import org.bukkit.command.CommandSender;
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
    public void perform(Player p, String[] args, CommandSender sender) {
        CustomConfig.reload();

        plugin.reloadConfig();
        plugin.saveDefaultConfig();

        p.sendMessage(IColorUtil.translateColorCodes(CustomConfig.get().getString("Prefix") + CustomConfig.get().getString("ConfigReload")));

    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }
}
