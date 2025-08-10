import java.util.Scanner;

public class GuessFavoriteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int favoriteNumber = (int) (Math.random() * 3);

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == 7) {
                System.out.println("That's my favorite number!");
                break;
            } else {
                System.out.println("Nice try, guess again!");
            }
        }

    }
}

