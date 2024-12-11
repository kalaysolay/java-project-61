package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Random;
public class PrimeGame {
    public static final String Task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame(){
        String[][] questions = new String[Engine.getQuestionCount()][2];
        Random rand = new Random();

        for (int i = 0; i<Engine.getQuestionCount(); i++) {
            // генерим число от 5 до 12, это длина прогрессии и количество элементов в массива
            int number = rand.nextInt(100);

            questions[i][0] = String.valueOf(number);
            questions[i][1] = isPrimeNumber(number) ? "yes" : "no";
        }
        Engine.start(questions, PrimeGame.Task);
    }

    private static boolean isPrimeNumber(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= number /2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
