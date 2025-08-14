import java.util.Scanner;

public class ToWord {
        public static String numberToWords(int num) {
            String[] ones = {
                    "", "one", "two", "three", "four", "five", "six",
                    "seven", "eight", "nine", "ten", "eleven", "twelve",
                    "thirteen", "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen"
            };

            String[] tens = {
                    "", "", "twenty", "thirty", "forty", "fifty",
                    "sixty", "seventy", "eighty", "ninety"
            };

            if (num == 100) {
                return "one hundred";
            } else if (num < 20) {
                return ones[num];
            } else {
                int t = num / 10;
                int o = num % 10;
                return tens[t] + (o != 0 ? "-" + ones[o] : "");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number from 1 to 100: ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= 1 && num <= 100) {
                    System.out.println("In words: " + numberToWords(num));
                } else {
                    System.out.println("Please enter a number between 1 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
            }

        }
    }


