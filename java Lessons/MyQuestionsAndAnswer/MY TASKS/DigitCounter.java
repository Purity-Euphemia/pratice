public class DigitCounter {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static void main(String[] args) {
        int testNumber = 12345;
        System.out.println("Digits in " + testNumber + ": " + countDigits(testNumber));
    }
}
