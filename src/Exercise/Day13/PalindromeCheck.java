package Exercise.Day13;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean palindromeChecking(String string)
    {
        for(int i=0;i<string.length()/2;i++)
        {
            if(string.charAt(i) != string.charAt(string.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string = scn.next();
        System.out.println(palindromeChecking(string));
    }
}
