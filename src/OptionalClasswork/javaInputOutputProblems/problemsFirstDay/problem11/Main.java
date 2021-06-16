package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        byte[] array;
        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            array = fileInputStream.readAllBytes();
            String string = new String(array);
            System.out.println(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
