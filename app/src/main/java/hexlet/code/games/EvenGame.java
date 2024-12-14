package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    public static final String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int NUMBERRANGE = 100;
    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String[][] questions = new String[Engine.getQuestionCount()][2];
        int number;

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            number = rand.nextInt(NUMBERRANGE); // random number in rage 0 to 99
            questions[i][0] = String.valueOf(number);
            if (number % 2 == 0) {
                questions[i][1]  = "yes";
            } else {
                questions[i][1]  = "no";
            }
        }
        Engine.start(questions, EvenGame.TASK);
    }
}
