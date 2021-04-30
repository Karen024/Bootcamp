package Exercise.Day5;

import java.util.Scanner;

public class MaxOfTwoIntegers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        System.out.println(number1 > number2 ? "Number 1 is greater than number 2" : "Number 2 is greater than number 1");
        System.out.println(number1 > 0 ? ("Abs of number 1 = " + number1) : number1 < 0 ? ("Abs of number 1 = " + (-number1)) : ("Abs of number 1 = " + 0));
    }
}
