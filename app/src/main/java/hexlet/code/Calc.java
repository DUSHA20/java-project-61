package hexlet.code;

public class Calc {
    public static void Calculations() {
        String message = "What is the result of the expression?";
        Engine.displayName(message);
        int countOfVictories = 0;
        for (int i = 0; i < 3; i++) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            char[] symbols = new char[] {'*','-','+'};
            int symbol = (int)Math.floor(Math.random() * symbols.length);
            char CurrentSymbol = symbols[symbol];
            String mathematicalExpression1 = number1 + " " + CurrentSymbol + " " + number2;
            Engine.Answering(mathematicalExpression1);

            if (CurrentSymbol == '*') {
                int expressionWithMultiplication = number1 * number2;
                if (Integer.toString(number1 * number2).equals(Engine.answer)) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    Engine.ElseOutput(mathematicalExpression1, expressionWithMultiplication);
                    break;
                }
            }
            else if (CurrentSymbol == '-') {
                int expressionWithMines = number1 - number2;
                if (Integer.toString(number1 - number2).equals(Engine.answer)) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    Engine.ElseOutput(mathematicalExpression1, expressionWithMines);
                    break;

                }
            } else {
                int expressionWithPlus = number1 + number2;
                if (Integer.toString(number1 + number2).equals(Engine.answer)) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    Engine.ElseOutput(mathematicalExpression1, expressionWithPlus);
                    break;
                }
            }
        }
        Engine.CheckForVictory(countOfVictories);
    }
}