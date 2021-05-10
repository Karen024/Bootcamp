package Exercise.Day11;

import java.util.Scanner;

public class StudentGrades {
    public static double gradeAverage(int[] studentGrades) {
        double sum = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            sum = sum + studentGrades[i];
        }
        return sum / studentGrades.length;
    }

    public static int gradeMax(int[] studentGrades) {
        int max = 0;
        for (int i = 0; i < studentGrades.length; i++) {
            if (studentGrades[i] >= max) {
                max = studentGrades[i];
            }
        }
        return max;
    }

    public static int gradeMin(int[] studentGrades) {
        int min = studentGrades[0];
        for (int i = 1; i < studentGrades.length; i++) {
            if (studentGrades[i] <= min) {
                min = studentGrades[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = scn.nextInt();
        int[] studentGrades = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the grade for student " + (i + 1) + ":");
            studentGrades[i] = scn.nextInt();
        }
        System.out.println(gradeAverage(studentGrades));
        System.out.println(gradeMax(studentGrades));
        System.out.println(gradeMin(studentGrades));
    }
}
