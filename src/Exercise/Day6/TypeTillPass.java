package Exercise.Day6;

import java.util.Scanner;

public class TypeTillPass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number;
        int integerCount = 0;
        boolean yesOrNo = true;
        while (yesOrNo) {
            number = scn.nextDouble();
            double numberCopy = number;
            integerCount++;
            while (numberCopy % 2 == 0) {
                numberCopy = numberCopy / 2;
            }
            if (numberCopy == 1) {
                System.out.println(number + " and count of inputs is = " + integerCount);
                yesOrNo = false;
            } else {
                System.out.println("Please enter another number");
            }
        }
    }
}
