public class FindTheSumOfArray {
    public static int findSum(int[] array) {
        int sum = 0;
        for (int count = 0; count < array.length; count++) {
            sum += array[count];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] value = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(findSum(value));
    }
}
