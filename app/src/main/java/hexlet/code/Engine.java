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
    // можно ли сделать параметр, который не обязательно передовать в метод?
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
}