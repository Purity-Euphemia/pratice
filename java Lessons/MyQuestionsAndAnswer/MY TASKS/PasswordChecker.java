import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "secret123";
        System.out.print("Enter your password:");
        String word = input.nextLine();
            if (word.equals(password)) {
                System.out.println("Access granted! Welcome!");
            }else {
                System.out.println("Access denied!");
            }
        }
}
