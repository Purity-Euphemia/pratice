import java.util.Scanner;

public class TrafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int red = 0;
       int yellow = 0;
       int green = 0;
       System.out.println("Enter a color: ");
       String color = input.nextLine();
       if (color.equalsIgnoreCase("red")) {
           System.out.println("Stop!!");
       }
       else if (color.equalsIgnoreCase("yellow")) {
           System.out.println("Wait!");
       }
       else if (color.equalsIgnoreCase("green")) {
           System.out.println("Go!");
       }
    }
}
