package net.marakaner.gamehandler.game;

import lombok.Getter;
import lombok.Setter;
import net.marakaner.getdown.util.ConfigService;

import java.util.List;

public class Game {

    private final String CONFIG_PATH = "plugins/GetDown/gameconfig.yml";

    @Getter @Setter
    private List<GamePhase> gamePhasesOrder;

    @Getter
    private GamePhase currentGamePhase;

    @Getter
    private GameProtection gameProtection;

    @Getter
    private GameConfig gameConfig;

    public Game() {
        if(ConfigService.getInstance().fileExists(CONFIG_PATH)) {
            gameConfig = new GameConfig();

            ConfigService.getInstance().parseFile(CONFIG_PATH, gameConfig);
        } else {
            gameConfig = ConfigService.getInstance().readFile(CONFIG_PATH, GameConfig.class);
        }

        gameProtection = new GameProtection();
    }

    public GamePhase nextGamePhase() {
    }



}
