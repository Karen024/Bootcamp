package Exercise.Day6;

import java.util.Scanner;

public class SecondLargestInSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber = scn.nextInt();
        int firstLargest = firstNumber;
        int secondLargest = 0;
        while (true) {
            firstNumber = scn.nextInt();
            if (firstNumber == 0) {
                break;
            } else if (firstLargest <= firstNumber) {
                secondLargest = firstLargest;
                firstLargest = firstNumber;
            } else {
                if (secondLargest <= firstNumber) {
                    secondLargest = firstNumber;
                }
            }
        }
        System.out.println(secondLargest);
    }
}
