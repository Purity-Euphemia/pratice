import java.util.Scanner;
public class GuessingPraticeWork{
	public static void main(String[] args) {
	

	int number1 = (int)(Math.random() * 100);
	int number2 = (int)(Math.random() * 100);

	if (number1 < number2){
	int temp = number1;
	number1 = number2;
	number2 = temp;

}

	System.out.print
	("what is " + number1 + " +" + number2 + "? ");
	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();

	if (number1 + number2 == answer)
		System.out.println("True");

	
	else
		System.out.println("False\n" + number1 + " + " + number2 + " should be " + (number1 + number2));

}
}