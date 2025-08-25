import java.util.Arrays;

public class sumOddFunction{
	public static int oddNumber(int[] Array){
	int[] odd = new int[Array.length];
	int index = 0;
	int sum = 0;

	for (int count = 0; count < Array.length; count++){
		if(Array[count] % 2 == 0){
		odd[index] = Array[count];
		sum += odd[index];

	}

}
	return sum;

}

	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(oddNumber(numbers));


	}

}