public class MultiplyTwoMatrices {
        public static void main(String[] args) {
            int[][] A = {
                    {1, 2},
                    {3, 4}
            };
            int[][] B = {
                    {2, 0},
                    {1, 2}
            };
            int[][] result = new int[2][2];

            for (int count = 0; count < 2; count++)
                for (int counter = 0; counter < 2; counter++)
                    for (int value = 0; value < 2; value++)
                        result[count][counter] += A[count][value] * B[value][counter];

            for (int[] row : result) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
    }


