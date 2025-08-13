import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter a score: ");
            int score = input.nextInt();
            sum = score + count;
        }
            System.out.println("The sum of the scores " + sum);
    }
}
