package Exercise.Day16.University;

import java.util.Objects;
import java.util.Scanner;

public class University {
    private String name;
    private int countOfStudents;
    private int maxCountOfStudents;
    private int maxAgeOfStudents;
    private int minAgeOfStudents;

    public University(String name, int countOfStudents, int maxCountOfStudents, int maxAgeOfStudents, int minAgeOfStudents) {
        this.name = name;
        this.countOfStudents = countOfStudents;
        this.maxCountOfStudents = maxCountOfStudents;
        this.maxAgeOfStudents = maxAgeOfStudents;
        this.minAgeOfStudents = minAgeOfStudents;
    }

    public University() {
    }

    public String getName() {
        return name;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public int getMaxCountOfStudents() {
        return maxCountOfStudents;
    }

    public void setMaxCountOfStudents(int maxCountOfStudents) {
        this.maxCountOfStudents = maxCountOfStudents;
    }

    public int getMaxAgeOfStudents() {
        return maxAgeOfStudents;
    }

    public void setMaxAgeOfStudents(int maxAgeOfStudents) {
        this.maxAgeOfStudents = maxAgeOfStudents;
    }

    public int getMinAgeOfStudents() {
        return minAgeOfStudents;
    }

    public void setMinAgeOfStudents(int minAgeOfStudents) {
        this.minAgeOfStudents = minAgeOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;
        University that = (University) o;
        return countOfStudents == that.countOfStudents &&
                maxCountOfStudents == that.maxCountOfStudents &&
                maxAgeOfStudents == that.maxAgeOfStudents &&
                minAgeOfStudents == that.minAgeOfStudents &&
                Objects.equals(name, that.name);
    }

    public boolean checkStudentAge(Student student) {
        if (student.getAge() <= minAgeOfStudents || student.getAge() >= maxAgeOfStudents) {
            return false;
        }
        return true;
    }

    public void admission(Student student) {
        Scanner scn = new Scanner(System.in);
        if (checkStudentAge(student)) {
            System.out.println("We have this courses for our students");
            System.out.println("Applied Mathematics -- 1");
            System.out.println("Computer science -- 2");
            System.out.println("Advanced physics -- 3");
            System.out.println("Nano electronics -- 4");
            System.out.println("Journalism -- 5");
            System.out.println("Economics -- 6");
            int answer = scn.nextInt();
            switch (answer) {
                case 1:
                    register();
                    student.setProfession("Mathematician");
                    break;
                case 2:
                    register();
                    student.setProfession("Programmer");
                    break;
                case 3:
                    register();
                    student.setProfession("Physician");
                    break;
                case 4:
                    register();
                    student.setProfession("Nano electronics physician");
                    break;
                case 5:
                    register();
                    student.setProfession("Journalist");
                    break;
                case 6:
                    register();
                    student.setProfession("Economist");
                    break;
                default:
                    System.out.println("Wrong input please try again");
            }
        } else {
            System.out.println("No admission for student with invalid age");
        }
    }

    public void register() {
        if ((countOfStudents + 1) <= maxCountOfStudents) {
            countOfStudents = countOfStudents + 1;
            return;
        }
        System.out.println("Sorry no more place for registration");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfStudents, maxCountOfStudents, maxAgeOfStudents, minAgeOfStudents);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", countOfStudents=" + countOfStudents +
                ", maxCountOfStudents=" + maxCountOfStudents +
                ", maxAgeOfStudents=" + maxAgeOfStudents +
                ", minAgeOfStudents=" + minAgeOfStudents +
                '}';
    }
}
