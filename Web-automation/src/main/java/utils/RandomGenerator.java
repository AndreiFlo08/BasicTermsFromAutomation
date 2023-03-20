package utils;

import java.util.Random;

public class RandomGenerator {
    public static int generateIntegerValue(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static String generateStringValue(int length) {
        String CHARACTER_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int c = (int) (Math.random() * CHARACTER_STRING.length());
            builder.append(CHARACTER_STRING.charAt(c));
        }
        return builder.toString();
    }

    public static String alphaNumericValue(int length) {
        String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder builder = new StringBuilder();
        for(int i  = 0; i < length; i++) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
}
