public class IdentifyMatrix {
        public static void main(String[] args) {
            int size = 5;
            int[][] identity = new int[size][size];

            for (int i = 0; i < size; i++)
                identity[i][i] = 1;

            for (int[] row : identity) {
                for (int val : row)
                    System.out.print(val + " ");
                System.out.println();
            }
        }
    }


