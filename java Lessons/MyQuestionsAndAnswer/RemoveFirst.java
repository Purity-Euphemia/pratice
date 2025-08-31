import java.util.Arrays;
public class RemoveFirst {
	public static int[] removeFirst(int[] array){
	if (array.length == 0){
		return new int[0];
}

	int[] result = new int[array.length - 1];
	for (int count = 1; count < array.length; count++){
		result[count - 1] = array[count];
}
	return result;
}
	public static void main(String[] args){
		int[] original = {10,20,30,40};
		int[] updated = removeFirst(original);

		System.out.println(Arrays.toString(updated));

}

}