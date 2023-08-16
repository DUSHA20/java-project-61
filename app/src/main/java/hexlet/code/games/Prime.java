package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static String FindPrimeNumber(int randomNumber) {
        String result = "";
        for (int i = 0; i < 3; i++) {
            int modulo;
            boolean isPrime = true;
            for (int j = 2; j <= randomNumber/2; j++) {
                modulo = randomNumber % j;
                if (modulo == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                result = "yes";
            } else {
                result = "no";
            }
        }
        return result;
    }
    public static void StartGamePrime() {
        String conditions = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        int countOfRounds = 3;
        int countOFGameData = 2;
        String[][] gameData = new String[countOfRounds][countOFGameData];

        for (var i = 0; i < countOfRounds; i++) {
            int randomNumber = (int) (Math.random() * (20 - 1 + 1) + 1);
            String expression = Integer.toString(randomNumber);
            gameData[i][0] = expression;
            gameData[i][1] = FindPrimeNumber(randomNumber);
        }
        Engine.StartTheGame(conditions, gameData);
    }
}