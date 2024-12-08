package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                """);
        int choice = scanner.nextInt();
        if (choice == 1) {
            Cli.aksName();
        }
        else if (choice == 2) {
            Cli.aksName();
            EvenGame.game(); }
        else {
            System.out.println("Goodbye!");
        }
    }
}
