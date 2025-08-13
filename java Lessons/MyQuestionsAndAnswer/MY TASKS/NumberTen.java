import java.util.Scanner;

public class NumberTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score: ");
            int score = input.nextInt();
            if (score >= 0 && score <= 10) {
                sum += score;
            }
            else {
                System.out.println("Invalid score");
            }
        }
        Double average = sum / 10.0;
        System.out.println("The average is: " + average);
    }
}
