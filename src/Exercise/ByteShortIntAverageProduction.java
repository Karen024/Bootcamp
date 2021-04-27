package Exercise;

import java.util.Random;
import java.util.Scanner;

public class ByteShortIntAverageProduction {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();


        System.out.println("Input byte variable");
        byte byteVariable = scn.nextByte();
        System.out.println("Input short variable");
        short shortVariable = scn.nextShort();
        System.out.println("Input int variable");
        int intVariable = scn.nextInt();
        float average = (byteVariable + shortVariable + intVariable) / 3f;
        System.out.println("Average of variables = " + (average / 3)
                + " ,and product is = " + (byteVariable * shortVariable * intVariable));
    }
}
