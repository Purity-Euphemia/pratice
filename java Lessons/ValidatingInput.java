import java.util.Scanner;
public class ValidatingInput {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int fail = 0;
	int pass = 0;
	int number;

	for(int count = 1; count <= 10; count++) {

		System.out.print("Enter a number: ");
		number = input.nextInt();

		if (number == 1) {
			pass += 1;

		} else if(number == 2){
			fail = fail + 1;

		} else {
			System.out.println("invalid input");
			continue;
}
}
		System.out.printf("The pass: %d%n", pass);
		System.out.printf("The fail: %d%n", fail);


}
}