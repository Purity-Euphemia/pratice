public class SquareAndSortAsecending{
	public static void main(String[] args) {

	int[] numbers = {-3, 1, -2, 4, 0};
	int result = numbers.length;

	for(int count = 0; count < result; count++) {
		numbers[count] = numbers[count] * numbers[count];

}
	for(int count = 0; count < result; count++) {
		for(int counter = 0; counter < result - 1; counter++) {
			if(numbers[counter] > numbers[counter + 1]) {



			int temp = numbers[counter];
			numbers[counter] = numbers[counter + 1];
			numbers[counter + 1] = temp;
}
}
}

	System.out.print("The squared and sorted numbers: ");
		for(int count = 0; count < result; count++){
		System.out.print(numbers[count] + " ");




}
}
}