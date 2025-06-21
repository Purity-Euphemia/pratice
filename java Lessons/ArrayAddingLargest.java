import java.util.Arrays;
public class ArrayAddingLargest{

	public static double addArrayIn(double[] numbers) {
	
	double max = numbers[0];
	for(int count = 0; count < numbers.length; count++){
		if(numbers[count] > max){
		max = numbers[count];

	
}
	

}
	return max;
}



	public static void main(String[] args){

	double[] myList = {1.9, 2.9, 3.4, 3.5};
		

	System.out.print(ArrayAddingLargest.addArrayIn(myList));




}



















}