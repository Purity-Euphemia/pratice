public class SquareRootCalculator {
    public static double calculateSquareRoot(double number) {
        if (number < 0) throw new IllegalArgumentException("Cannot compute square root of negative number.");
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        double number = 49;
        System.out.println("Square root of " + number + " = " + calculateSquareRoot(number));
    }
}
