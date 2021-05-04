package Exercise.Day7;

import java.util.Scanner;

public class GNCHE1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int seconds = scn.nextInt();
        int countTotal = 0;
        int countCurrent;
        for (int i = 1; i <= seconds; i++) {
            countCurrent = i;
            for (int j = countCurrent; j != 0; j--) {
                if (countTotal >= seconds) {
                    break;
                } else {
                    System.out.print(i + " ");
                    countTotal++;
                }
            }
        }
    }
}
