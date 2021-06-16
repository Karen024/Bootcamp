package OptionalClasswork.javaInputOutputProblems.newProblem1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char particularCharacter = ' ';
        File file = new File("\u202AC:\\Users\\Mher\\Desktop\\file.txt");
        particularCharacter = inputCharacter(particularCharacter);
        readAndCalculte(particularCharacter, file);
    }

    public static void readAndCalculte(char particularCharacter, File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int count = 0;
            int current = bufferedReader.read();
            while (current != -1) {
                if ((char) current == particularCharacter) {
                    count++;
                }
                current = bufferedReader.read();
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static char inputCharacter(char particularCharacter) {
        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);) {
            particularCharacter = (char) inputStreamReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return particularCharacter;
    }
}
