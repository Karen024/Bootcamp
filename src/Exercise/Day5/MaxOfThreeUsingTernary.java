package Exercise.Day5;

import java.util.Scanner;

public class MaxOfThreeUsingTernary {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();
        System.out.println(number1>=number2 ? (number1>=number3 ? number1 : number3) : number2>=number3 ? number2 : number3);
    }
}
