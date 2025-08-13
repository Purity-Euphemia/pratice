import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int avaerage = 0;
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score: ");
            int score = input.nextInt();
            sum = sum + score;
        }

        avaerage = sum / 10;
        System.out.println("The average is: " + avaerage);
    }
}
