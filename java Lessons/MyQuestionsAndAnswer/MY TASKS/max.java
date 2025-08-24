public class max{
	public static int maxNumber(int[] Array){
	int max = 0;
	for (int count = 0; count < Array.length; count++){
		if(Array[count] > max) {
			max = Array[count];

}

}
	return max;
	


}

public static void main(String[] args) {
int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
System.out.print(maxNumber(value));


}
}