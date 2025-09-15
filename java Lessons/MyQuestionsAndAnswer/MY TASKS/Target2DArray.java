public class Target2DArray {
    public static void main(String[] args) {
        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int target = 6;
        boolean found = false;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    System.out.println("Found at row " + row + " and column " + col);
                    found = true;
                    break;
                }
            }
        }
    }
}
