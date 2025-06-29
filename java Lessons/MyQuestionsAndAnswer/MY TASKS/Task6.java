import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int count = 0;

        for (int counter = 1; counter <= 10; counter++) {
            System.out.print("Enter score: ");
            int score = input.nextInt();

            if (score % 2 == 0) {
                total += score;
                count++;
            }
        }

        if (count != 0) {
            double average = (double) total / count;

		System.out.println("Average of even numbers: " + average);
	 } else {
            	System.out.println("No even numbers entered.");

		
        }
    }
}