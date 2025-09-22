import java.util.Random;
public class RandomNumber2DArray {
        public static void main(String[] args) {
            Random rand = new Random();
            int[][] matrix = new int[4][4];

            for (int i = 0; i < 4; i++)
                for (int j = 0; j < 4; j++)
                    matrix[i][j] = rand.nextInt(100); // 0–99

            for (int[] row : matrix) {
                for (int val : row)
                    System.out.print(val + "\t");
                System.out.println();
            }
        }
    }


