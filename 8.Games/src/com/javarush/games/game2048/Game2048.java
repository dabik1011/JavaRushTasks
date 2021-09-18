package com.javarush.games.game2048;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

public class Game2048 extends Game {

    private static final int SIDE = 4;

    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        super.setCellColor(x, y, color);
    }

    private void drawScene() {
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColor(x, y, Color.SILVER);
            }
        }
    }

    private void createNewNumber() {

        boolean isCreate = false;
        do {
            int x = getRandomNumber(SIDE);
            int y = getRandomNumber(SIDE);
            int random = getRandomNumber(10);
            if (gameField[x][y] == 0) {
                gameField[x][y] = random < 9 ? 2 : 4;
                isCreate = true;
            }


        } while (!isCreate);

    }
}

