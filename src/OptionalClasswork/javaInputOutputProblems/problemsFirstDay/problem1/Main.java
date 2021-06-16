package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Mher\\IdeaProjects\\Classwork\\src\\OptionalClasswork\\javaInputOutputProblems");
        String[] files = file.list();
        for (String name : files) {
            System.out.println(name);
        }
    }
}
