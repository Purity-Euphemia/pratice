import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score: ");
            int score = input.nextInt();
            sum = sum + score;
        }
        int average = sum / 10;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
