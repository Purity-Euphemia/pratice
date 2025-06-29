public class MethodExercise {

	public static int  product(int a, int b) {
		int c = a * b;
	return c;
}

	public static void phoneBook() {
	String menu = """
	Menu
	Add contact
	Edit contact
	delete contact
	""";
	System.out.println(menu);
}

public static void main(String[] args) {
	System.out.println("The product of " + product(2, 3));
	phoneBook();






}







}