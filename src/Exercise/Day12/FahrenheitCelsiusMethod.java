package Exercise.Day12;

public class FahrenheitCelsiusMethod {
    public static void fahrenheitCelsius(float celsius, int choice) {
        System.out.println((int) (celsius * 1.8000) + 32);
    }

    public static void fahrenheitCelsius(float celsius, double choice) {
        System.out.println((celsius * 1.8000) + 32);
    }

    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        System.out.println((int) ((fahrenheit - 32) / 1.8000));
    }

    public static void main(String[] args) {
        float celsius = 25f;
        float fahrenheit = 58f;
        fahrenheitCelsius(celsius, 1);
        fahrenheitCelsius(celsius, 1.0);
        fahrenheitCelsius(1, fahrenheit);
    }
}
