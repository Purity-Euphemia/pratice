public class Test {
	public static void main(String[] args) {
	int n = 7;
	int m = 19;
	int sum = add(n);
	System.out.println("The sum of " + n + " and " + m + " is " + sum);

}
	public static int add(int num1) {
		if (num1 > 0) 
			return 1;
		else if (num1 == 0) 
			return 0;
		else 
			return -1;


}

}