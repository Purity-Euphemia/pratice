public class sumEvenFunction{
	public static int evenNumber(int[] Array){
	int[] even = new int[Array.length];
	int index = 0;
	int sum = 0;

	for (int count = 0; count < Array.length; count++){
		if(Array[count] % 2 != 0){
		even[index] = Array[count];
		sum += even[index];

	}

}
	return sum;

}

	public static void main(String[] args){
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(evenNumber(numbers));


	}

}