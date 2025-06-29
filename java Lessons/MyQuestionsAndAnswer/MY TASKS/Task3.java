import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	int sum = 0;
	int average = 0;

        for (int count = 1; count <= 10; count++) {

            System.out.print("Enter score: ");
            int score = input.nextInt();
		sum = sum + score;
		average = average + sum;
            
      	
  }
		System.out.println("Your sum: " + sum);
		System.out.println("Your Average: " + average);
    }
}