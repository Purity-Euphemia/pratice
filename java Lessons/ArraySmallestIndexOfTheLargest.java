import java.util.Arrays;
public class ArraySmallestIndexOfTheLargest{

	public static double addArrayIn(double[] numbers) {
	
	double max = numbers[0];
	int indexOfMax = 0;
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > max){
		max = numbers[count];
		indexOfMax = count;

	
}
	

}
	return indexOfMax;
}



	public static void main(String[] args){

	double[] myList = {1.9, 2.9, 3.4, 3.5, 8.9};
		

	System.out.print(ArraySmallestIndexOfTheLargest.addArrayIn(myList));




}



















}