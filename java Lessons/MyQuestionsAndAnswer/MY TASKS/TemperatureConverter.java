public class TemperatureConverter {
    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        double celsius = 100;
        System.out.println(celsius + "°C in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
    }
}
