package Exercise.Day2;

import java.util.Random;

public class RandomIntegerInInterval {
    public static void main(String[] args) {
        Random rnd = new Random();

        int randomNumber = rnd.nextInt(16) + 15;
        System.out.println("Integer random number = " + randomNumber);
    }
}
