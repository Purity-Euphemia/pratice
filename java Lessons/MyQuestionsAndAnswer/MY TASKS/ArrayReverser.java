import java.util.Arrays;
public class ArrayReverser {
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int count = 0; count < array.length; count++) {
            reversed[count] = array[array.length - 1 - count];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = reverseArray(original);
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
}
