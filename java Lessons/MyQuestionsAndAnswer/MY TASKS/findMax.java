public class findMax {
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int count = 0; count < arr.length; count++) {
            if (arr[count] > max) {
                max = arr[count];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] taskFour = {12, 5, 8, 3, 15, 1};
        int[] taskFive = {7, 14, 9, 2, 18, 6};

        int maxTaskFour = findMaximum(taskFour);
        int maxTaskFive = findMaximum(taskFive);

        System.out.println("Minimum number is " + maxTaskFour);
        System.out.println("Minimum number is " + maxTaskFour);

    }
}
