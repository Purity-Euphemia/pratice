public class findMin {
    public static int findMin(int[] arr) {

        int min = arr[0];
        for (int count = 0; count < arr.length; count++) {
            if (arr[count] < min) {
                min = arr[count];
            }
        }
        return min;

}
public static void main(String[] args) {
    int[] taskFour = {12, 5, 8, 3, 15, 1};
    int[] taskFive = {7, 14, 9, 2, 18, 6};

    int minTaskFour = findMin(taskFour);
    int minTaskFive = findMin(taskFive);

    System.out.println("Minimum number is " + minTaskFour);
    System.out.println("Minimum number is " + minTaskFive);

}
}


