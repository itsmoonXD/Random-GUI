package com.moon.menurandom;

import java.util.Arrays;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuCommand implements CommandExecutor {
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player player = (Player)commandSender;
            Inventory inv = Bukkit.createInventory((InventoryHolder)player, 45, ChatColor.RED.toString() + ChatColor.BOLD + "Random GUI");
            ItemStack teleport = new ItemStack(Material.CHEST);
            ItemMeta teleportMeta = teleport.getItemMeta();
            teleportMeta.setDisplayName(ChatColor.BLUE + "Inv Clear");
            teleportMeta.setLore(Arrays.asList(new String[] { ChatColor.GRAY + "Clears your inventory." }));
            teleport.setItemMeta(teleportMeta);
            inv.setItem(20, teleport);
            ItemStack kys = new ItemStack(Material.DIAMOND);
            ItemMeta kysMeta = kys.getItemMeta();
            kysMeta.setDisplayName(ChatColor.GREEN + "All Diamond");
            kysMeta.setLore(Arrays.asList(new String[] { ChatColor.GRAY + "All diamond armor & tools." }));
            kys.setItemMeta(kysMeta);
            inv.setItem(22, kys);
            ItemStack clear = new ItemStack(Material.ELYTRA);
            ItemMeta clearMeta = clear.getItemMeta();
            clearMeta.setDisplayName(ChatColor.BLUE + "Fly");
            clearMeta.setLore(Arrays.asList(new String[] { ChatColor.GRAY + "Enables you to fly." }));
            clear.setItemMeta(clearMeta);
            inv.setItem(24, clear);
            ItemStack close = new ItemStack(Material.BARRIER);
            ItemMeta closeMeta = close.getItemMeta();
            closeMeta.setDisplayName(ChatColor.RED + "Close Menu");
            close.setItemMeta(closeMeta);
            inv.setItem(0, close);
            ItemStack frame = new ItemStack(Material.GLASS_PANE);
            for (int i : new int[] {
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 17,
                    18, 26, 27, 35, 36, 37, 38, 39, 40, 41,
                    42, 43, 44 })
                inv.setItem(i, frame);
            player.openInventory(inv);
        }
        return false;
    }
}
