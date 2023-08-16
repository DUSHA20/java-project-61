package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.Cli;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        String choiceMessage = "Your choice: ";
        int choice = in.nextInt();
        System.out.println(choiceMessage + choice);

        final String GREET = "1";
        final String EVEN = "2";
        final String CALC = "3";
        final String GCD_GAME = "4";
        final String PROGRESSION = "5";
        final String PRIME = "6";
        final String EXIT = "0";

        switch (Integer.toString(choice)) {
            case EXIT:
                System.out.println("Bye!");
                break;
            case GREET:
                Cli.greetings();
                break;
            case EVEN:
                Even.StartGameEven();
                break;
            case CALC:
                Calc.StartGameCalc();
                break;
            case GCD_GAME:
                GCD.StartGameGCD();
                break;
            case PROGRESSION:
                Progression.StartGameProgression();
                break;
            case PRIME:
                Prime.StartGamePrime();
                break;
            default:
                break;
        }
        in.close();
    }
}

