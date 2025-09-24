public class ReplaceEvenNumbersWith0 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {2, 3, 4},
                    {5, 6, 7}
            };

            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    if (matrix[i][j] % 2 == 0)
                        matrix[i][j] = 0;

            for (int[] row : matrix) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
    }


