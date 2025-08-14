public class swapOddNumberToEvenNumber {
    public static int[] swapOddEven(int[] arr) {
        for (int count = 0; count < arr.length - 1; count += 2) {
            int temp = arr[count];
            arr[count] = arr[count + 1];
            arr[count + 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arr = swapOddEven(arr);
        for (int count = 0; count < arr.length; count++) {
            System.out.println(arr[count]);
        }
    }
}
