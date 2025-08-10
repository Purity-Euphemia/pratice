import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        System.out.println("Enter 10 scores:");

        for (count = 1; count <= 10; count++) {
            System.out.print("Score " + count + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                total += score;
                count++;
            }
        }

        System.out.println("Sum of valid scores: " + total);

        if (count != 0) {
            double average = (double) total / count;
            System.out.println("Average of valid scores: " + average);
        } else {
            System.out.println("No valid scores entered.");
        }
    }
}