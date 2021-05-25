package OptionalClasswork.VendingMachineProblem.Products;

import OptionalClasswork.VendingMachineProblem.Main.Money;

import java.util.Objects;

public class Snickers extends Product {
    private String name;
    private int cost;


    public Snickers() {
        this.name = "Snickers";
        this.cost = 250;
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
        Snickers snickers = (Snickers) o;
        return cost == snickers.cost &&
                Objects.equals(name, snickers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    @Override
    public String toString() {
        return "Snickers{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
