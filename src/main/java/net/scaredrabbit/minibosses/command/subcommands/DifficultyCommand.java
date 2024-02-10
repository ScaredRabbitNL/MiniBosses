package net.scaredrabbit.minibosses.command.subcommands;

import net.kyori.adventure.text.Component;
import net.scaredrabbit.minibosses.command.SubCommand;
import net.scaredrabbit.minibosses.config.CustomConfig;
import net.scaredrabbit.minibosses.util.IColorUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;
import java.util.Objects;

public class DifficultyCommand extends SubCommand {
    @Override
    public String getName() {
        return "difficulty";
    }

    @Override
    public String getDescription() {
        return "Changes the type of gamemode.";
    }

    @Override
    public String getSyntax() {
        return "/minibosses mode";
    }

    @Override
    public void perform(Player p, String[] args, CommandSender sender) {
        if (sender instanceof Player){
            Inventory difficultyGUI = Bukkit.createInventory(p, 9, IColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("DifficultyGUI"))));

            ItemStack close = new ItemStack(Material.BARRIER);
            ItemMeta close_meta = close.getItemMeta();
            close_meta.displayName(Component.text(IColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("DifficultyGUIClose")))));
            close.setItemMeta(close_meta);

            ItemStack hardcore = new ItemStack(Material.GOLDEN_APPLE);
            ItemMeta hardcore_meta = hardcore.getItemMeta();
            hardcore_meta.displayName(Component.text(IColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("DifficultyGUIHardcore")))));
            hardcore.setItemMeta(hardcore_meta);

            ItemStack uhc = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
            ItemMeta uhc_meta = uhc.getItemMeta();
            uhc_meta.displayName(Component.text(IColorUtil.translateColorCodes(Objects.requireNonNull(CustomConfig.get().getString("DifficultyGUIHardcore")))));
            uhc.setItemMeta(uhc_meta);

            for (int i = 0; i < 9; i++){
                difficultyGUI.setItem(i, new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
            }

            difficultyGUI.setItem(3, hardcore);
            difficultyGUI.setItem(5, uhc);
            difficultyGUI.setItem(8, close);

            p.openInventory(difficultyGUI);

        }
    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }
}
