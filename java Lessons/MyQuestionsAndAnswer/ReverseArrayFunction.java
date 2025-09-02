import java.util.Arrays;
public class ReverseArrayFunction{
	public static int[] printReverse(int[] array){
	int[] newArray =  new int[array.length];

	for(int count = 0; count < array.length; count++){
		newArray[count] = array[array.length - 1 - count];

}

	return newArray;

}

public static void main(String[] args){
	int[] value = {1,2,3,4,5,6};
	int[] result = printReverse(value);
	System.out.println(Arrays.toString(result));

}
}