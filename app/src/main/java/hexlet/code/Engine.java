package hexlet.code;
import java.util.Scanner;

public class Engine {
    private static final int QUESTIONSCOUNT = 3;

    /*
        массив questions содержит в первом измерении вопрос, во втором - правильный ответ
        Мы проверяем, если пользователь ответил на вопрос также, как и в значении массива questions[i][1],
        то считаем отет верным
        ..
        calc:
            questions[2+2][4]
            questions[5-2][3]
        ..
        evengame:
            questions[76][yes]
            questions[31][no]
     */

    public static int getQuestionCount() {
        return QUESTIONSCOUNT;
    }

    public static void start(String[][] questions, String task) {
        System.out.println(task); // приветственная строка для игры
        Scanner scanner = new Scanner(System.in);
        // перебираем весь массив вопросов и выводим сам вопрос и ожидаем ответ
        // затем сравниваем введенное значение и rightAnswer
        for (int i = 0; i < QUESTIONSCOUNT; i++) {
            String questionTitle = questions[i][0]; // забираем вопрос из массива
            String rightAnswer = questions[i][1];
            System.out.println("Question: " + questionTitle);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'."
                        + rightAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return; // завершаем работу метода, потому что пользоватеь дал не верный ответ
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");

    }
}
