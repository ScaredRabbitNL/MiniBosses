package net.scaredrabbit.minibosses.listener.overworldMobs;

import net.scaredrabbit.minibosses.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class SkeletonL implements Listener {
    private static final Main config = Main.getInstance();

    ItemStack helmet;
    ItemStack chestPlate;
    ItemStack leggings;
    ItemStack boots;

    ItemStack bow;
    @EventHandler
    public void onSkeletonSpawn(CreatureSpawnEvent e){
        if (config.getConfig().getBoolean("isSkeletonMiniBossEnabled")){
            if (e.getEntityType() == EntityType.SKELETON){
                Skeleton s = (Skeleton) e.getEntity();
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


                    s.getEquipment().setHelmetDropChance(config.getConfig().getInt("helmetDropChance"));
                    s.getEquipment().setChestplateDropChance(config.getConfig().getInt("chestPlateDropChance"));
                    s.getEquipment().setLeggingsDropChance(config.getConfig().getInt("leggingsDropChance"));
                    s.getEquipment().setBootsDropChance(config.getConfig().getInt("bootsDropChance"));
                    s.getEquipment().setItemInMainHandDropChance(config.getConfig().getInt("swordDropChance"));



                    s.getEquipment().setHelmet(helmet);
                    s.getEquipment().setChestplate(chestPlate);
                    s.getEquipment().setLeggings(leggings);
                    s.getEquipment().setBoots(boots);

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

                    s.getEquipment().setHelmetDropChance(config.getConfig().getInt("helmetDropChance"));
                    s.getEquipment().setChestplateDropChance(config.getConfig().getInt("chestPlateDropChance"));
                    s.getEquipment().setLeggingsDropChance(config.getConfig().getInt("leggingsDropChance"));
                    s.getEquipment().setBootsDropChance(config.getConfig().getInt("bootsDropChance"));


                    s.getEquipment().setHelmet(helmet);
                    s.getEquipment().setChestplate(chestPlate);
                    s.getEquipment().setLeggings(leggings);
                    s.getEquipment().setBoots(boots);

                }
                if (config.getConfig().getBoolean("isBowEnabled")){
                    bow = new ItemStack(Material.BOW);
                    bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
                    bow.addEnchantment(Enchantment.DURABILITY, 3);
                    bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                    bow.addEnchantment(Enchantment.ARROW_FIRE, 2);
                    bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);

                    s.getEquipment().setItemInHandDropChance(config.getConfig().getInt("bowDropChance"));
                    s.getEquipment().setItemInHand(bow);
                }
            }
        }
    }
}
