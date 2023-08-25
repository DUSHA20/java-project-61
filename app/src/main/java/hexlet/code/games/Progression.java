package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static String[] findProgression(int beginNumber, int step, int length, char randomOperation) {

        int[] sourceArray = new int[length];
        sourceArray[0] = beginNumber;

        for (int i = 1; i < sourceArray.length; i++) {
            switch (randomOperation) {
                case '-':
                    sourceArray[i] = sourceArray[i - 1] - step;
                    break;
                case '+':
                    sourceArray[i] = sourceArray[i - 1] + step;
                    break;
                default:
                    break;
            }
        }

        String[] stringArray = new String[length];
        for (var j = 0; j < stringArray.length; j++) {
            stringArray[j] = String.valueOf(sourceArray[j]);
        }

        return stringArray;
    }
    public static String arrayWithHiddenNumber(String[] array, int randomNumberOfIndex) {
        array[randomNumberOfIndex] = "..";
        return String.join(" ", array);
    }

    public static void startGameProgression() {
        String conditions = "What number is missing in the progression?";
        int countOfRounds = 3;
        int countOFGameData = 2;
        String[][] gameData = new String[countOfRounds][countOFGameData];
        for (var i = 0; i < countOfRounds; i++) {
            int beginNumber = (int) (Math.random() * (20 - 1 + 1) + 1);
            int step = (int) (Math.random() * (8 - 1 + 1) + 1);
            int randomNumberOfIndex = (int) (Math.random() * (9 - 1 + 1) + 1);
            int lengthOfProgression = (int) (Math.random() * ((10 - 5) + 1) + 5);
            char[] symbols = new char[]{'-', '+'};
            int symbol = (int) Math.floor(Math.random() * symbols.length);
            char randomOperation = symbols[symbol];
            String[] array = findProgression(beginNumber, step, lengthOfProgression, randomOperation);
            int changedElement = Integer.parseInt(array[randomNumberOfIndex - 1]) + step;
            String stringСhangedElement = Integer.toString(changedElement);

            gameData[i][0] = arrayWithHiddenNumber(array, randomNumberOfIndex);
            gameData[i][1] = stringСhangedElement;
        }

        Engine.startTheGame(conditions, gameData);
    }
}
