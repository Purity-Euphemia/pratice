public class SquareDecending{
	public static void SquareElements(int[] array) {

	for(int count = 0; count < array.length; count++){
		array[count] = array[count] * array[count];


}
}	

	public static void SortArray(int[] array) {
	for(int count = 0; count < array.length - 1; count++) {
		for(int counter = 0; counter < array.length - count - 1; counter++){

			if(array[counter] > array[counter + 1]){
				int temp = array[counter];
				array[counter] = array[counter + 1];
				array[counter + 1] = temp;


}
}

}

}

	public static void main(String[] args){
		int[] numbers = {-4, -1, 0, 3, 10};

		squareElements(numbers);

		sortArray(numbers);



		System.out.println("Squares in ascending");
			
		for (int num : numbers){
			System.out.println(num + " ");



}




}




}


