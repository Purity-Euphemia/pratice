public class ArrayAverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) return 0;
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return (double) total / numbers.length;
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40};
        System.out.println("Average: " + calculateAverage(values));
    }
}
