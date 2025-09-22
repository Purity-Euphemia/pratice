public class FindMaxElement2DArray {
        public static void main(String[] args) {
            int[][] matrix = {
                    {12, 4, 5},
                    {7, 19, 2}
            };
            int max = Integer.MIN_VALUE;

            for (int[] row : matrix)
                for (int val : row)
                    if (val > max)
                        max = val;

            System.out.println("Max = " + max);
        }
    }


