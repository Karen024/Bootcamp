package Exercise.Day3;

import java.util.Scanner;

public class NarrowingPrimitiveConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double doubleVariable = scn.nextDouble();
        float floatVariableCast = (float) doubleVariable;
        System.out.println("Double variable = " + doubleVariable + " , casted float variable = " + floatVariableCast);
        long longVariableCast = (long) floatVariableCast;
        System.out.println("Float variable = " + floatVariableCast + " , casted long variable = " + longVariableCast);
        int intVariableCast = (int) longVariableCast;
        System.out.println("Long variable = " + longVariableCast + ", casted int variable = " + intVariableCast);
        short shortVariableCast = (short) intVariableCast;
        System.out.println("Int variable = " + intVariableCast + " , casted short variable = " + shortVariableCast);
        byte byteVariableCast = (byte) shortVariableCast;
        System.out.println("Short variable = " + shortVariableCast + " , casted byte variable = " + byteVariableCast);
    }
}
