public class MethodMax {	
	public static int max(int num1, int num2) {
	
	int result;

	if (num1 > num2)
		result = num1;

	else
		result = num2;

	return result;


}


public static void main(String[] args) {
	

	System.out.print("The max is " + max(40, 30));



}
}