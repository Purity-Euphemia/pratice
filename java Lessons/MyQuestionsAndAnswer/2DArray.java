public class 2DArray{
	public static int[] Arrays(int[] Array1, int[] Array2){
	int[] result = new int[](Array1.length);
	for(int count = 0; count< Array1.length; count++){
		result[count] = Array1[count] + Array2[count];
}

	return result;

}

public static void main(String[] args){
int[] value1 = {1, 2, 3, 4};
int[] value2 = {5, 6, 7, 8};

int[] result = Arrays(value1, value2);

        System.out.print("Summed array: ");

        for (int val : result) {

            System.out.print(val + " ");
        }

}
}