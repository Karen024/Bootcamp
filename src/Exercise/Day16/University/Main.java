package Exercise.Day16.University;

public class Main {
    public static void main(String[] args) {
        University university = new University("Rau", 0, 500, 40, 15);
        Student student = new Student("Aram", 35);
        university.admission(student);
        System.out.println(university.toString());
        System.out.println();
        System.out.println(student.toString());
    }
}
