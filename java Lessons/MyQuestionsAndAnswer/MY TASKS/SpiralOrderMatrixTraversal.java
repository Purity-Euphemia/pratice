public class SpiralOrderMatrixTraversal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int count = left; count <= right; count++) {
                System.out.print(matrix[top][count] + " ");
            }
            top++;


            for (int count = top; count <= bottom; count++) {
                System.out.print(matrix[count][right] + " ");
            }
            right--;


            if (top <= bottom) {
                for (int count = right; count >= left; count--) {
                    System.out.print(matrix[bottom][count] + " ");
                }
                bottom--;
            }


            if (left <= right) {
                for (int count = bottom; count >= top; count--) {
                    System.out.print(matrix[count][left] + " ");
                }
                left++;
            }
        }
    }
}
