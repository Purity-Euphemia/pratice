import java.util.Arrays;
public class replaceArray{
	public static int[] ReplaceArray(int[] Array, int newValue){
	
		if(Array.length >= 2) {
			Array[1] = newValue;
}
	else{	
		System.out.println("Array does not have a second element");
		
}
	return Array;
}

public static void main(String[] args){
	int[] myArray = {5,10,15,20};
	int[] updatedArray = ReplaceArray(myArray, 90);

	System.out.println(Arrays.toString(updatedArray));


}

}