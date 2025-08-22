import ReturnArrayNumber;
public class MainClass2 {
	public static void main(String[] args) {
	int[] number = ReturnArrayNumber.AllArray();
	for(int count = 1; count < number.length; count++) {

		System.out.print(number[count] + " ");

}
}

}