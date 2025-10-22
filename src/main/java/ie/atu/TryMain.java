package ie.atu;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {

            System.out.println("Enter your age");
            String text = sc.nextLine().trim();
            try {
                age = Integer.parseInt(text);
                System.out.println("Your age is " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input" + e.getMessage());
            }

        }
    }
}