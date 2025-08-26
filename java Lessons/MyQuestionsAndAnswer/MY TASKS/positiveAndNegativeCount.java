public class positiveAndNegativeCount{
	public static void positiveAndNegative(int[] Array){
	int positive = 0;
	int negative = 0;

	for(int count = 0; count < Array.length; count++){
		if(Array[count] > 0){
			positive++;
		
}	else if (Array[count] < 0) {
			negative++;
		

}
	

}
	System.out.println("Positive numbers: " + positive);
	System.out.println("Negative numbers: " + negative);


}

	public static void main(String[] args) {
	int[] value = {3, -2, 0, 5, -1, 7, -6, 0};
	positiveAndNegative(value);


}
	
}