import java.util.Arrays;
public class evenFunction{
	public static int[] evenNumber(int[] Array){
		int[] even = new int[Array.length];
		int index = 0;

	for (int count = 0; count < Array.length; count++){
		if(Array[count] % 2 != 0){
			even[index] = Array[count];
			index++;	
		}
	}
	int[] result = new int[index];
	for(int count = 0; count < index; count++){
		result[count] = even[count];
}
		return result;
}

public static void main(String[] args){
	int[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] even = evenNumber(count);
		System.out.print(Arrays.toString(even));

	}

}