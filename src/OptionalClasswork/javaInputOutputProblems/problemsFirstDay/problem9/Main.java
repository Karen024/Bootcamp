package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem9;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        System.out.println(file.length());
        System.out.println((double)file.length()/1024);
        System.out.println((double)file.length()/(1024*1024));
    }
}
