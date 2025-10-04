public class MaximumFinder {
    public static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new IllegalArgumentException("Array must not be empty");
        int maxValue = numbers[0];
        for (int num : numbers) {
            if (num > maxValue) maxValue = num;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 7, 1, 9, 4};
        System.out.println("Max in array: " + findMaximum(testArray));
    }
}

