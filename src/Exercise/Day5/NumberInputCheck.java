package Exercise.Day5;

import java.util.Scanner;

public class NumberInputCheck {
    public static void main(String[] args) {
        int i = 0;
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        switch (number) {
            case 0:
                System.out.println("you pressed 0 button");
                break;
            case 1:
                System.out.println("you pressed 1 button");
                break;
            case 2:
                System.out.println("you pressed 2 button");
                break;
            case 3:
                System.out.println("you pressed 3 button");
                break;
            case 4:
                System.out.println("you pressed 4 button");
                break;
            case 5:
                System.out.println("you pressed 5 button");
                break;
            case 6:
                System.out.println("you pressed 6 button");
                break;
            case 7:
                System.out.println("you pressed 7 button");
                break;
            case 8:
                System.out.println("you pressed 8 button");
                break;
            case 9:
                System.out.println("you pressed 9 button");
                break;
            default:
                System.out.println("Not allowed");
        }
    }
}
