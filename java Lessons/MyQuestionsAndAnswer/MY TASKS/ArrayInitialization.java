public class ArrayInitialization {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2},
                    {3, 4}
            };

            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
}


