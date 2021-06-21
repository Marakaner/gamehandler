package net.marakaner.gamehandler.game;

import lombok.Getter;

public class GameProtection {

    @Getter
    private boolean move, moveBlock, interact, blockBreak, blockPlace, damage, weatherChange, dropItem;

    public GameProtection move(boolean protect) {
        move = protect;
        return this;
    }

    public GameProtection moveBlock(boolean protect) {
        moveBlock = protect;
        return this;
    }

    public GameProtection interact(boolean protect) {
        interact = protect;
        return this;
    }
    public GameProtection blockBreak(boolean protect) {
        blockBreak = interact;
        return this;
    }
    public GameProtection blockPlace(boolean protect) {
        blockPlace = protect;
        return this;
    }
    public GameProtection damage(boolean protect) {
        damage = protect;
        return this;
    }
    public GameProtection weatherChange(boolean protect) {
        weatherChange = protect;
        return this;
    }

    public GameProtection dropItem(boolean protect) {
        dropItem = protect;
        return this;
    }



}
