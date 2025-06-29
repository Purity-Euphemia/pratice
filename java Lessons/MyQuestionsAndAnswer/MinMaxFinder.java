public class MinMaxFinder{

	public static void main(String[] args){
	int[] numbers = {4, 7, 1, 9, -2, 5};
	int[] result = findMinMax(numbers);

	System.out.println("The smallest number: " + result[0]);
	System.out.println("The Largest number: " + result[1]);

}
	public static int[] findMinMax(int[] array) {
		
		int min = array[0];
		int max = array[0];


		for(int count = 1; count < array.length; count++){
			if(array[count] < min) {
			min = array[count];

}

			if(array[count] > max) {
				max = array[count];


}

}

		return new int[]{min, max};


}
}