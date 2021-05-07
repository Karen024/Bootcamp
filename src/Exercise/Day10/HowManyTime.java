package Exercise.Day10;

import java.util.Scanner;

public class HowManyTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int minutes = scn.nextInt();
        int hours = 0;
        int days = 0;
        hours = minutes / 60;
        minutes = minutes % 60;
        days = hours / 24;
        hours = hours % 24;
        if (days > 0) {
            System.out.println("Passed days: " + days + " hours: " + hours + " minutes: " + minutes);
        } else {
            System.out.println("Passed hours: " + hours + " minutes: " + minutes);

        }
    }
}
