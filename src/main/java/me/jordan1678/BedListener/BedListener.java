package me.jordan1678.BedListener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class BedListener implements Listener {

    @EventHandler
    public void BedInteract(PlayerBedEnterEvent ev){
        Player player = ev.getPlayer();
        String playerName = ev.getPlayer().getName();

        // checks if player is actually sleeping
        if (ev.getBedEnterResult().equals(PlayerBedEnterEvent.BedEnterResult.OK)) {

            player.getLocation().getWorld().setTime(0);                     // sets the time of the world the player sleeps in
            Bukkit.broadcastMessage(playerName + " has skipped night!");    // broadcast a message saying who skipped night to everyone in the server

        }

    }

}
