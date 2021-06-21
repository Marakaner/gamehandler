package net.marakaner.gamehandler.player;

import java.util.UUID;

public class GamePlayer {

    private UUID uniqueId;
    private String name;

    public GamePlayer(UUID uniqueId, String name) {
        this.uniqueId = uniqueId;
        this.name = name;
    }

}
