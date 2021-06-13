package OptionalClasswork.movieService;

import OptionalClasswork.movieService.Movie.MovieRequest;

import java.util.Scanner;

public class Controller<T> {
    private int choice;
    private Service service;
    private Scanner scn;

    public Controller(int choice) {
        this.choice = choice;
        service = new Service();
        scn = new Scanner(System.in);
    }

    public void execute() {
        choiceCheck();
    }

    private void choiceCheck() {
        switch (choice) {
            case 1:
                createMovie();
                break;
            case 2:
                readAll();
                break;
            case 3:
                readByID();
                break;
            case 4:
                updateByID();
                break;
            case 5:
                deleteByID();
        }
    }

    public void createMovie() {
        MovieRequest movieRequest = movieDataInput();
        service.createMovieFromRequest(movieRequest);
    }

    private MovieRequest movieDataInput() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter data, to create movie");
        System.out.println("1. Enter movie name");
        String name = scn.nextLine();
        System.out.println("2. Enter movie date");
        int date = scn.nextInt();
        System.out.println("3. Enter movie genre");
        String genre = scn.next();
        MovieRequest movieRequest = new MovieRequest(name, date, genre);
        return movieRequest;
    }

    public void readAll() {
        service.readAllMoviesFromDB();
    }

    public void readByID() {
        System.out.println("Enter ID for search");
        int ID = scn.nextInt();
        service.readMovieByID(ID);
    }

    public void updateByID() {
        printUpdateMenu();
        int choice = scn.nextInt();
        choice = getChoice(choice, scn);
        System.out.println("Enter movie ID");
        int ID = scn.nextInt();
        service.updateMovieInDB(choice, ID);
    }

    private void printUpdateMenu() {
        System.out.println("------ UPDATE MENU -------");
        System.out.println("1. Change name");
        System.out.println("2. Change date");
        System.out.println("3. Change genre");
        System.out.println("4. To exit update menu");
    }

    private int getChoice(int choice, Scanner scn) {
        choice = choiceCheck(choice, scn);
        return choice;
    }

    private int choiceCheck(int choice, Scanner scn) {
        while (choice < 0 || choice > 4) {
            System.out.println("Wrong input try again");
            choice = scn.nextInt();
        }
        return choice;
    }

    public void deleteByID() {
        System.out.println("Enter ID for search");
        int ID = scn.nextInt();
        service.deleteMovieByID(ID);
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }
}
