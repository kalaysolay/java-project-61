package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final String Task = "What is the result of the expression?";

    public static void startGame(){
        String[][] questions = new String[Engine.getQuestionCount()][2];
        String[] operators = {"+", "-", "*"}; // Массив строк
        Random rand = new Random();

        for (int i = 0; i<Engine.getQuestionCount(); i++){
            int firstValue = rand.nextInt(10);
            int secondValue = rand.nextInt(10);
            String operator = operators[rand.nextInt(0, operators.length)];
            questions[i][0] = firstValue + " " + operator + " " + secondValue;
            questions[i][1] = String.valueOf(calculate(firstValue, secondValue,operator));
        }
        Engine.start(questions, Calc.Task);
    }

    private static int calculate(int firstValue, int secondValue, String operator){
        if (operator.equals("+")){
            return firstValue+secondValue;
        } else if (operator.equals("-")) {
            return firstValue-secondValue;
        } else if (operator.equals("*")) {
            return firstValue*secondValue;
        } else {
            throw new RuntimeException();
        }
    }

}
