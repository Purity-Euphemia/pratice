public class MultiplicationTableGenerator {
    public static void printMultiplicationTable(int number, int limit) {
        for (int count = 1; count <= limit; count++) {
            System.out.println(number + " x " + count + " = " + (number * count));
        }
    }

    public static void main(String[] args) {
        int number = 7;
        int limit = 10;
        printMultiplicationTable(number, limit);
    }
}
