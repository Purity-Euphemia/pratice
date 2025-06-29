import java.util.Arrays;

public class DecendingSort{
	public static void main(String[] args) {
	int[] array = {5, 3, 8, 1, 2};

	for(int count = 0; count < array.length - 1; count++) {
	int smallest = array[count];
	int smallestIndex = count;

	for (int counter = count + 1; array[count].length; counter++) {
	if (smallest > array[counter]) {
	smallest = array[counter];
	smallestIndex = counter;
}
}
	if (smallestIndex != count){
	array[smallestIndex] = array[count];
	array[count] = smallest;
}
}

	System.out.println(array);
}
}