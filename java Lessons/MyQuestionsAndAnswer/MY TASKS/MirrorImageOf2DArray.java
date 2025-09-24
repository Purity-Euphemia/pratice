public class MirrorImageOf2DArray {
    public static void main(String[] args) {
     int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        for (int[] row : matrix) {
            for (int i = row.length - 1; i >= 0; i--)
                System.out.print(row[i] + " ");
            System.out.println();
        }
    }
}
