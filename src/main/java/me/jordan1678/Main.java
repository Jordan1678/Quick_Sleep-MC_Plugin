package me.jordan1678;

import me.jordan1678.BedListener.BedListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    // Plugin startup logic
    @Override
    public void onEnable() {
        // gets the bed listener
        getServer().getPluginManager().registerEvents(new BedListener(), this);

        // print its active
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[Quick Sleep]" +
        ChatColor.WHITE + " Plugin is " +
        ChatColor.GREEN + "ACTIVE" +
        ChatColor.RESET);

        // print how to contact if there is issues
        getServer().getConsoleSender().sendMessage(ChatColor.WHITE + "[Quick Sleep] For Support open an Issue on github at: (URL HERE)" +
        ChatColor.RESET);

    }

    // Plugin shutdown logic
    @Override
    public void onDisable() {

        // prints its inactive
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "[Quick Sleep]" +
        ChatColor.WHITE + " Plugin is " +
        ChatColor.RED + "INACTIVE");

    }
}
