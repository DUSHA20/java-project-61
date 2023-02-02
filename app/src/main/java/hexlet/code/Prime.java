package hexlet.code;

public class Prime  {
    public static void FindPrime() {
        String message = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.displayName(message);
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {
            int number = (int) (Math.random() * (20 - 1 + 1) + 1);
            String expression = Integer.toString(number);
            Engine.Answering(expression);

            int temp;
            boolean isPrime = true;
            // проверяем число на простоту
            for (int j = 2; j <= number/2; j++) {
                temp = number % j;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            // если переменная isPrime равна true, то число простое
            if (isPrime && Engine.answer.equals("yes")) {
                System.out.println("Correct!");
                countOfVictories++;
            }
            else if (!isPrime && Engine.answer.equals("no")) {
                System.out.println("Correct!");
                countOfVictories++;
            } else if (isPrime && Engine.answer.equals("no")) {
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