package Exercise.Day6;

import java.util.Scanner;

public class SecondLargestInSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstNumber = scn.nextInt();
        int firstLargest = firstNumber;
        int secondLargest = 0;
        int count = 0;
        while (true) {
            firstNumber = scn.nextInt();
            count++;
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
        if (count == 1) {
            System.out.println("No second largest");
        } else {
            System.out.println(secondLargest);
        }
    }
}
