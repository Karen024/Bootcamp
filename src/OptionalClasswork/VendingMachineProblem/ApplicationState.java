package OptionalClasswork.VendingMachineProblem;

import OptionalClasswork.VendingMachineProblem.Products.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ApplicationState implements Serializable {
    private List<ArrayList<Product>> stands;

    public ApplicationState() {
        stands = new ArrayList<ArrayList<Product>>();
    }

    public List<ArrayList<Product>> getStands() {
        return stands;
    }

    public void setStands(List<ArrayList<Product>> stands) {
        this.stands = stands;
    }


}
