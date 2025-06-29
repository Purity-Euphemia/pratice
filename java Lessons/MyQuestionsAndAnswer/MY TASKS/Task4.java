import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter score " + counter + ": ");
            int score = input.nextInt();

            if (score % 2 == 0) {
                count++;
            }
        }

        System.out.println("Number of even scores: " + count);
    }
}