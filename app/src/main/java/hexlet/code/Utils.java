package hexlet.code;

import java.util.Random;

public class Utils {

    private static final Random randomNumber = new Random();

    public static int getRandomNumberInRange(int min, int max) {

        return randomNumber.nextInt((max - min) + 1) + min;
    }

}
