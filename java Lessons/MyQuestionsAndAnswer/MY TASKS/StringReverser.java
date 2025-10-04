public class StringReverser {
    public static String reverseString(String inputString) {
        return new StringBuilder(inputString).reverse().toString();
    }

    public static void main(String[] args) {
        String testString = "Programming";
        System.out.println("Reverse of '" + testString + "': " + reverseString(testString));
    }
}
