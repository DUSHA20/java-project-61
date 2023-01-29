package hexlet.code;
import java.util.Scanner;

public class Calc {
    public static void Calculations() {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("What is the result of the expression?");
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {
            Scanner in1 = new Scanner(System.in);
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            char[] symbols = new char[] {'*','-','+'};
            int symbol = (int)Math.floor(Math.random() * symbols.length);
            char CurrentSymbol = symbols[symbol];
            System.out.println("Question: " + number1 + CurrentSymbol + number2);
            int answer = in1.nextInt();
            System.out.println("Your answer: " + answer);

            // если в нескольких ифах необходимо писать одно и тоже выражение, то как это упростить?
            if (CurrentSymbol == '*') {
                if (number1 * number2 == answer) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    System.out.println("Question: " + number1 + CurrentSymbol + number2);
                    System.out.println("Your answer: " + answer);
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + (number1 * number2) + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    break;
                }
            }
            else if (CurrentSymbol == '-') {
                if (number1 - number2 == answer) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    System.out.println("Question: " + number1 + CurrentSymbol + number2);
                    System.out.println("Your answer: " + answer);
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + (number1 - number2) + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    break;

                }
            } else {
                if (number1 + number2 == answer) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    System.out.println("Question: " + number1 + CurrentSymbol + number2);
                    System.out.println("Your answer: " + answer);
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + (number1 + number2) + "'");
                    System.out.println("Let's try again, " + userName + "!");
                    break;

                }
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
