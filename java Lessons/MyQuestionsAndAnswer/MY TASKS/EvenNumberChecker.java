public class EvenNumberChecker {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int testNumber = 42;
        System.out.println(testNumber + " is even? " + isEven(testNumber));
    }
}
