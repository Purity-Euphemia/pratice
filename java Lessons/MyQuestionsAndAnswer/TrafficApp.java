import java.util.Scanner;

public class TrafficApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter traffic light color (red, yellow, green): ");
        String color = scanner.nextLine().toLowerCase();

        switch (color) {
            case "red":
                System.out.println("STOP! The light is RED.");
                break;
            case "yellow":
                System.out.println("READY! The light is YELLOW.");
                break;
            case "green":
                System.out.println("GO! The light is GREEN.");
                break;
            default:
                System.out.println("Invalid color entered. Please enter red, yellow, or green.");
        }

           }
}
