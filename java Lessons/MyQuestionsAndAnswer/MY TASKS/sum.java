public class sum{
	public static int sumNumber(int[] Array){
	int sum = 0;
	for(int count = 0; count < Array.length; count++){
	sum += Array[count];

}
	return sum;

}

public static void main(String[] args){
int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 10};
System.out.print(sumNumber(value));

}
	

}