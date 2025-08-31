import java.util.Arrays;
public class newArray{
	public static int[] newElement(int[] Array1, int[] Array2){
	int[] result = new int[Array1.length + Array2.length];

	for(int count = 0; count < Array1.length; count++){
		result[count] = Array1[count]; 
}
	for(int count = 0; count < Array2.length; count++){
		result[count + Array1.length] = Array2[count];
}
	return result;

} 


public static void main(String[] args){
	int[] value1 = {1, 2, 4, 5};
	int[] value2 = {6, 7, 8, 9};

	int[] sum = newElement(value1, value2);
	
	
	System.out.println(Arrays.toString(sum));

}
}