public class ArrayHighestAndSecondHighestFunction{
public static int ArrayHighestAndSecondHighest(int[]number){
	int highest = number[0];
	int highestSecond = number[0];

	
	for (int counter = 0; counter < number.length; counter++) {
		if (number[counter] > highest) {
		highestSecond = highest;
		highest = number[counter];

}
		if(number[counter] != highest) {
		highestSecond = number[counter];
}	
}
		return highestSecond;
	
}
}