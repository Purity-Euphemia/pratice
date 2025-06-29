import java.util.Scanner;

public class ScoreTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[10]; 

        // Task 1:
        int count = 0;
        while (count < 10) {
            System.out.println("Enter score " + (count + 1) + ":");
            scores[count] = input.nextInt();
            count = count + 1;
        }

        // Task 2:
        System.out.println("\nScores printed vertically:");
        count = 0;
        while (count < 10) {
            System.out.println(scores[count]);
            count = count + 1;
        }

        // Task 3:
        System.out.println("\nScores printed horizontally:");
        count = 0;
        while (count < 10) {
            System.out.print(scores[count] + " ");
            count = count + 1;
        }
        System.out.println();

        // Task 4:
        int[] evenIndexes = new int[5];
        count = 0;
        int counter = 0;
        while (count < 10) {
            if (count % 2 == 0) {
                evenIndexes[counter] = scores[count];
                counter = counter + 1;
            }
            count = count + 1;
        }

        // Task 5: 
        int[] oddIndexes = new int[5]; 
        count = 0;
        counter = 0;
        while (count < 10) {
            if (count % 2 == 1) {
                oddIndexes[counter] = scores[count];
                counter = counter + 1;
            }
            count = count + 1;
        }

        // Task 6:
        int sumEven = 0;
        count = 0;
        while (count < 5) {
            sumEven = sumEven + evenIndexes[count];
            count = count + 1;
        }

        // Task 7:
        int sumOdd = 0;
        count = 0;
        while (count < 5) {
            sumOdd = sumOdd + oddIndexes[count];
            count = count + 1;
        }

    
        System.out.println("\nEven index elements:");
        count = 0;
        while (count < 5) {
            System.out.println(evenIndexes[count]);
            count = count + 1;
        }

        System.out.println("\nOdd index elements:");
        count = 0;
        while (count < 5) {
            System.out.println(oddIndexes[count]);
            count = count + 1;
        }

        System.out.println("\nSum of even index elements: " + sumEven);
        System.out.println("Sum of odd index elements: " + sumOdd);
    }
}