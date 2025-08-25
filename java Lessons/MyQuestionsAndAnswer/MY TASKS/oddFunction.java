import java.util.Arrays;

public class oddFunction{
	public static int[] oddNumber(int[] Array){
	int[] odd = new int[Array.length];
	int index = 0;

	for (int count = 0; count < Array.length; count++){
		if(Array[count] % 2 == 0){
		odd[index] = Array[count];
		index++;

	}

}

	int[] oddArray = new int[index];
	for (int count = 0; count < index; count++){
		oddArray[count] = odd[count];

	}
	return oddArray;

}

	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] oddNumbers = oddNumber(numbers);
		System.out.println(Arrays.toString(oddNumbers));


	}

}