package Exercise.Day14;

import java.util.Scanner;

public class SumOfDigits {
    public static int digitsSumCalculation(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return digitsSumCalculation(n/10) + n%10;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(digitsSumCalculation(number));
    }
}
