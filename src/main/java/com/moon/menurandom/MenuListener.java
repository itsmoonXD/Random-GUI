package com.moon.menurandom;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (ChatColor.translateAlternateColorCodes('&', e.getView().getTitle()).equals(ChatColor.RED.toString() + ChatColor.BOLD + "Random GUI") && e
                .getCurrentItem() != null) {
            e.setCancelled(true);
            Player player = (Player)e.getWhoClicked();
            switch (e.getRawSlot()) {
                case 0:
                    break;
                case 20:
                    player.closeInventory();
                    player.getInventory().clear();
                    player.sendMessage(ChatColor.RED + "You cleared your inventory.");
                    break;
                case 22:
                    player.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
                    player.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
                    player.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
                    player.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
                    player.getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
                    player.sendMessage(ChatColor.RED + "You now have full diamond gear.");
                    break;
                case 24:
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.RED + "You are able to fly.");
                    return;
                default:
                    return;
            }
            player.closeInventory();
        }
    }
}