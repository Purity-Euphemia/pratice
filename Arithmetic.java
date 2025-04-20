import java.util.Scanner;
public class Arithmetic{
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number1 = input.nextInt();
		System.out.print("Enter an integer: ");
 		int number2 = input.nextInt();
		int square1 = number1 * number1;
		int square2 = number2 * number2;
		System.out.printf("The square of first and the second number is %d, %d%n", square1, square2);
		int sum = square1 + square2;
		System.out.printf("The sum of the square is %d%n", sum);
		int subtraction = square1 - square2;
		System.out.printf("The difference is %d", subtraction);



	}
}