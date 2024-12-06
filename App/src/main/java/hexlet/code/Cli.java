package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String aksName(){
        Scanner sc = new Scanner(System.in);

        System.out.println("May I have your name? ");
         /*var name = sc.next();
        System.out.println("Hello, " + name);*/
        // String input = "1 fish 2 fish red fish blue fish";
        String name = sc.nextLine();
        return name;
    }
}
