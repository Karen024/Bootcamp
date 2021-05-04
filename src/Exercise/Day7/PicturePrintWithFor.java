package Exercise.Day7;

import java.util.Scanner;

public class PicturePrintWithFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
