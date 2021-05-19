package Exercise.Day18.Accounting;

import java.util.Objects;

public class Accounting {
    private int countOfEmployees;
    private String departmentName;

    public Accounting() {
    }

    public Accounting(int countOfEmployees, String departmentName) {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    protected void account(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accounting)) return false;
        Accounting that = (Accounting) o;
        return countOfEmployees == that.countOfEmployees &&
                Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countOfEmployees, departmentName);
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "countOfEmployees=" + countOfEmployees +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
