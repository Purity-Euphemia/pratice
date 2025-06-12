public class MethodSum {
	public static int sum(int count1, int count2) {

	int result = 0;
	for (int count = count1; count <= count2; count++)
		result = result + count;

	return result;



}

public static void main(String[] args) {
	System.out.println("Sum from 1 to 10 is " + sum(1, 10));
	System.out.println("Sum from 20 to 37 is " + sum(20, 37));
	System.out.println("Sum from 35 to 49 is " + sum(35, 49));



}


}