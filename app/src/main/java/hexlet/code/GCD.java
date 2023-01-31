package hexlet.code;

public class GCD {
    public static void FindingNode() {
        String message = "Find the greatest common divisor of given numbers.";
        Engine.displayName(message);
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {
            int number1 = (int) (Math.random() * (20 - 1 + 1) + 1);
            int number2 = (int) (Math.random() * (20 - 1 + 1) + 1);
            String mathematicalExpression = number1  + " " + number2;
            int numberForChecking1 = number1;
            int numberForChecking2 = number2;
            Engine.Answering(mathematicalExpression);

            while (numberForChecking1 != numberForChecking2) {
                if (numberForChecking1 > numberForChecking2) {
                    numberForChecking1 = numberForChecking1 - numberForChecking2;
                } else {
                    numberForChecking2 = numberForChecking2 - numberForChecking1;
                }
            }
            int nod = numberForChecking1;

            if (Integer.toString(nod).equals(Engine.answer)) {
                System.out.println("Correct!");
                countOfVictories++;
            } else {
                Engine.ElseOutput(mathematicalExpression, nod);
                break;
            }
        }
        Engine.CheckForVictory(countOfVictories);
    }
}