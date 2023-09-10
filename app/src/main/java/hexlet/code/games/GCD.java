package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int MIN_NUMBER = 1;

    private static final int MAX_NUMBER = 20;

    private static final String CONDITIONS = "Find the greatest common divisor of given numbers.";

    public static int calculateGCD(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;
    }

    public static int findGCD(int randomNumber1, int randomNumber2) {

        int gcd = calculateGCD(randomNumber1, randomNumber2);
        return gcd;
    }

    public static void startGameGCD() {

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (var i = 0; i < countOfRounds; i++) {

            int randomNumber1 = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            int randomNumber2 = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            String mathematicalExpression = randomNumber1 + " " + randomNumber2;
            gameData[i][0] = mathematicalExpression;
            gameData[i][1] = String.valueOf(findGCD(randomNumber1, randomNumber2));
        }

        Engine.startTheGame(CONDITIONS, gameData);
    }
}

