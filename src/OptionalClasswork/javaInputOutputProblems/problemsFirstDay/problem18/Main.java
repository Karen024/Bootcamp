package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        try {
            Scanner scanner = new Scanner(file);
            String result = "";
            String current = "";
            while (scanner.hasNext()) {
                current = scanner.next();
                if (current.length() > result.length()) {
                    result = current;
                }
            }
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
