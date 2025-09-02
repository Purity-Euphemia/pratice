public class increaseNumber{
	public static int increaseBy5(int[] array){

	int counter = 0;

	for(int count = 0; count < array.length; count++){
		counter += array[count] + 5;

}

	return counter;
		

}

public static void main(String[] args){
	int[] value = {7};

	int result = increaseBy5(value);

	System.out.println(result);


}

}