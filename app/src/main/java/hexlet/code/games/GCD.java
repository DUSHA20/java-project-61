package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
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

    public static String findGCD(int randomNumber1, int randomNumber2) {
        int gcd = calculateGCD(randomNumber1, randomNumber2);
        return Integer.toString(gcd);
    }

    public static void startGameGCD() {
        String conditions = "Find the greatest common divisor of given numbers.";
        int countOfRounds = 3;
        int countOFGameData = 2;
        String[][] gameData = new String[countOfRounds][countOFGameData];
        System.out.println(conditions);

        for (var i = 0; i < countOfRounds; i++) {
            int randomNumber1 = (int) (Math.random() * (20 - 1 + 1) + 1);
            int randomNumber2 = (int) (Math.random() * (20 - 1 + 1) + 1);
            String mathematicalExpression = randomNumber1 + " " + randomNumber2;
            gameData[i][0] = mathematicalExpression;
            gameData[i][1] = findGCD(randomNumber1, randomNumber2);
        }
        Engine.startTheGame(conditions, gameData);
    }
}

