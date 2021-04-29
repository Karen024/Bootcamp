package OptionalClasswork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int saturation;
        Scanner scn = new Scanner(System.in);
        saturation = scn.nextInt();

        if (saturation >= 98 && saturation < 100) {
            System.out.println("Hrashali e");
        } else if (saturation >= 70 && saturation < 98) {
            System.out.println("Lav e ");
        } else if (saturation >= 50 && saturation < 70) {
            System.out.println("normal e");
        } else if (saturation >= 30 && saturation < 50) {
            System.out.println("vat e");
        } else if (saturation > 0 && saturation < 30) {
            System.out.println("ahavor e");
        } else if (saturation == 0) {
            System.out.println("Merac es bro");
        } else {
            System.out.println("Wrong input (impossible)");
        }

    }
}
