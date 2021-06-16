package OptionalClasswork.javaInputOutputProblems.newProblem2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Mher\\IdeaProjects\\Classwork\\src\\OptionalClasswork\\javaInputOutputProblems\\newProblem2\\datafile.txt");
        generateFile(file);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            long position = dataInputStream.readLong();
            System.out.println(position);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            bufferedReader.skip(position);
            System.out.println(dataInputStream.readInt());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void generateFile(File file) {
        try(RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            int data = 123;
            raf.writeLong(3);
            raf.writeInt(data);
        } catch (FileNotFoundException e) {
            System.err.println("This shouldn't happen: " + e);
        } catch (IOException e) {
            System.err.println("Writing error: " + e);
        }
    }
}
