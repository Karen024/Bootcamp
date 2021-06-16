package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem13;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String lines = bufferedReader.readLine();
            lines += "\n";
            lines += bufferedReader.readLine();
            System.out.println(lines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
