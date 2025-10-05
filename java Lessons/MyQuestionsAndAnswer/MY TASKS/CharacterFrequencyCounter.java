public class CharacterFrequencyCounter {
    public static int countCharacter(String input, char targetChar) {
        int count = 0;
        for (char value : input.toCharArray()) {
            if (value == targetChar) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "banana";
        char target = 'a';
        System.out.println("Occurrences of '" + target + "': " + countCharacter(input, target));
    }
}
