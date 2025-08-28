import java.util.Scanner;
public class evenOddSum{
	public static void checkEvenOdd(int number){
		if(number % 2 == 0){
			System.out.println(number + " is Even");
}
	else {
		System.out.println(number + " is Odd");
	}
}






	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sum = 0;
	
		for (int count = 0; count <= 5; count++) {
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		checkEvenOdd(num); 
		sum += num;
} 	
		System.out.println("Total sum = " + sum);
}
}