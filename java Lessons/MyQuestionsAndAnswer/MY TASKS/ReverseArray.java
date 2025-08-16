import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        for (int count = 0; count < array.length; count++) {
            result[count] = array[array.length - count - 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reverseArray(array)));
    }
}
