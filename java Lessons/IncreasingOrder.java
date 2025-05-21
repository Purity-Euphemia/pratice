import java.util.Arrays;
import java.util.Scanner;
public class IncreasingOrder{
	public static void main(String[] args){	
	Scanner input = new Scanner(System.in);


	System.out.print("Enter first number: ");
	int number1 = input.nextInt();

 	System.out.print("Enter second number: ");
	int number2 = input.nextInt();

	System.out.print("Enter thrid number: ");
	int number3 = input.nextInt();

	int[] value = {number1, number2, number3};

	Arrays.sort(value);

	System.out.print(Arrays.toString(value));






}
}