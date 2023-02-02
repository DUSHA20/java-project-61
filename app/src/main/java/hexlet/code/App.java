package hexlet.code;
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
        System.out.println("0 - Exit");
        int num = in.nextInt();
        System.out.println("Your choice: " + num);
        switch (num) {
            case 0:
                System.out.println("Bye!");
                break;
            case 1:
                Scanner in_1 = new Scanner(System.in);
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String userName = in_1.next();
                System.out.println("Hello, " + userName + "!");
                in_1.close();
                break;
            case 2:
                Even.ParityCheck();
                break;
            case 3:
                Calc.Calculations();
                break;
            case 4:
                GCD.FindingNode();
                break;
            case 5:
                Progression.FindProgression();
                break;
        }
        in.close();
    }
}