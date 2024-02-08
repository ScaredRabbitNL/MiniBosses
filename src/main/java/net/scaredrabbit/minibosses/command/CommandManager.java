package net.scaredrabbit.minibosses.command;

import net.scaredrabbit.minibosses.command.subcommands.HelpCommand;
import net.scaredrabbit.minibosses.command.subcommands.ReloadCommand;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.util.ColorUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CommandManager implements TabExecutor {
    private final ArrayList<SubCommand> subCommands = new ArrayList<>();
    public CommandManager(){
        subCommands.add(new ReloadCommand());
        subCommands.add(new HelpCommand());
    }


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            p.sendMessage(ColorUtil.translateColorCodes("&e================ " + CustomConfig.get().getString("HelpPrefix") + "&e=================="));
            p.sendMessage(ColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("HelpCommandReload"))));
            p.sendMessage(ColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("HelpCommandHelp"))));
            p.sendMessage(ColorUtil.translateColorCodes("&e================ " + CustomConfig.get().getString("HelpPrefix") + "&e=================="));

            if (args.length > 0){
                for (int i = 0; i < getSubCommands().size(); i ++) {
                    if (args[0].equalsIgnoreCase(getSubCommands().get(i).getName())){
                        getSubCommands().get(i).perform(p, args);
                    }
                }
            }

        }




        return true;
    }
    public ArrayList<SubCommand> getSubCommands(){
        return subCommands;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 1){
            ArrayList<String> subcommandsArguments = new ArrayList<>();

            for (int i = 0; i < getSubCommands().size(); i++){
                subcommandsArguments.add(getSubCommands().get(i).getName());
            }

            return subcommandsArguments;
        }else if(args.length >= 2){
            for (int i = 0; i < getSubCommands().size(); i++){
                if (args[0].equalsIgnoreCase(getSubCommands().get(i).getName())){
                    return getSubCommands().get(i).getSubcommandArguments((Player) sender, args);
                }
            }
        }

        return null;
    }

}
