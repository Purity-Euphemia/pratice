public class PowerCalculator {
    public static double raiseToPower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 5;
        System.out.println(base + " raised to " + exponent + " = " + raiseToPower(base, exponent));
    }
}
