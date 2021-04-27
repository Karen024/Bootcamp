package Exercise;

import java.util.Scanner;

public class OddNumberCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number for odd check");
        int number = scn.nextInt();
        boolean check = number % 2 == 0;
        System.out.println("Number odd check is " + check);
    }
}
