package Exercise;

import java.util.Random;

public class RandomIntegerTillBound {
    public static void main(String[] args) {
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(15);
        System.out.println("Integer random number = " + randomNumber);
    }
}
