package OptionalClasswork.VendingMachineProblem.Products;

import OptionalClasswork.VendingMachineProblem.Main.Money;

import java.util.Objects;

public class Orbit extends Product {
    private String name;
    private int cost;


    public Orbit() {
        this.name = "Orbit";
        this.cost = 220;
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
        Orbit orbit = (Orbit) o;
        return Objects.equals(name, orbit.name) &&
                Objects.equals(cost, orbit.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Orbit{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
