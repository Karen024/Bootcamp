package OptionalClasswork.VendingMachineProblem.Main;

import OptionalClasswork.VendingMachineProblem.Command.Command;
import OptionalClasswork.VendingMachineProblem.Products.*;
import OptionalClasswork.VendingMachineProblem.VendingMachine.VendingMachine;

public class Main {
    public static void main(String[] args) {
        //Our machine have 4 stands, to add more use addStands(count) method, and fillStand(product,index,count) to fill it
        VendingMachine vendingMachine = new VendingMachine();
        Fanta fanta = new Fanta();
        Orbit orbit = new Orbit();
        Noy noy = new Noy();
        Snickers snickers = new Snickers();
        vendingMachine.fillStand(fanta, 0, 10);
        vendingMachine.fillStand(orbit, 1, 10);
        vendingMachine.fillStand(noy, 2, 10);
        vendingMachine.fillStand(snickers, 3, 10);
        vendingMachine.printInfo();
        Money money = new Money(270);
        Command command = new Command(money, 2);
        Result result = vendingMachine.executeCommand(command);
        if (result != null) {
            System.out.println(result.toString());
        }
        System.out.println(money.toString());
    }
}
