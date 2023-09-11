package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    
    private static final int MIN_NUMBER_1 = 1;

    private static final int MIN_NUMBER_5 = 5;

    private static final int MAX_NUMBER_1 = 20;

    private static final int MAX_NUMBER_8 = 8;

    private static final int MAX_NUMBER_9 = 9;

    private static final int MAX_NUMBER_10 = 10;

    private static final String CONDITIONS = "What number is missing in the progression?";

    private static char getRandomOperation() {

        char[] symbols = {'+', '-'};
        int randomIndex = Utils.getRandomNumberInRange(0, symbols.length - 1);
        return symbols[randomIndex];
    }

    public static int[] generateProgression(int beginNumber, int step, int length) {

        int[] progression = new int[length];
        progression[0] = beginNumber;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + step;
        }

        return progression;
    }

    public static String[] generateProgressionWithHiddenElement(int[] progression, int randomNumberOfIndex) {

        String[] stringArray = new String[progression.length];

        for (int j = 0; j < stringArray.length; j++) {
            if (j == randomNumberOfIndex) {
                stringArray[j] = "..";
            } else {
                stringArray[j] = String.valueOf(progression[j]);
            }
        }

        return stringArray;
    }

    public static void startGameProgression() {

        int countOfRounds = Engine.getCountOfRounds();
        int countOfGameData = Engine.getCountOfGameData();
        String[][] gameData = new String[countOfRounds][countOfGameData];

        for (int i = 0; i < countOfRounds; i++) {

            int beginNumber = Utils.getRandomNumberInRange(MIN_NUMBER_1, MAX_NUMBER_1);
            int step = Utils.getRandomNumberInRange(MIN_NUMBER_1, MAX_NUMBER_8);
            int lengthOfProgression = Utils.getRandomNumberInRange(MIN_NUMBER_5, MAX_NUMBER_10);
            int randomNumberOfIndex = Utils.getRandomNumberInRange(MIN_NUMBER_1, Math.min(MAX_NUMBER_9, lengthOfProgression - 1));

            int[] progression = generateProgression(beginNumber, step, lengthOfProgression);
            String[] array = generateProgressionWithHiddenElement(progression, randomNumberOfIndex);
            int changedElement = progression[randomNumberOfIndex];
            String stringChangedElement = Integer.toString(changedElement);

            gameData[i][0] = String.join(" ", array);
            gameData[i][1] = stringChangedElement;
        }

        Engine.startTheGame(CONDITIONS, gameData);
    }
}
