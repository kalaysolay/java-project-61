package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class ProgressionGame {
    public static final String TASK = "What number is missing in the progression?";
    private static final int PROGRESSIONLENGTHMIN = 5;
    private static final int PROGRESSIONLENGTHMAX = 12;
    private static final int FIRSTELEMENTRANGE = 10;
    public static void startGame() {
        String[][] questions = new String[Engine.getQuestionCount()][2];
        int length;
        int firstElement;
        int difference;
        Random rand = new Random();

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            // генерим число от 5 до 12, это длина прогрессии и количество элементов в массива
            length = rand.nextInt(PROGRESSIONLENGTHMIN, PROGRESSIONLENGTHMAX);
            firstElement = rand.nextInt(FIRSTELEMENTRANGE); // первый элемент прогрессии от 0 до 10
            difference = rand.nextInt(FIRSTELEMENTRANGE) + 1;

            // создаем массив с числами
            String[] progression = new String[length];

            // формируем прогрессию
            for (int j = 0; j < length; j++) {
                progression[j] = String.valueOf(firstElement + j * difference);
            }
            // определяем индекс элемента, который заменим
            int dottedElementPosition = rand.nextInt(length);
            // сохраняем его, чтобы потом записать как ответ
            String dottedElement = progression[dottedElementPosition];
            // заменяем выбранный элемент точками
            progression[dottedElementPosition] = "..";

            questions[i][0] = String.join(" ", progression);
            questions[i][1] = dottedElement;
        }
        Engine.start(questions, ProgressionGame.TASK);
    }
}
