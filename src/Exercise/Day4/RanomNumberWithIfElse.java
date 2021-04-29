package Exercise.Day4;

import java.util.Random;

public class RanomNumberWithIfElse {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randNumber = rnd.nextInt();
        if (randNumber < 2 || randNumber > 7) {
            int remain = randNumber % 8;
            if (remain < 2) {
                System.out.println(remain + 2);
            } else {
                System.out.println(remain);
            }
        } else {
            System.out.println(randNumber);
        }
    }
}
