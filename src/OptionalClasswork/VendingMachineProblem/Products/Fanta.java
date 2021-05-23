package OptionalClasswork.VendingMachineProblem.Products;

import OptionalClasswork.VendingMachineProblem.Main.Money;

import java.util.Objects;

public class Fanta extends Product {
    private String name;
    private int cost;


    public Fanta() {
        this.name = "Fanta";
        this.cost = 280;
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
        Fanta fanta = (Fanta) o;
        return Objects.equals(name, fanta.name) &&
                Objects.equals(cost, fanta.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Fanta{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
