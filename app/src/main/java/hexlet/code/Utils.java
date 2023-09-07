package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random random = new Random();

    public static int getRandomNumberInRange(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    public static char getRandomOperation3() {
        char[] symbols = {'+', '-', '*'};
        return symbols[random.nextInt(symbols.length)];
    }

    public static char getRandomOperation2() {
        char[] symbols = {'-', '+'};
        return symbols[random.nextInt(symbols.length)];
    }
}
