package OptionalClasswork.VendingMachineProblem.Products;

import OptionalClasswork.VendingMachineProblem.Main.Money;

import java.util.Objects;

public class Noy extends Product {
    private String name;
    private int cost;


    public Noy() {
        this.name = "Noy";
        this.cost = 150;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Noy noy = (Noy) o;
        return Objects.equals(name, noy.name) &&
                Objects.equals(cost, noy.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Noy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
