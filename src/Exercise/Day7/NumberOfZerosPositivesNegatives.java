package Exercise.Day7;

import java.util.Scanner;

public class NumberOfZerosPositivesNegatives {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberN = scn.nextInt();
        int numberOfZeros = 0;
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int currentNumber = 0;
        for (int i = 1; i <= numberN; i++) {
            currentNumber = scn.nextInt();
            if (currentNumber < 0) {
                numberOfNegatives++;
            } else if (currentNumber == 0) {
                numberOfZeros++;
            } else {
                numberOfPositives++;
            }
        }
        System.out.println("Number of zeros = " + numberOfZeros);
        System.out.println("Number of positives = " + numberOfPositives);
        System.out.println("Number of negatives = " + numberOfNegatives);
    }
}
