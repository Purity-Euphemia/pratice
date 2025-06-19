import java.util.Scanner;
public class AnalyzeNumbers {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		final int NUMBER_OF_ELEMENTS = 4;
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum = 0;

	
		for (int count = 0; count < NUMBER_OF_ELEMENTS; count++) {
			System.out.print("Enter a new number: ");
			numbers[count] = input.nextDouble();
			sum += numbers[count];

		}

		double average = sum / NUMBER_OF_ELEMENTS;

		int count = 0;
		for (int counter = 0; counter < NUMBER_OF_ELEMENTS; counter++)
			if (numbers[count] > average)
			count++;

		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average " + count);


}
}