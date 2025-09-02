import java.util.Arrays;
public class countEven{
	public static int evenCount(int[] array){
	
	int even = 0;

	for(int count = 0; count < array.length; count++){

	if(array[count] % 2 == 0){
		even++;
}
}
	return even;
	

}

public static void main(String[] args){
	int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int result = evenCount(value);

	System.out.println(result);

}
}