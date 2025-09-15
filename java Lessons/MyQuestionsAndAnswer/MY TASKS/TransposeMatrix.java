public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                transposedMatrix[col][row] = matrix[row][col];
            }
        }

        for (int row = 0; row < transposedMatrix.length; row++) {
            for (int col = 0; col < transposedMatrix[row].length; col++) {
                System.out.print(transposedMatrix[row][col] + " ");
            }
        }
    }
}
