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
            String expression = number1 + " " + CurrentSymbol + " " + number2;
            Engine.Answering(expression);

            if (CurrentSymbol == '*') {
                if (Integer.toString(number1 * number2).equals(Engine.answer)) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    // можно сделать метод "реакция на неправильный ответ", где сделать переменную - сообщение с переносом теста на другую строку
                    System.out.println("Question: " + number1 + CurrentSymbol + number2);
                    System.out.println("Your answer: " + Engine.answer);
                    System.out.println("'" + Engine.answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + (number1 * number2) + "'");
                    System.out.println("Let's try again, " + Engine.userName + "!");
                    break;
                }
            }
            else if (CurrentSymbol == '-') {
                if (Integer.toString(number1 - number2).equals(Engine.answer)) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    System.out.println("Question: " + number1 + CurrentSymbol + number2);
                    System.out.println("Your answer: " + Engine.answer);
                    System.out.println("'" + Engine.answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + (number1 - number2) + "'");
                    System.out.println("Let's try again, " + Engine.userName + "!");
                    break;

                }
            } else {
                if (Integer.toString(number1 + number2).equals(Engine.answer)) {
                    System.out.println("Correct!");
                    countOfVictories++;
                } else {
                    System.out.println("Question: " + number1 + CurrentSymbol + number2);
                    System.out.println("Your answer: " + Engine.answer);
                    System.out.println("'" + Engine.answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + (number1 + number2) + "'");
                    System.out.println("Let's try again, " + Engine.userName + "!");
                    break;

                }
            }
        }
        Engine.CheckForVictory(countOfVictories);
    }
}