import java.util.Arrays;
public class removeArray{
	public static int[] RemoveArray(int[] Array){
	int[] result = new int[Array.length -1];

	for(int count = 1; count < Array.length; count++){
		result[count - 1] =  Array[count];

}

	return result;

}

public static void main(String[] args){
	int[] value = {10, 20 ,30, 40};
	int[] remove = RemoveArray(value);

	System.out.println(Arrays.toString(remove)); 

}


}