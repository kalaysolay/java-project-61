package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GcdGame {
    public static final String TASK = "Find the greatest common divisor of given numbers.";
    private static final int MAXVALUE = 100;

    public static void startGame() {
        String[][] questions = new String[Engine.QUESTIONSCOUNT][2];
        Random rand = new Random();

        for (int i = 0; i < Engine.QUESTIONSCOUNT; i++) {
            int firstValue = rand.nextInt(MAXVALUE);
            int secondValue = rand.nextInt(MAXVALUE);
            questions[i][0] = firstValue + " " + secondValue;
            questions[i][1] = String.valueOf(getGcdValue(firstValue, secondValue));
        }
        Engine.start(questions, GcdGame.TASK);
    }

    public static int getGcdValue(int firstValue, int secondValue) {
        while (secondValue != 0) {
            int temp = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = temp;
        }
        return Math.abs(firstValue);
    }
}
