package Exercise.Day3;

import java.util.Scanner;

public class WideningPrimitiveConversion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        byte byteVariable = scn.nextByte();
        short shortVariableCast = byteVariable;
        System.out.println("Byte variable = " + byteVariable + " , casted short variable = " + shortVariableCast);
        int intVariableCast = shortVariableCast;
        System.out.println("Short variable = " + shortVariableCast + " , casted int variable = " + intVariableCast);
        long longVariableCast = intVariableCast;
        System.out.println("Int variable = " + intVariableCast + " , casted long variable = " + longVariableCast);
        float floatVariableCast = (float) longVariableCast;
        System.out.println("Long variable = " + longVariableCast + " , casted float variable = " + floatVariableCast);
        double doubleVariableCast = floatVariableCast;
        System.out.println("Float variable = " + floatVariableCast + " , casted double variable = " + doubleVariableCast);
    }
}
