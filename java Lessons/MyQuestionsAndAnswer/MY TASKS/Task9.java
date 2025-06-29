import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter 10 scores:");

        for (int count = 1; count <= 10; count++) {
            System.out.print("Score " + count + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                total += score;
            }
        }

        System.out.println("Sum of valid scores: " + total);
    }
}