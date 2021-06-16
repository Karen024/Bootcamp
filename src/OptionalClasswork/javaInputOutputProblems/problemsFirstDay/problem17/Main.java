package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem17;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int count = 3;
            String string = "";
            while (count != 0) {
                string += bufferedReader.readLine();
                string += "\n";
                count--;
            }
            System.out.println(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}