package OptionalClasswork.javaInputOutputProblems.problemsFirstDay.problem15;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            String string = "Inch vor naxadasutyun";
            byte[] array = string.getBytes();
            fileOutputStream.write(array);
            String newString = new String(fileInputStream.readAllBytes());
            System.out.println(newString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
