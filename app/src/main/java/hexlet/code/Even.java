package hexlet.code;

public class Even {
    public static void ParityCheck() {
        String message = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.displayName(message);
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 50);
            String expression = Integer.toString(number);
            Engine.Answering(expression);

            if (number % 2 == 0 && Engine.answer.equals("yes")) {
                System.out.println("Correct!");
                countOfVictories++;
            }
            else if (number % 2 != 0 && Engine.answer.equals("no")) {
                System.out.println("Correct!");
                countOfVictories++;
            }
            else if (number % 2 == 0 && Engine.answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + Engine.userName + "!");
                break;
            }
        }
        Engine.CheckForVictory(countOfVictories);
    }
}