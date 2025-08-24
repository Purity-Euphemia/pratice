public class min{
	public static int minNumber(int[] Array){
	int min = Array[0];
	for(int count = 0; count < Array.length; count++){
		if(Array[count] < min){
			min = Array[count];

}


}
	return min;



}

public static void main(String[] args){
int[] value = {11, 43, 5, 12, 4, 3, 9, 10};
System.out.print(minNumber(value));


}
}