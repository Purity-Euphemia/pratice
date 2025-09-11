public class MatrixDemo {
    public static void main(String[] args) {
        int rows = 10, cols = 10;
        int[][] matrix = new int[rows][cols];

        // Fill the matrix
        for (int count = 0; count < rows; count++) {
            for (int counter = 0; counter < cols; counter++) {
                matrix[count][counter] = count * counter;
            }
        }

        // Print the matrix
        for (int count = 0; count < rows; count++) {
            for (int counter = 0; counter < cols; counter++) {
                System.out.print(matrix[count][counter] + "\t");
            }
            System.out.println();
        }
    }
}


