import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println("Positive number!");
        }
        else if (number < 0) {
            System.out.println("Negative number!");
        }
    }
}
