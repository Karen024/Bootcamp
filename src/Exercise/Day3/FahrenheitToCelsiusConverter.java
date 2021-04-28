package Exercise.Day3;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double fahrenheitTemperature = scn.nextDouble();
        double convertedFromFahrenheitCelsiusTemperature = (fahrenheitTemperature - 32) / 1.8000;
        System.out.println("Fahrenheit temperature = " + fahrenheitTemperature + " , celsius temperature = " + convertedFromFahrenheitCelsiusTemperature);
        float floatTypeCelsius = (float) convertedFromFahrenheitCelsiusTemperature;
        int intTypeCelsius = (int) floatTypeCelsius;
        System.out.println("Float type answer = " + floatTypeCelsius);
        System.out.println("Int type answer = " + intTypeCelsius);
    }
}
