package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem2;

import java.io.File;
import java.io.FilenameFilter;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Mher\\IdeaProjects\\Classwork\\src\\OptionalClasswork\\javaInputOutputProblems\\problem2");
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
        for (String name : files) {
            System.out.println(name);
        }
    }
}
