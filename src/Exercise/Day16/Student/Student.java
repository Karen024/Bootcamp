package Exercise.Day16.Student;

import java.util.Objects;

public class Student {
    private int age;
    private double weight;
    private String name;

    public Student() {
    }

    public Student(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Student[] sort(Student[] array, int choice) {
        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j].age > array[j + 1].age) {
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap = false) {
                break;
            }
        }
        return array;
    }

    public Student[] sort(Student[] array, double choice) {
        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j].weight > array[j + 1].weight) {
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap = false) {
                break;
            }
        }
        return array;
    }

    public Student[] sort(Student[] array, String choice) {
        boolean swap = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length - i - 1; j++) {
                if (array[j].name.length() > array[j + 1].name.length()) {
                    Student temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap = false) {
                break;
            }
        }
        return array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                Double.compare(student.weight, weight) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
