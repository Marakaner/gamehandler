package net.marakaner.gamehandler;

import net.marakaner.gamehandler.game.Game;
import org.bukkit.plugin.java.JavaPlugin;

public final class Gamehandler extends JavaPlugin {

    private static Game game;

    @Override
    public void onEnable() {
        game = new Game();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
