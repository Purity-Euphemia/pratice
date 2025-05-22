public class ArrayHighestAndSecondHighestFunction{
public static int ArrayHighestAndSecondHighest(int[]number){
	int highest = count[0];
	int highestSecond = count[0];

	for (int counter = 0; counter < count.length; counter++) {
		if (count[counter] > highest) {
		highestSecond = highest;
		highest = count[counter];
}
		if(count[counter] != highest) {
		highestSecond = count[counter];
	
}
		return highestSecond;
	
}
}