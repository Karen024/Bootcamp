package Exercise;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random rnd = new Random();


        int randomNumber = rnd.nextInt();
        System.out.println("Integer random number = " + randomNumber);
    }
}
