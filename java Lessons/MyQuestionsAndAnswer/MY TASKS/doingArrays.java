import java.util.Arrays;
public class doingArrays {
	public static void main(String[] args) {


	//int[][] arr = new int[3][3];

	int[][] arr = {{4, 6}, {3, 5}, {8, 6}};

	int sum = 0;
	for(int row = 0; row < arr.length; row++) {
		for(int column = 0; column < arr[row].length; column++) {
	sum += arr[row][column];
}
}
	System.out.println(sum);
	


}

}