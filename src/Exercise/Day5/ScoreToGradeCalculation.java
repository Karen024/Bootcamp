package Exercise.Day5;

import java.util.Scanner;

public class ScoreToGradeCalculation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int quizScore = scn.nextInt();
        int midTermScore = scn.nextInt();
        int finalScore = scn.nextInt();
        int averageScore = (quizScore + midTermScore + finalScore) / 3;
        int grade = 0;
        grade = averageScore >= 80 ? 1 : averageScore >= 60 ? 2 : averageScore >= 40 ? 3 : 4;
        switch (grade) {
            case 1:
                System.out.println("grade = A");
                break;
            case 2:
                System.out.println("grade = B");
                break;
            case 3:
                System.out.println("grade = C");
                break;
            case 4:
                System.out.println("grade = D");
                break;
        }

    }
}
