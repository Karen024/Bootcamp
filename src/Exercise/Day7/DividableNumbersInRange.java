package Exercise.Day7;

import java.util.Scanner;

public class DividableNumbersInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rangeNumber1 = scn.nextInt();
        int rangeNumber2 = scn.nextInt();
        int dividableNumber = scn.nextInt();
        int reminderNumber = scn.nextInt();
        for (int i = rangeNumber1; i <= rangeNumber2; i++) {
            if (i % dividableNumber == reminderNumber)
            {
                System.out.print(i + " ");
            }
        }
    }
}
