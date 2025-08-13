import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score: ");
            int score = input.nextInt();
            if (score % 2 == 0) {
                sum += score;
            }
        }
        double average = sum / 10;
        System.out.println("Average of even numbers: " + average);
    }
}
