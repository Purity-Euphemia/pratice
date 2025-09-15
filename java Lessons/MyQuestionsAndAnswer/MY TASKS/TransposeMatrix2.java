public class TransposeMatrix2 {
        public static void main(String[] args) {
            int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
            int n = matrix.length;
            int m = matrix[0].length;
            int[][] transpose = new int[m][n];
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    transpose[col][row] = matrix[row][col];
                }
            }
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    System.out.print(transpose[row][col] + " ");
                }
            }
        }
    }


