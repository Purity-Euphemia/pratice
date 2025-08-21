import java.util.Arrays;
public class ReturnZero{
	public static int[] zeroAndOne(int[] array) {
	int[] newArray = new int[array.length];

	for(int count = 0; count < array.length; count++) {
	if(array[count] % 2 == 0){
		newArray[count] = 1;
}
else {
	newArray[count] = 0;
}
	

} 
	return newArray;


}

public static void main(String[] args) {
int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	System.out.print(Arrays.toString(zeroAndOne(value)));

}

}