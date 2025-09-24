import java.util.Arrays;
public class SortRowInAscendingOrder {
        public static void main(String[] args) {
            int[][] matrix = {
                    {3, 2, 1},
                    {9, 7, 8}
            };

            for (int[] row : matrix)
                Arrays.sort(row);

            for (int[] row : matrix) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
    }


