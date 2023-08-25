package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String findPrimeNumber(int randomNumber) {
        boolean isPrimeFound = false;

        for (int i = 0; i < 3; i++) {
            if (isPrime(randomNumber)) {
                isPrimeFound = true;
                break;
            }
        }

        return isPrimeFound ? "yes" : "no";
    }

    public static void startGamePrime() {
        String conditions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int countOfRounds = 3;
        int countOFGameData = 2;
        String[][] gameData = new String[countOfRounds][countOFGameData];

        for (var i = 0; i < countOfRounds; i++) {
            int randomNumber = (int) (Math.random() * (20 - 1 + 1) + 1);
            String expression = Integer.toString(randomNumber);
            gameData[i][0] = expression;
            gameData[i][1] = findPrimeNumber(randomNumber);
        }
        Engine.startTheGame(conditions, gameData);
    }
}
