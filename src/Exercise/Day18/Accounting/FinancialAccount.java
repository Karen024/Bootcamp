package Exercise.Day18.Accounting;

import java.util.Objects;

public class FinancialAccount extends TaxAccounting {
    private int countOfEmployees;
    private String departmentName;
    private int oneEmployerSalary;

    public FinancialAccount(int countOfEmployees, String departmentName, int oneEmployerSalary) {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
        this.oneEmployerSalary = oneEmployerSalary;
    }

    public FinancialAccount() {
    }

    @Override
    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    @Override
    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getOneEmployerSalary() {
        return oneEmployerSalary;
    }

    public void setOneEmployerSalary(int oneEmployerSalary) {
        this.oneEmployerSalary = oneEmployerSalary;
    }

    @Override
    protected void account() {
        System.out.println(oneEmployerSalary * countOfEmployees);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinancialAccount)) return false;
        if (!super.equals(o)) return false;
        FinancialAccount that = (FinancialAccount) o;
        return countOfEmployees == that.countOfEmployees &&
                oneEmployerSalary == that.oneEmployerSalary &&
                Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countOfEmployees, departmentName, oneEmployerSalary);
    }

    @Override
    public String toString() {
        return "FinancialAccount{" +
                "countOfEmployees=" + countOfEmployees +
                ", departmentName='" + departmentName + '\'' +
                ", oneEmployerSalary=" + oneEmployerSalary +
                '}';
    }
}
