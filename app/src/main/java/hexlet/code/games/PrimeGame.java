package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class PrimeGame {
    public static final String TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int NUMBERRANGE = 10;

    public static void startGame() {
        String[][] questions = new String[Engine.QUESTIONSCOUNT][2];
        Random rand = new Random();

        for (int i = 0; i < Engine.QUESTIONSCOUNT; i++) {
            int number = rand.nextInt(NUMBERRANGE);

            questions[i][0] = String.valueOf(number);
            questions[i][1] = isPrimeNumber(number) ? "yes" : "no";
        }
        Engine.start(questions, PrimeGame.TASK);
    }

    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
