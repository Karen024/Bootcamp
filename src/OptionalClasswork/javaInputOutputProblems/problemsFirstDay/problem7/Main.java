package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem7;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        System.out.println(file.lastModified());
    }
}
