package OptionalClasswork.VendingMachineProblem.Command;

import OptionalClasswork.VendingMachineProblem.Main.Money;
import OptionalClasswork.VendingMachineProblem.Main.Result;
import OptionalClasswork.VendingMachineProblem.VendingMachine.VendingMachine;

import java.util.Objects;

public class Command {
    private Money moneyValue;
    private int index;

    public Command() {
    }

    public void commandCreation(Money money, int index) {
        moneyValue = money;
        this.index = index;
    }

    public Result commandExecution(VendingMachine vendingMachine) {
        Result result = vendingMachine.executeCommand(this);
        return result;
    }

    public int getIndex() {
        return index;
    }

    public Money getMoneyValue() {
        return moneyValue;
    }

    public void setMoneyValue(Money moneyValue) {
        this.moneyValue = moneyValue;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Command{" +
                "moneyValue=" + moneyValue +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return moneyValue == command.moneyValue &&
                index == command.index;
    }

    @Override
    public int hashCode() {
        return Objects.hash(moneyValue, index);
    }
}
