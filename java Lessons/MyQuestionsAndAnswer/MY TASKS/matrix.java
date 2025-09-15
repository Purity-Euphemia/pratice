public class matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int count = 0; count < matrix.length; count++) {
            for (int counter = 0; counter < matrix[count].length; counter++) {
                System.out.println(matrix[count][counter] + " ");
            }
            System.out.println();
        }

    }
}
