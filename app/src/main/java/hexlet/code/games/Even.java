package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void StartGameEven() {
        String conditions = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        int countOfRounds = 3;
        int countOFGameData = 2;
        String[][] gameData = new String[countOfRounds][countOFGameData];

        System.out.println(conditions);

        for (int i = 0; i < countOfRounds; i++) {
            int randomNumber = (int) (Math.random() * (30 - 2 + 1) + 2);
            String expression = Integer.toString(randomNumber);
            gameData[i][0] = expression;

            if (randomNumber % 2 == 0) {
                gameData[i][1] = "yes";
            } else {
                gameData[i][1] = "no";
            }
        }
        Engine.StartTheGame(conditions, gameData);
    }
}
