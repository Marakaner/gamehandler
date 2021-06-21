package net.marakaner.gamehandler.game;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class GameConfig {

    public String prefix = "PREFIX";

    @JsonIgnore
    public String getPrefix() {
        return prefix;
    }
}
