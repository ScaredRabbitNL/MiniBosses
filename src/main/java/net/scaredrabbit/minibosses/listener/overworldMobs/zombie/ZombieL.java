package net.scaredrabbit.minibosses.listener.overworldMobs.zombie;

import net.scaredrabbit.minibosses.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.Objects;

public class ZombieL implements Listener {

    private static final Main config = Main.getInstance();
    ItemStack helmet;
    ItemStack chestPlate;
    ItemStack leggings;
    ItemStack boots;

    @EventHandler
    public void onZombieSpawn(CreatureSpawnEvent e) {


        if (config.getConfig().getBoolean("isZombieMiniBossEnabled")) {
            if (e.getEntityType() == EntityType.ZOMBIE) {
                Zombie z = (Zombie) e.getEntity();
                if (Objects.requireNonNull(config.getConfig().getString("opMobsUseMaterial")).equalsIgnoreCase("NETHERITE")) {
                    helmet = new ItemStack(Material.NETHERITE_HELMET);
                    chestPlate = new ItemStack(Material.NETHERITE_CHESTPLATE);
                    leggings = new ItemStack(Material.NETHERITE_LEGGINGS);
                    boots = new ItemStack(Material.NETHERITE_BOOTS);

                    helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    helmet.addEnchantment(Enchantment.MENDING, 1);
                    helmet.addEnchantment(Enchantment.DURABILITY, 3);

                    chestPlate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    chestPlate.addEnchantment(Enchantment.MENDING, 1);
                    chestPlate.addEnchantment(Enchantment.DURABILITY, 3);

                    leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    leggings.addEnchantment(Enchantment.MENDING, 1);
                    leggings.addEnchantment(Enchantment.DURABILITY, 3);

                    boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    boots.addEnchantment(Enchantment.MENDING, 1);
                    boots.addEnchantment(Enchantment.DURABILITY, 3);

                    z.getEquipment().setHelmet(helmet);
                    z.getEquipment().setChestplate(chestPlate);
                    z.getEquipment().setLeggings(leggings);
                    z.getEquipment().setBoots(boots);

                } else if (Objects.requireNonNull(config.getConfig().getString("opMobsUseMaterial")).equalsIgnoreCase("DIAMOND")) {
                    helmet = new ItemStack(Material.DIAMOND_HELMET);
                    chestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    leggings = new ItemStack(Material.DIAMOND_LEGGINGS);
                    boots = new ItemStack(Material.DIAMOND_BOOTS);

                    helmet.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    helmet.addEnchantment(Enchantment.MENDING, 1);
                    helmet.addEnchantment(Enchantment.DURABILITY, 3);

                    chestPlate.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    chestPlate.addEnchantment(Enchantment.MENDING, 1);
                    chestPlate.addEnchantment(Enchantment.DURABILITY, 3);

                    leggings.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    leggings.addEnchantment(Enchantment.MENDING, 1);
                    leggings.addEnchantment(Enchantment.DURABILITY, 3);

                    boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    boots.addEnchantment(Enchantment.MENDING, 1);
                    boots.addEnchantment(Enchantment.DURABILITY, 3);

                    z.getEquipment().setHelmet(helmet);
                    z.getEquipment().setChestplate(chestPlate);
                    z.getEquipment().setLeggings(leggings);
                    z.getEquipment().setBoots(boots);

                }
            }
        }
    }
}
