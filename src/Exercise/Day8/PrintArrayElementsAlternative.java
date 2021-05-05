package Exercise.Day8;

import java.util.Scanner;

public class PrintArrayElementsAlternative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arraySize = scn.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}
