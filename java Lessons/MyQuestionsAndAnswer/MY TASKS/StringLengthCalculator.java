public class StringLengthCalculator {
    public static int getLength(String input) {
        return input.length();
    }

    public static void main(String[] args) {
        String input = "Hello, Java!";
        System.out.println("Length: " + getLength(input));
    }
}
