public class secondLargestElement{
	public static int secondLargest(int[] Array) {
	int largest = 0;
	int secondLargest = 0;

	for (int count = 0; count < Array.length; count++) {
		if (Array[count] > largest) {
		secondLargest = largest;
		largest = Array[count];

}
	else if (Array[count] > largest && Array[count] != largest) {
		secondLargest = Array[count];
		}
	}
		return secondLargest;

}

public static void main(String[] args){
	int[] value = {10, 38, 78, 90, 4, 57, 22, 100};
	System.out.print(secondLargest(value));

}

}