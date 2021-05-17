package Exercise.Day16.Student;

public class Main {
    public static void print(Student[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student(28, 65.5, "Abgar");
        Student student2 = new Student(35, 85.5, "Narek");
        Student student3 = new Student(29, 78.5, "Garegin");
        Student[] array = {student1, student2, student3};
        student1.sort(array, 1);
        print(array);
        student1.sort(array, 1.0);
        print(array);
        student1.sort(array, "1");
        print(array);
    }
}
