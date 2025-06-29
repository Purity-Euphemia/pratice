import java.util.Arrays;
public class SquareAndSort{
	public static void main(String[] args){

	int[] numbers = {-4, -1, 0, 3, 10};
	int[] result = squareAndSort(numbers);

	for(int count = 0; count < result.length; count++){
	System.out.print(result[count] + " ");

}

}


	public static int[] squareAndSort(int[] array){
		int[] squared = new int[array.length];

		for(int count = 0; count < array.length; count++){
			squared[count] = array[count] * array[count];


}

		Arrays.sort(squared);
		
		return squared;




}
}