import java.util.Arrays;
public class ArrayIndexOfTheLargestRowAndColumn{

	public static String addArrayIn(double[][] numbers) {
	
	double max = numbers[0][0];
	int rowIndex = 0;
	int colIndex = 0;
	for(int count = 0; count < numbers.length; count++){
		for(int counter = 0; counter < numbers[count].length; counter++){
		if(numbers[count][counter] > max){
		max = numbers[count][counter];
		rowIndex = count;
		colIndex = counter;

	
}
	
}
}
	return "Largest number is " + max + " at row " + rowIndex + " column " + colIndex;
}



	public static void main(String[] args){

	double[][] myList = {{1.9, 2.9, 3.4, 3.5,}, {1.6, 4.5, 2.7}, {5.6, 3.4, 2.1, 8.9}};
		

	System.out.print(ArrayIndexOfTheLargestRowAndColumn.addArrayIn(myList));




}



















}