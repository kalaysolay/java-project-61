package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;
import java.util.Scanner;

public class App {
    // это все чтобы от Magic number уйти
    private static final int EXIT = 0;
    private static final int GREET = 1;
    private static final int EVENGAME = 2;
    private static final int CALC = 3;
    private static final int GCDGAME = 4;
    private static final int PROGRESSIONGAME = 5;
    private static final int PRIMEGAME = 6;
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
        if (choice == GREET) {
            Cli.aksName();
        } else if (choice == EVENGAME) {
            Cli.aksName();
            EvenGame.startGame();
        } else if (choice == CALC) {
            Cli.aksName();
            Calc.startGame();
        } else if (choice == GCDGAME) {
            Cli.aksName();
            GcdGame.startGame();
        } else if (choice == PROGRESSIONGAME) {
            Cli.aksName();
            ProgressionGame.startGame();
        } else if (choice == PRIMEGAME) {
            Cli.aksName();
            PrimeGame.startGame();
        } else {
            System.out.println("Goodbye!");
        }
    }
}
