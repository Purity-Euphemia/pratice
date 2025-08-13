import java.util.Scanner;

import java.util.Scanner;

public class NumberFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[10];

        for (int count = 0; count < 10; count++) {
            System.out.print("Enter score " + (count + 1) + ": ");
            scores[count] = input.nextDouble();
        }

        double sumEvenIndexes = 0;
        for (int count = 0; count < 10; count += 2) {
            sumEvenIndexes += scores[count];
        }

        System.out.println("Sum of scores at even indexes: " + sumEvenIndexes);

    }
}
