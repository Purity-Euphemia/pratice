public class isPrimeFunction {
    public static boolean isPrime(int numberToCheck) {
        if (numberToCheck <= 1) return false;
        for (int count = 2; count <= Math.sqrt(numberToCheck); count++) {
            if (numberToCheck % count == 0) return false;
        }
        return true;
    }
    public static int countVowels(String inputString) {
        int vowelCount = 0;
        for (char c : inputString.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowelCount++;
        }
        return vowelCount;
    }
    public static void main(String[] args) {
        int testNumber = 29;
        String testString = "Programming";

        System.out.println(testNumber + " is prime? " + isPrime(testNumber));
        System.out.println("Vowels in '" + testString + "': " + countVowels(testString));
    }

}
