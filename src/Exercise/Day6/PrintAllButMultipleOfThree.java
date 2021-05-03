package Exercise.Day6;

import java.util.Scanner;

public class PrintAllButMultipleOfThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int current = 1;
        while (current <= number) {
            if (current % 3 != 0) {
                System.out.print(current + " ");
            } else {
                current++;
                continue;
            }
            current++;
        }
    }
}
