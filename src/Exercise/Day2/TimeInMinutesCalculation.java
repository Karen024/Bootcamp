package Exercise.Day2;

import java.util.Scanner;

public class TimeInMinutesCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int timeInMinutes = scn.nextInt();
        System.out.println(timeInMinutes + " minutes");
        int hours = timeInMinutes / 60;
        int minutes = timeInMinutes % 60;
        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}

