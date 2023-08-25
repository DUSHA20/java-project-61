package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static String composeMathematicalExpression(char randomOperation, int randomnumber1, int randomnumber2) {
        int resultOperation = 0;

        switch (randomOperation) {
            case '+':
                resultOperation = randomnumber1 + randomnumber2;
                break;
            case '-':
                resultOperation = randomnumber1 - randomnumber2;
                break;
            case '*':
                resultOperation = randomnumber1 * randomnumber2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + randomOperation);
        }

        return Integer.toString(resultOperation);
    }
    public static void startGameCalc() {
        String conditions = "What is the result of the expression?";
        int countOfRounds = 3;
        int countOFGameData = 2;
        String[][] gameData = new String[countOfRounds][countOFGameData];
        System.out.println(conditions);

        for (int i = 0; i < countOfRounds; i++) {
            int randomNumber1 = (int) (Math.random() * (10 - 1 + 1) + 1);
            int randomNumber2 = (int) (Math.random() * (10 - 1 + 1) + 1);
            char[] symbols = new char[]{'*', '-', '+'};
            int symbol = (int) Math.floor(Math.random() * symbols.length);
            char randomOperation = symbols[symbol];
            gameData[i][0] = randomNumber1 + " " + randomOperation + " " + randomNumber2;
            gameData[i][1] = composeMathematicalExpression(randomOperation, randomNumber1, randomNumber2);
        }
        Engine.startTheGame(conditions, gameData);
    }
}
