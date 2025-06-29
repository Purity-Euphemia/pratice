import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 scores:");
	
	int sum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Score " + count + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
		sum += score;
	}
	}

	System.out.println("Sum of even numbers: " + sum);
	 
    }
}