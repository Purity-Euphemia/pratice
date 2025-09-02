import java.util.Arrays;

public class ReplaceSecond {
    public static void main(String[] args) {
        int[] array = {42}; 
        if (array.length >= 2) {
            array[1] = 99;  
        } else {
            System.out.println("Array does not have a second element.");
        }

        System.out.println(Arrays.toString(array));
    }
}
