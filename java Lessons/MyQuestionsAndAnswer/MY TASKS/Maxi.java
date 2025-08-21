public class Maxi{
	public static int findMaxi(int[] array) {
	int max = array[0];
	
	for (int count = 1; count < array.length; count++) {
		if(array[count] > max){
		max = array[count];
}
				
}

	return max;

}


public static void main(String[] args) {
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

System.out.print(findMaxi(array));



}


}