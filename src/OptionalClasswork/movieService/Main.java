package OptionalClasswork.movieService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice = 0;
        Controller controller = new Controller(choice);
        do {
            printMenu();
            choice = scn.nextInt();
            choice = getChoice(choice);
            controller.setChoice(choice);
            controller.execute();
            System.out.println();
        } while (choice != 6);
    }

    private static int getChoice(int choice) {
        Scanner scn = new Scanner(System.in);
        choice = choiceCheck(choice, scn);
        return choice;
    }

    private static int choiceCheck(int choice, Scanner scn) {
        while (choice < 0 || choice > 6) {
            System.out.println("Wrong input try again");
            choice = scn.nextInt();
        }
        return choice;
    }

    public static void printMenu() {
        System.out.println("------ MENU ------");
        System.out.println("1. Create movie");
        System.out.println("2. Read all");
        System.out.println("3. Read by ID");
        System.out.println("4. Update movie by ID");
        System.out.println("5. Delete movie by ID");
        System.out.println("6. For exit");
    }
}
