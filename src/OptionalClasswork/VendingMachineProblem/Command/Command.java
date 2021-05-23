package OptionalClasswork.VendingMachineProblem.Command;

import OptionalClasswork.VendingMachineProblem.Main.Money;

import java.util.Objects;

public class Command {
    private Money moneyValue;
    private int index;

    public Command() {
    }

    public Command(Money moneyValue, int index) {
        this.moneyValue = moneyValue;
        this.index = index;
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
