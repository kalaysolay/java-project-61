package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GcdGame {
    public static void startGame(){
        String[][] questions = new String[Engine.getQuestionCount()][2];
        Random rand = new Random();

        for (int i = 0; i<Engine.getQuestionCount(); i++){
            int firstValue = rand.nextInt(100);
            int secondValue = rand.nextInt(100);
            questions[i][0] = firstValue + " " + secondValue;
            questions[i][1] = String.valueOf(getGcdValue(firstValue, secondValue));
        }
        Engine.start(questions, Calc.Task);
    }

    public static int getGcdValue(int firstValue, int secondValue){
        while (secondValue != 0) {
            int temp = secondValue;
            secondValue = firstValue % secondValue;
            firstValue = temp;
        }
        return Math.abs(firstValue); // мало ли вдруг будеть отрицательное, поэтому модуль
    }
}
