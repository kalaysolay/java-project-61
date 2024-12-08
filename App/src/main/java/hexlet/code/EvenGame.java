package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int number;
        int score = 0;
        String answer;
        int questionCount = 3;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            number = rand.nextInt(100); // random number in rage 0 to 99
            System.out.println("Question: " + number);
            System.out.print("Your answer:");
            answer = scanner.nextLine();
            if (number % 2 == 0 && answer.contains("yes")) {
                System.out.println("Correct!");
                score++; }
            // если не четное, а пользователь ответил Да
            else if (number % 2  != 0 && answer.contains("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Cli.getName() + "!");
                break;
            }
            // если не четное и пользователь ответил нет
            else if (number % 2 != 0 && answer.contains("no")) {
                System.out.println("Correct!");
                score++; }
            // если четное и пользователь ответил нет
            else if (number % 2 == 0 && answer.contains("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break; }
            else if (!answer.contains("yes") || !answer.contains("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                break;
                }
            else {
                break;
                }
        }
        if (score == questionCount) {
            System.out.println("Congratulations, " + Cli.getName());
        }
    }
}
