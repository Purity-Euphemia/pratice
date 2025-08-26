import java.util.Arrays;
public class reverseArrayNumber{
	public static int[] reverseArray(int[] Array){
	int[] result = new int[Array.length];

	for(int count = 0; count < Array.length; count++){
		result[count] = Array[Array.length - count - 1];

}
	return result;



}

	public static void main(String[] args){
	int[] value = {1, 2, 3, 4, 5, 6};
	System.out.print(Arrays.toString(reverseArray(value)));

}

	

}