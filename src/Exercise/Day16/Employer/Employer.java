package Exercise.Day16.Employer;

import java.util.Objects;

public class Employer {
    private String name;
    private int age;
    private String workPlace;
    private int salary;

    public Employer(String name, int age, String workPlace, int salary) {
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
        this.salary = salary;
    }

    public Employer() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return age == employer.age &&
                salary == employer.salary &&
                Objects.equals(name, employer.name) &&
                Objects.equals(workPlace, employer.workPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, workPlace, salary);
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", workPlace='" + workPlace + '\'' +
                ", salary=" + salary +
                '}';
    }
}
