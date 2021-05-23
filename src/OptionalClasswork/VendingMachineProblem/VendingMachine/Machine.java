package OptionalClasswork.VendingMachineProblem.VendingMachine;

import OptionalClasswork.VendingMachineProblem.Command.Command;
import OptionalClasswork.VendingMachineProblem.Main.Result;

public abstract class Machine {
    abstract Result executeCommand(Command command);

    abstract boolean commandValidCheck(Command command);
}
