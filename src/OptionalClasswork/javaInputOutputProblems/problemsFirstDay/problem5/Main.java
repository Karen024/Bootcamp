package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem5;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Mher\\IdeaProjects\\Classwork\\src\\OptionalClasswork\\javaInputOutputProblems\\problem5\\directory");
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
