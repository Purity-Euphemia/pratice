import java.util.Arrays;
public class addArray{
	public static int[] AddElement(int[] Array1, int[] Array2){
	int[] newArray = new int[Array1.length + Array2.length];

	for (int count = 0; count < Array1.length; count++){
		newArray[count] = Array1[count];
	}

	for(int count = 0; count < Array2.length; count++){
		newArray[count + Array1.length] = Array2[count];
}
	return newArray;
}


public static void main(String[] args){
	int[] value1 = {1,2,3,4};
	int[] value2 = {10,9};
	int[] sum = AddElement(value1, value2);

	System.out.println(Arrays.toString(sum));
}


}