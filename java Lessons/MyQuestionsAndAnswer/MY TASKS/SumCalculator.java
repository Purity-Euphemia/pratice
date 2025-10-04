public class SumCalculator {
    public static int calculateSum(int[] numbers) {
        int totalSum = 0;
        for (int num : numbers) {
            totalSum += num;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 7, 1, 9, 4};
        System.out.println("Sum of array: " + calculateSum(testArray));
    }
}
