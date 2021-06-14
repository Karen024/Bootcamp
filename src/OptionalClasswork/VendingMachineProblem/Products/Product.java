package OptionalClasswork.VendingMachineProblem.Products;

import java.io.Serializable;

public abstract class Product implements Serializable {
    abstract public String getName();

    abstract public int getCost();
}
