package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void startTheGame(String conditions, String[][] gameData) {
        Scanner user = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = user.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(conditions);

        for (var data : gameData) {
            System.out.println("Question: " + data[0]);
            System.out.print("Your answer: ");
            var userAnswer = user.next();
            if (userAnswer.equals(data[1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "' is wrong answer ;(.");
                System.out.println("Correct answer was '" + data[1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
