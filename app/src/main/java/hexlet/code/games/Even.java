package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int MIN_NUMBER = 2;

    private static final int MAX_NUMBER = 30;

    private static final String CONDITIONS = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGameEven() {

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (int i = 0; i < countOfRounds; i++) {

            int randomNumber = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            String expression = Integer.toString(randomNumber);
            gameData[i][0] = expression;
            gameData[i][1] = isEven(randomNumber) ? "yes" : "no";
        }

        Engine.startTheGame(CONDITIONS, gameData);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
