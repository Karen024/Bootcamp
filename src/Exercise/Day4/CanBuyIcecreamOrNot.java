package Exercise.Day4;

import java.util.Scanner;

public class CanBuyIcecreamOrNot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int kBallsOfIcecream = scn.nextInt();
        if (kBallsOfIcecream % 5 == 0) {
            System.out.println("Yes you can");
        } else if (kBallsOfIcecream % 3 == 0) {
            System.out.println("Yes you can");
        } else if (kBallsOfIcecream % 8 == 0) {
            System.out.println("Yes you can");
        } else {
            int remain = kBallsOfIcecream % 8;
            if (remain % 5 == 0 || remain % 3 == 0) {
                System.out.println("Yes");
            } else {
                kBallsOfIcecream = kBallsOfIcecream - 8 * remain;
                if (kBallsOfIcecream % 5 == 0 || kBallsOfIcecream % 3 == 0) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
