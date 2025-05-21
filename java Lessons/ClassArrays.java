import java.util.Arrays;



public class ClassArrays{
public static void main(String[] args) {

	int maxiNumbers = -234565677;
	int minNumbers = 234567887;
 	int[] numbers = {8, 0, 1, 4, 9, 2};
	int[] array = new int[numbers.length];
	int ArraySumTotal = 0;

for(int count = 0; count < numbers.length; count++){
	int sum = 0;

	for(int counter = 0; counter < numbers.length; counter++){
		if(count !=  counter){
			sum = sum + numbers[counter];	
		}

	}
	array[ArraySumTotal] = sum;
	ArraySumTotal++;
	
	
}	
		
	
			
			
	for(int value = 0; value < array.length; value++){
		if(maxiNumbers < array[value]) maxiNumbers = array[value];

		if(minNumbers > array[value]) minNumbers = array[value];
			
	}

int [] maxMin = new int [2];
maxMin[0] = maxiNumbers;
maxMin[1] = minNumbers;



	
	
System.out.print(Arrays.toString(maxMin));		
	







}
}





