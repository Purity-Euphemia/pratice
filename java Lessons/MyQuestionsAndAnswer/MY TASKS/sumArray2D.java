public class sumArray2D {
        public static void main(String[] args) {
            int[][] matrix = {
                    {5, 2, 3},
                    {1, 6, 4}
            };
            int sum = 0;

            for (int[] row : matrix)
                for (int val : row)
                    sum += val;

            System.out.println("Sum = " + sum);
        }

}
