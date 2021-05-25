package OptionalClasswork.VendingMachineProblem.Main;

import OptionalClasswork.VendingMachineProblem.Products.Product;

import java.util.Objects;

public class Result {
    private Product product;
    private Money money;

    public Result(Product product, Money money) {
        this.product = product;
        this.money = money;
    }

    public Result(Product product) {
        this.product = product;
        this.money = null;
    }

    public Product getProduct() {
        return product;
    }

    public Money getMoney() {
        return money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return Objects.equals(product, result.product) &&
                Objects.equals(money, result.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, money);
    }

    @Override
    public String toString() {
        return "Result{" +
                "product=" + product +
                ", money=" + money +
                '}';
    }
}
