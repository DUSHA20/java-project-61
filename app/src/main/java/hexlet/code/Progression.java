package hexlet.code;

public class Progression {
    public static void FindProgression() {
        String message = "What number is missing in the progression?";
        Engine.displayName(message);
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {

            int beginNumber = (int) (Math.random() * (20 - 1 + 1) + 1);
            int step = (int) (Math.random() * (8 - 1 + 1) + 1);
            int[] sourceArray;
            sourceArray = new int[10];

            for (int j = 0; j < 10; j++) {
                sourceArray[j] = beginNumber;
                beginNumber = beginNumber + step;
            }

            String justString = "";
            for (int j = 0; j < 10; j++) {
                justString += (Integer.toString(sourceArray[j]) + " "); // почему Integer.toString выделяется серым?
            }

            String[] stringArray = justString.split(" ");
            int randomNumber = (int) (Math.random() * (9 - 1 + 1) + 1); //рандомная переменная (индекс), может быть надо начинать с 0?
            stringArray[randomNumber] = "..";
            int changedElement = Integer.parseInt(stringArray[randomNumber - 1]) + step; // правильное число на месте пропуска
            String arrayToString = String.join(" ", stringArray);
            Engine.Answering(arrayToString);

            if (Integer.toString(changedElement).equals(Engine.answer)) {
                System.out.println("Correct!");
                countOfVictories++;
            } else {
                Engine.ElseOutput(arrayToString, changedElement);
                break;
            }
            Engine.CheckForVictory(countOfVictories);
        }
    }
}