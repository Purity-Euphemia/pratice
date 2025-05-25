public class PalindromNumberSecondFunction{
	public static Boolean isPalindrome(int num) {

	int originalNum = num;
	int reversedNum = 0;

	while(num > 0){
	int number = num % 10;
	reversedNum = reversedNum + 10 + number;
	num = num / 10;

}
	return originalNum == reversedNum;


}

}