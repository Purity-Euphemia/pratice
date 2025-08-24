public class even{
	public static void oddNumber(int[] Array){
	for (int count = 0; count < Array.length; count++){
		if(Array[count] % 2 != 0){
			System.out.print(Array[count] + " ");
		}
	}
}

public static void main(String[] args){
	int[] count = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	oddNumber(count);

	}

}