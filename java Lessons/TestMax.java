public class TestMax {
	public static void main(String[] args) {

	int number1 = 5;
	int number2 = 2;
	int largest = max(number1, number2);
	System.out.println("The maximum of " + number1 + " and " + number2 + " is " + largest);



}
	public static int max(int num1, int num2) {
		int result;

		if (num1 > num2)
			result = num1;
		else
			result = num2;

		return result;

}
}