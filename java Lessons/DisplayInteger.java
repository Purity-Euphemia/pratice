import java.util.Scanner;
public class DisplayInteger{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int remainder = 0;
	int sum = 0;
	
	System.out.print("Enter an integer between 1 to 10000: ");
	int number = input.nextInt();
	
	if (number <= 0 || number > 10000) {
		System.out.print("Invalid number");

} else {
		while (number > 0) {
		remainder = number % 10;
		sum = sum + remainder;
		number = number / 10;
}	

	System.out.printf("The sum of the number: %d ", sum);

}
}


}