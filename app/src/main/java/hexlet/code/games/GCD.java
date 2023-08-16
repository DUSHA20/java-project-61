package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static String FindNode(int randomNumber1, int randomNumber2) {
        int numberForChecking1 = randomNumber1;
        int numberForChecking2 = randomNumber2;
        int countOfRounds = 3;
        for (int i = 0; i < countOfRounds; i++) {
            while (numberForChecking1 != numberForChecking2) {
                if (numberForChecking1 > numberForChecking2) {
                    numberForChecking1 = numberForChecking1 - numberForChecking2;
                } else {
                    numberForChecking2 = numberForChecking2 - numberForChecking1;
                }
            }
        }
        int nod = numberForChecking1;
        return Integer.toString(nod);
    }
    public static void StartGameGCD() {
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
            gameData[i][1] = FindNode(randomNumber1, randomNumber2);
        }
        Engine.StartTheGame(conditions, gameData);
    }
}