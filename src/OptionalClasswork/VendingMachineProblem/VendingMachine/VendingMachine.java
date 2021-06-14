package OptionalClasswork.VendingMachineProblem.VendingMachine;

import OptionalClasswork.VendingMachineProblem.ApplicationState;
import OptionalClasswork.VendingMachineProblem.Command.Command;
import OptionalClasswork.VendingMachineProblem.Main.Money;
import OptionalClasswork.VendingMachineProblem.Main.Result;
import OptionalClasswork.VendingMachineProblem.Products.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VendingMachine extends Machine {
    private List<ArrayList<Product>> stands;
    ApplicationState applicationState;

    public VendingMachine() {
        stands = new ArrayList<ArrayList<Product>>();
        for (int i = 0; i < 4; i++) {
            stands.add(new ArrayList<Product>());
        }
        applicationState = new ApplicationState();
        applicationState.setStands(stands);
    }

    public List<ArrayList<Product>> getStands() {
        return stands;
    }

    public void addStands(int count) {
        if (count <= 0) {
            System.out.println("Wrong input, count must be > 0");
            return;
        }
        for (int i = 0; i < count; i++) {
            stands.add(new ArrayList<Product>());
            System.out.println("Added " + count + " stands to machine");
        }
        applicationState.setStands(stands);
    }

    public void fillStand(Product product, int index, int count) {
        if (fillCases(index, count)) return;
        productCases(product, index, count);
        stands.get(index).add(product);
        System.out.println("Stand " + index + " is filled with " + product.getName());
        applicationState.setStands(stands);
    }

    public void setStands(List<ArrayList<Product>> stands) {
        this.stands = stands;
    }

    private void productCases(Product product, int index, int count) {
        if (product instanceof Snickers) {
            for (int i = 1; i < count; i++) {
                stands.get(index).add(new Snickers());
            }
        }
        if (product instanceof Noy) {
            for (int i = 1; i < count; i++) {
                stands.get(index).add(new Noy());
            }
        }
        if (product instanceof Orbit) {
            for (int i = 1; i < count; i++) {
                stands.get(index).add(new Orbit());
            }
        }
        if (product instanceof Fanta) {
            for (int i = 1; i < count; i++) {
                stands.get(index).add(new Fanta());
            }
        }
    }

    private boolean fillCases(int index, int count) {
        if (index >= stands.size()) {
            System.out.println("Wrong input such index dose not exists");
            return true;
        }
        if (index < 0) {
            System.out.println("Wrong input index must be > or = 0");
            return true;
        }
        if (!stands.get(index).isEmpty()) {
            System.out.println("This stand is already filled with products");
            return true;
        }
        if (count <= 0) {
            System.out.println("Wrong input count must be > 0");
            return true;
        }
        return false;
    }

    public void printInfo() {
        System.out.println();
        for (int i = 0; i < stands.size(); i++) {
            if (stands.get(i).isEmpty()) {
                System.out.println("Stand " + (i) + " is empty");
            } else {
                System.out.println("Stand " + (i) + " , product " + stands.get(i).get(0).getName() + " count = " + stands.get(i).size());
            }
        }
        System.out.println();
    }

    @Override
    public Result executeCommand(Command command) {
        if (commandValidCheck(command)) {
            Product product = stands.get(command.getIndex()).get(0);
            int cost = stands.get(command.getIndex()).get(0).getCost();
            int money = command.getMoneyValue().getValue();
            stands.get(command.getIndex()).remove(0);
            applicationState.setStands(stands);
            return new Result(product, giveRemainder(command.getMoneyValue(), cost));
        }
        return null;
    }

    @Override
    public boolean commandValidCheck(Command command) {
        Money money = command.getMoneyValue();
        int index = command.getIndex();
        if (index >= stands.size()) {
            System.out.println("Such index dose not exists");
            return false;
        } else if (stands.get(index).isEmpty()) {
            System.out.println("Stand is empty");
            return false;
        } else if (money.getValue() < stands.get(index).get(0).getCost()) {
            System.out.println("No enough money to buy a product");
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendingMachine that = (VendingMachine) o;
        return Objects.equals(stands, that.stands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stands);
    }

    public Money giveRemainder(Money moneyValue, int cost) {
        int value = moneyValue.getValue();
        moneyValue.setValue(value - cost);
        return moneyValue;
    }
}
