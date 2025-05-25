import java.util.Scanner;
public class PalindromeNumberSecondTest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number;

	while(true){
		System.out.print("Enter a five_digtis integer: ");
		number = input.nextInt();

		if(number < 10000 || number > 99999) {
		System.out.println("Error: Number is not five_digtis integer. please try again.");

}

		else {
			break;


}
}

		int number1 = (number / 10000) % 10;
		int number2 = (number / 1000) % 10;
		int number3 = (number / 100) % 10;
		int number4 = (number / 10) % 10;
		int number5 = (number / 1) % 10;

	if (number1 == number5 && number2 == number4) {
			System.out.println(number + " is a five_digtis palindrome.");

}

		else {
			System.out.println(number + " is NOT a five_digtis palindrome.");


}



}
}