package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {

    private static final int GREET = 1;

    private static final int EVEN = 2;

    private static final int CALC = 3;

    private static final int GCD_GAME = 4;

    private static final int PROGRESSION = 5;

    private static final int PRIME = 6;

    private static final int EXIT = 0;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        printMenu();
        int choice = getChoice(in);
        processChoice(choice);
        in.close();
    }

    private static void printMenu() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    private static int getChoice(Scanner in) {
        System.out.print("Your choice: ");
        int choice = in.nextInt();
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        return choice;
    }

    private static void processChoice(int choice) {

        switch (choice) {
            case EXIT:
                System.out.println("Bye!");
                break;
            case GREET:
                Cli.greetings();
                break;
            case EVEN:
                Even.startGameEven();
                break;
            case CALC:
                Calc.startGameCalc();
                break;
            case GCD_GAME:
                GCD.startGameGCD();
                break;
            case PROGRESSION:
                Progression.startGameProgression();
                break;
            case PRIME:
                Prime.startGamePrime();
                break;
            default:
                break;
        }
    }
}

