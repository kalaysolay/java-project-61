package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    public static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSIONLENGTHMIN = 5;
    private static final int PROGRESSIONLENGTHMAX = 12;
    private static final int FIRSTELEMENTRANGE = 10;

    public static void startGame() {
        String[][] questions = new String[Engine.QUESTIONSCOUNT][2];
        int length;
        int firstElement;
        int difference;
        Random rand = new Random();

        for (int i = 0; i < Engine.QUESTIONSCOUNT; i++) {
            length = rand.nextInt(PROGRESSIONLENGTHMIN, PROGRESSIONLENGTHMAX);
            firstElement = rand.nextInt(FIRSTELEMENTRANGE);
            difference = rand.nextInt(FIRSTELEMENTRANGE) + 1;
            String[] progression = new String[length];
            for (int j = 0; j < length; j++) {
                progression[j] = String.valueOf(firstElement + j * difference);
            }
            int dottedElementPosition = rand.nextInt(length);
            String dottedElement = progression[dottedElementPosition];
            progression[dottedElementPosition] = "..";
            questions[i][0] = String.join(" ", progression);
            questions[i][1] = dottedElement;
        }
        Engine.start(questions, ProgressionGame.DESCRIPTION);
    }
}
