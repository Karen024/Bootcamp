package Exercise.Day18.Accounting;

import java.util.Objects;

public class TaxAccounting extends Accounting {
    private int countOfEmployees;
    private String departmentName;
    private int luysiCaxs;
    private int griCaxs;

    public TaxAccounting() {
    }

    public TaxAccounting(int countOfEmployees, String departmentName, int luysiCaxs, int griCaxs) {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
        this.luysiCaxs = luysiCaxs;
        this.griCaxs = griCaxs;
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

    public int getLuysiCaxs() {
        return luysiCaxs;
    }

    public void setLuysiCaxs(int luysiCaxs) {
        this.luysiCaxs = luysiCaxs;
    }

    public int getGriCaxs() {
        return griCaxs;
    }

    public void setGriCaxs(int griCaxs) {
        this.griCaxs = griCaxs;
    }

    @Override
    protected void account() {
        System.out.println(griCaxs + luysiCaxs);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaxAccounting)) return false;
        if (!super.equals(o)) return false;
        TaxAccounting that = (TaxAccounting) o;
        return countOfEmployees == that.countOfEmployees &&
                luysiCaxs == that.luysiCaxs &&
                griCaxs == that.griCaxs &&
                Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), countOfEmployees, departmentName, luysiCaxs, griCaxs);
    }

    @Override
    public String toString() {
        return "TaxAccounting{" +
                "countOfEmployees=" + countOfEmployees +
                ", departmentName='" + departmentName + '\'' +
                ", luysiCaxs=" + luysiCaxs +
                ", griCaxs=" + griCaxs +
                '}';
    }
}
