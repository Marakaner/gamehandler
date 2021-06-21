package net.marakaner.gamehandler.game;

import net.marakaner.getdown.GetDownPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class GameProtectionListener implements Listener {

    private GameProtection gameProtection = GetDownPlugin.getInstance().getGame().getGameProtection();

    @EventHandler
    public void onMove(PlayerMoveEvent event) {

        if(!gameProtection.isMove()) {
            event.setCancelled(true);
        }

        if(!gameProtection.isMoveBlock()) {
            if (event.getTo().getX() != event.getFrom().getX() && event.getTo().getZ() != event.getFrom().getZ()) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {

        if(!gameProtection.isBlockPlace()) {
            event.setCancelled(true);
        }

    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if(!gameProtection.isBlockBreak()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        if(!gameProtection.isDropItem()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        if(!gameProtection.isInteract()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent event) {
        if(!gameProtection.isWeatherChange()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if(!gameProtection.isDamage()) {
            event.setCancelled(true);
        }
    }

}
