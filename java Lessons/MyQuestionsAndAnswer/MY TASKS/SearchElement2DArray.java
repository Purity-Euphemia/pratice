public class SearchElement2DArray {
        public static void main(String[] args) {
            int[][] matrix = {
                    {7, 8, 9},
                    {1, 2, 3}
            };
            int target = 2;
            boolean found = false;

            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    if (matrix[i][j] == target) {
                        System.out.println("Found at [" + i + "][" + j + "]");
                        found = true;
                    }

            if (!found)
                System.out.println("Not found");
        }
    }


