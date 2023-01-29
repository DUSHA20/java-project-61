package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void ParityCheck() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {
            Scanner in1 = new Scanner(System.in);
            int number = (int) (Math.random() * 50);
            System.out.println("Question: " + number);
            String answer = in1.next();
            System.out.println("Your answer: " + answer);

            if (number % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
                countOfVictories++;
            }
            else if (number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
                countOfVictories++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (i == 2) {
                in1.close();
            }
        }
        int CheckNumber = 3;
        if (countOfVictories == CheckNumber) {
            System.out.println("Congratulations, " + userName + "!");
        }
        in.close();
    }
}