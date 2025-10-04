public class PalindromeChecker {
    public static boolean isPalindrome(String inputString) {
        String cleanedString = inputString.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equals(reversedString);
    }

    public static void main(String[] args) {
        String testString = "Racecar";
        System.out.println("'" + testString + "' is palindrome? " + isPalindrome(testString));
    }
}
