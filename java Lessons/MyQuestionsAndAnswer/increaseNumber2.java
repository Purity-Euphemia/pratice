import java.util.Arrays;
public class increaseNumber2{
	public static int[] increamentBy5(int[] array){

	int[] newArray = new int[array.length];

	for(int count = 0; count < array.length; count++){
		newArray[count] = array[count] + 5;

}

	return newArray;


}

public static void main(String[] args){
	int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int[] result = increamentBy5(value);

	System.out.println(Arrays.toString(result));

}

}