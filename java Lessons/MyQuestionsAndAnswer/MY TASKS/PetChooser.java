import java.util.Scanner;

public class PetChooser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your pet name: ");
        String petName = input.nextLine();

        if (petName.equalsIgnoreCase("dog")) {
            System.out.println("Woof!Dogs are awesome!");
        }
        else {
            System.out.println("Cool choice, but I love dogs!");
        }
    }
}
