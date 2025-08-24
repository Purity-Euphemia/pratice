public class OddNumber {
    public static int[] Odd(int[] array) {
            int count = 0;
       // for (int count = 0; count < array.length; count++) {
           // if (array[count] % 2 != 0) {
                //count++;
           // }
       // }

        int[] oddNumbers = new int[count];
        int index = 0;

            for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNumbers[index] = array[i];
                index++;
            }
        }

        return oddNumbers;
    }

    public static void main(String[] args) {
        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = Odd(value);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

