package Exercise.Day7;

import java.util.Scanner;

public class SumOfTenNaturals {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int currentSum = 0;
        for (int i = 0; i <= 9; i++) {
            currentSum = currentSum + scn.nextInt();
        }
        System.out.println(currentSum);
    }
}
