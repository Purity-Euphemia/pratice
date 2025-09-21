public class matrixFilledWithNumbers {
        public static void main(String[] args) {
            int[][] matrix = new int[10][10];
            int val = 1;

            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++)
                    matrix[i][j] = val++;

            for (int[] row : matrix) {
                for (int num : row)
                    System.out.printf("%4d", num);
                System.out.println();
            }
        }

}
