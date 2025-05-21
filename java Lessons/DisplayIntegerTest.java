import java.util.Scanner;
public class DisplayIntegerTest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	
	System.out.print("Enter an integer between 1 to 10000: ");
	int number = input.nextInt();
	System.out.println(DisplayIntegerFunction.DisplayIntegerFunctionTest(number));
	
}
}


