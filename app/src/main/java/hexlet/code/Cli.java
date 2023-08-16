package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, world!");
        System.out.print("What is your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
}
/* Можно попробовать сделать так чтобы был основной класс с шаблоном кода, котопый используется во всех 4-ёх играх
   и потом в каждом другом классе отвечающем за определённую игру, реализовывать метод, который вызывает тот класс с
   шаблоном и передает определённые праметры для вычисления.
 */
