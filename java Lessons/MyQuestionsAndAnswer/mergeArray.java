public class mergeArray{
	public static int[] twoNumbers(int[] Array1, int[] Array2){
	int[] newArray = new int[Array1.length + Array2.length];

	for(int count = 0; count < Array1.length; count++){
		newArray = Array[count];

}

	for(int count = 0; count < Array2.length; count++){
		newArray[Array1.length + count] = Array2[count];

}
	return newArray;

}


public static void main(String[] args){
	int[] value1 = {2};
	int[] value2 = {3};

	int[] newArray = twoNumbers(value1, value2);

	System.out.print(twoNumbers(value));


}

}