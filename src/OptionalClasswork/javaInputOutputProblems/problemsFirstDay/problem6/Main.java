package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem6;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("\u202AC:\\Users\\Mher\\Desktop\\file1.txt");
        File file2 = new File("\u202AC:\\Users\\Mher\\Desktop\\file2.txt");
        System.out.println(file1.compareTo(file2));
    }
}
