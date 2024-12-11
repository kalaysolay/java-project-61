package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        int choice = scanner.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == 1) {
            Cli.aksName();
        }
        else if (choice == 2) {
            Cli.aksName();
            EvenGame.startGame();
        }
        else if (choice == 3) {
            Cli.aksName();
            Calc.startGame();
        }
        else if (choice == 4) {
            Cli.aksName();
            GcdGame.startGame();
        }
        else if (choice == 5) {
            Cli.aksName();
            ProgressionGame.startGame();
        }
        else if (choice == 6) {
            Cli.aksName();
            PrimeGame.startGame();
        } else {
            System.out.println("Goodbye!");
        }
    }
}
