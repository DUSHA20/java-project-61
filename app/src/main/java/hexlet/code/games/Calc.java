package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static final String CONDITIONS = "What is the result of the expression?";
    private static int calculate(char randomOperation, int randomnumber1, int randomnumber2) {
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

        return resultOperation;
    }
    public static void startGameCalc() {
        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];
        System.out.println(CONDITIONS);

        for (int i = 0; i < countOfRounds; i++) {
            int randomNumber1 = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            int randomNumber2 = Utils.getRandomNumberInRange(MIN_NUMBER, MAX_NUMBER);
            char randomOperation = Utils.getRandomOperation3();
            gameData[i][0] = randomNumber1 + " " + randomOperation + " " + randomNumber2;
            gameData[i][1] = Integer.toString(calculate(randomOperation, randomNumber1, randomNumber2));
        }
        Engine.startTheGame(CONDITIONS, gameData);
    }
}
