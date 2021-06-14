package OptionalClasswork.VendingMachineProblem.Main;

import OptionalClasswork.VendingMachineProblem.ApplicationState;
import OptionalClasswork.VendingMachineProblem.Command.Command;
import OptionalClasswork.VendingMachineProblem.Products.Fanta;
import OptionalClasswork.VendingMachineProblem.Products.Noy;
import OptionalClasswork.VendingMachineProblem.Products.Orbit;
import OptionalClasswork.VendingMachineProblem.Products.Snickers;
import OptionalClasswork.VendingMachineProblem.VendingMachine.VendingMachine;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Our machine have 4 stands, to add more use addStands(count) method, and fillStand(product,index,count) to fill it
        File file = new File("State.txt");
        ApplicationState applicationState = new ApplicationState();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine = fileCreationAndReadCheck(file, vendingMachine);
        Scanner scanner = new Scanner(System.in);
        System.out.println(vendingMachine.getStands().toString());
        System.out.println();
        menu();
        int choice = scanner.nextInt();
        inputCheck(choice);
        Money money = new Money(10000);
        buying(vendingMachine, choice, money, applicationState);
        applicationState.setStands(vendingMachine.getStands());
        writeToFile(applicationState);
    }

    public static void writeToFile(ApplicationState applicationState) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("State.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(applicationState);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static VendingMachine fileCreationAndReadCheck(File file, VendingMachine vendingMachine) {
        if (!file.exists()) {
            try {
                file.createNewFile();
                fillingVendingMachine(vendingMachine);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try (FileInputStream fileInputStream = new FileInputStream("State.txt");
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                ApplicationState applicationState = new ApplicationState();
                applicationState = (ApplicationState) objectInputStream.readObject();
                vendingMachine.setStands(applicationState.getStands());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return vendingMachine;
    }


    public static void buying(VendingMachine vendingMachine, int choice, Money money, ApplicationState applicationState) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (choice == 2) {
                break;
            }
            System.out.println("Type stand index");
            int index = scanner.nextInt();
            Command command = new Command();
            command.commandCreation(money, index);
            Result result = command.commandExecution(vendingMachine);
            if (result != null) {
                System.out.println(result.toString());
            }
            printInfo(vendingMachine, index, money);
            menu();
            choice = scanner.nextInt();
        }
    }

    public static void printInfo(VendingMachine vendingMachine, int index, Money money) {
        System.out.println(money.toString());
        System.out.println();
        System.out.println(vendingMachine.getStands().get(index).toString());
        System.out.println();
    }

    public static void inputCheck(int choice) {
        Scanner scn = new Scanner(System.in);
        while (choice != 1) {
            System.out.println("Wrong input");
            choice = scn.nextInt();
        }
    }


    public static void fillingVendingMachine(VendingMachine vendingMachine) {
        Fanta fanta = new Fanta();
        Orbit orbit = new Orbit();
        Noy noy = new Noy();
        Snickers snickers = new Snickers();
        vendingMachine.fillStand(fanta, 0, 3);
        vendingMachine.fillStand(orbit, 1, 3);
        vendingMachine.fillStand(noy, 2, 3);
        vendingMachine.fillStand(snickers, 3, 3);
    }

    public static void menu() {
        System.out.println("Press 1 to buy");
        System.out.println("Press 2 to exit");
    }
}
