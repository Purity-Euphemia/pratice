public class findLargestElement {
    public static int findLargest(int[] array) {
        int largest = array[0];
        for (int count = 0; count < array.length; count++) {
            if (array[count] > largest) {
                largest = array[count];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findLargest(value));
    }
}
