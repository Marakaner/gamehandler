package net.marakaner.gamehandler.game;

import lombok.Getter;
import net.marakaner.getdown.GetDownPlugin;
import org.bukkit.Bukkit;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.scheduler.BukkitTask;

@Getter
public abstract class GamePhase implements Listener {

    private BukkitTask task;
    private int countdown = 300;
    private int counter;

    public GamePhase(int countdown) {
        this.countdown = countdown;
        this.counter = countdown;
    }

    public void onEnter() {
        Bukkit.getPluginManager().registerEvents(this, GetDownPlugin.getInstance());
    }

    public void onLeave() {
        HandlerList.unregisterAll(this);
    }

    public void startCounter() {
        this.task = Bukkit.getScheduler().runTaskTimer(GetDownPlugin.getInstance(), this::executeIntervall, 0, 20);
    }

    public void resetCounter() {
        this.task.cancel();
        this.counter = countdown;
    }

    public void stopCounter() {
        this.task.cancel();
    }

    public void executeIntervall() {
        this.countdown--;
    }

}
