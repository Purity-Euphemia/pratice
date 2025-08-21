public class ReturnArray{
	public static int[] AllArray() {

	int[] value = {1, 2, 3, 4, 5, 6, 7, 8};
	return value;
	


}

public static void main(String[] args) {
	int[] number = AllArray();
	for(int count = 1; count < number.length; count++) {

		System.out.print(number[count] + " ");

}
}


}