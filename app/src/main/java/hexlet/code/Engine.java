package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static String answer;
    public static String userName;

    public static void displayName(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Engine.userName = in.next();
        System.out.println("Hello, " + Engine.userName + "!");
        System.out.println(message);
    }
    public static void Answering(String expression) {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Question: " + expression);
        Engine.answer = in1.next();
        System.out.println("Your answer: " + answer);
    }
    public static void CheckForVictory(int countOfVictories) {
        int CheckNumber = 3;
        if (countOfVictories == CheckNumber) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
    public static void ElseOutput(String mathematicalExpression1, int mathematicalExpression2) {
        System.out.println("Question: " + "'" + mathematicalExpression1 + "'");
        System.out.println("Your answer: " + Engine.answer);
        System.out.println("'" + Engine.answer + "'" + " " + "is wrong answer ;(. Correct answer was" + " " + "'" + mathematicalExpression2 + "'");
        System.out.println("Let's try again, " + Engine.userName + "!");
    }
}