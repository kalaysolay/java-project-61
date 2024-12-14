package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    public static final String TASK = "What is the result of the expression?";
    private static final int FIRSTVALUERANGE = 10;
    private static final int SECONDVALUERANGE = 10;
    public static void startGame() {
        String[][] questions = new String[Engine.getQuestionCount()][2];
        String[] operators = {"+", "-", "*"}; // Массив строк
        Random rand = new Random();

        for (int i = 0; i < Engine.getQuestionCount(); i++) {
            int firstValue = rand.nextInt(FIRSTVALUERANGE);
            int secondValue = rand.nextInt(SECONDVALUERANGE);
            String operator = operators[rand.nextInt(0, operators.length)];
            questions[i][0] = firstValue + " " + operator + " " + secondValue;
            questions[i][1] = String.valueOf(calculate(firstValue, secondValue, operator));
        }
        Engine.start(questions, Calc.TASK);
    }

    private static int calculate(int firstValue, int secondValue, String operator) {
        return switch (operator) {
            case "+" -> firstValue + secondValue;
            case "-" -> firstValue - secondValue;
            case "*" -> firstValue * secondValue;
            default -> throw new RuntimeException();
        };
    }

}
