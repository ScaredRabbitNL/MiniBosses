package net.scaredrabbit.minibosses.command;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class SubCommand {

    public abstract String getName();

    public abstract String getDescription();
    public abstract String getSyntax();

    public abstract void perform(Player p, String[] args, CommandSender sender);
    public abstract List<String> getSubcommandArguments(Player player, String[] args);
}
