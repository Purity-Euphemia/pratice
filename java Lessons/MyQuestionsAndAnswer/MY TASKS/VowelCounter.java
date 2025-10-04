public class VowelCounter {
    public static int countVowels(String inputString) {
        int vowelCount = 0;
        String vowels = "aeiou";
        for (char character : inputString.toLowerCase().toCharArray()) {
            if (vowels.indexOf(character) != -1) vowelCount++;
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        String testString = "Programming";
        System.out.println("Vowels in '" + testString + "': " + countVowels(testString));
    }
}
