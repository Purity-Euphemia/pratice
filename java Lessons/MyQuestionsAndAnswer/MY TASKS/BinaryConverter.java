public class BinaryConverter {
    public static int convertBinaryToDecimal(String binaryString) {
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        String binaryString = "10101";
        System.out.println("Binary '" + binaryString + "' to decimal: " + convertBinaryToDecimal(binaryString));
    }
}
