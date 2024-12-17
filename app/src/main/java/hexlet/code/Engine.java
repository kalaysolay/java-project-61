package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int QUESTIONSCOUNT = 3;
    private static String name;

    public static void aksName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
    public static void start(String[][] questions, String task) {
        System.out.println(task);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < QUESTIONSCOUNT; i++) {
            String questionTitle = questions[i][0];
            String rightAnswer = questions[i][1];
            System.out.println("Question: " + questionTitle);
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'."
                        + rightAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }
}
