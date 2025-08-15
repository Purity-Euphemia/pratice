
import java.util.Arrays;

public class returnNewArrayAsZeroAndOne {
    public static int[] ReturnArray(int[] Array) {
        int[] newArray = new int[10];
        for (int count = 0; count < Array.length; count++) {
            if (Array[count] % 2 == 0) {
                newArray[count] = 1;
            } else {
                newArray[count] = 0;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(ReturnArray(values)));
    }


}
