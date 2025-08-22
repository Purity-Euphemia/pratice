import java.util.Arrays;

public class OddNumber3 {

    public static int[] getOddNumbers(int[] numbers) {
        int oddCount = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 != 0) {
                oddCount = count++;
            }
        }

        int[] oddNumbers = new int[oddCount];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
            if (numbers[count] % 2 != 0) {
                oddNumbers[counter] = numbers[count];
                counter++;
            }
        }

        return oddNumbers;
    }

    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = getOddNumbers(myNumbers);
        System.out.println(Arrays.toString(result));
    }
}
