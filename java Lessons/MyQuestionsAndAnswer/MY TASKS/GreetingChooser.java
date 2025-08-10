import java.util.Scanner;

public class GreetingChooser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        if (name.equalsIgnoreCase("Alex")) {
            System.out.println("Hello Friend!");
        }
        else {
            System.out.println("Hello stranger!");
        }

    }
}
