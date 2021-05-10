package Exercise.Day11;

import java.util.Scanner;

public class MagicSum {
    public static int magicSum(int[] array, int index) {
        int result = 0;
        String string = "";
        for (int i = 0; i <= index; i++) {
            string = String.valueOf(array[i]);
            if (string.contains("8")) {
                result = result + array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = new int[1000];
        int currentInput = 0;
        int index = 0;
        while (true) {
            currentInput = scn.nextInt();
            if (currentInput == -1) {
                break;
            }
            array[index] = currentInput;
            index++;
        }
        System.out.println(magicSum(array, index));
    }
}
