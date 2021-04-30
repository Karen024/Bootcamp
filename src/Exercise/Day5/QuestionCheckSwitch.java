package Exercise.Day5;

import java.util.Scanner;

public class QuestionCheckSwitch {
    public static void main(String[] args) {
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
        System.out.println("   a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";");
        Scanner scn = new Scanner(System.in);
        String answer = scn.next();
        switch (answer) {
            case "a": case "c": case "d":
                System.out.println("Invalid choice");
                break;
            case "b":
                System.out.println("Correct answer");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
