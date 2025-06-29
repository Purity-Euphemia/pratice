import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score: ");
            int score = input.nextInt();

            if (score % 2 == 0) {
                total += score;
            }
        }

        System.out.println("Sum of even numbers: " + total);
    }
}