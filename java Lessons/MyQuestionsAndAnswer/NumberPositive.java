import java.util.Arrays;
public class NumberPositive{
	public static int[] positiveNumber(int[] array){

	int[] newArray = new int[array.length];

	for(int count = 1; count < array.length; count++){

		if (array[count] < 0) {
			newArray[count] = -array[count];
}		else{
			newArray[count] = array[count];

}
}

	return newArray;


}


public static void main(String[] args){
	int[] value = {1, -2, 4, 6, -0, -7};

	int[] result = positiveNumber(value);

	System.out.println(Arrays.toString(result));

}
}