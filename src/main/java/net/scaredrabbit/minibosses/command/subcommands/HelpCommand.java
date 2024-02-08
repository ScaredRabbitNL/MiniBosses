package net.scaredrabbit.minibosses.command.subcommands;

import net.scaredrabbit.minibosses.command.SubCommand;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.util.ColorUtil;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Objects;

public class HelpCommand extends SubCommand {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return "Returns all of the commands with explanation";
    }

    @Override
    public String getSyntax() {
        return "/minibosses help";
    }

    @Override
    public void perform(Player p, String[] args) {
        p.sendMessage(ColorUtil.translateColorCodes("&e=================== " + CustomConfig.get().getString("HelpPrefix") + "&e====================="));
        p.sendMessage(ColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("HelpCommandReload"))));
        p.sendMessage(ColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("HelpCommandHelp"))));
        p.sendMessage(ColorUtil.translateColorCodes("&e=================== " + CustomConfig.get().getString("HelpPrefix") + "&e====================="));


    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }
}
