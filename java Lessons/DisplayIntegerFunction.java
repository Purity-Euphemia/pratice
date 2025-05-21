public class DisplayIntegerFunction{
	public static int DisplayIntegerFunctionTest(int number){

	int remainder = 0;
	int sum = 0;

	if (number <= 0 || number > 10000) {
		System.out.print("Invalid number");

} else {
		while (number > 0) {
		remainder = number % 10;
		sum = sum + remainder;
		number = number / 10;		

}		
}
		return sum;	
}


}