package OptionalClasswork.movieService;

import OptionalClasswork.movieService.Movie.Movie;
import OptionalClasswork.movieService.Movie.MovieRequest;

import java.util.Scanner;

public class Service {
    private DataBase dataBase;

    public Service() {
        dataBase = new DataBase();
    }

    public void createMovieFromRequest(MovieRequest movieRequest) {
        if (movieValidationCheck(movieRequest)) {
            if (createMovieModel(movieRequest)) {
                System.out.println("Movie created, and added to DB");
            } else {
                System.out.println("Unknown error while creating movie");
            }
        }
    }

    private void addToDB(Movie movie) {
        dataBase.getMovieList().add(movie);
    }

    private boolean createMovieModel(MovieRequest movieRequest) {
        String name = movieRequest.getName();
        int date = movieRequest.getDate();
        String genre = movieRequest.getGenre();
        int movieID = dataBase.getCurrentID();
        Movie movie = new Movie(name, date, genre, movieID);
        addToDB(movie);
        dataBase.setCurrentID(dataBase.getCurrentID() + 1);
        return true;
    }

    private boolean movieValidationCheck(MovieRequest movieRequest) {
        if (movieCheckCases(movieRequest)) return false;
        return true;
    }

    private boolean movieCheckCases(MovieRequest movieRequest) {
        if (movieRequestDataCheck(movieRequest)) return true;
        return false;
    }

    private boolean movieRequestDataCheck(MovieRequest movieRequest) {
        if (movieNameLengthCheck(movieRequest.getName())) return true;
        if (movieDateCheck(movieRequest.getDate())) return true;
        if (movieGenreCheck(movieRequest.getGenre())) return true;
        return false;
    }

    private boolean movieGenreCheck(String genre) {
        while (!genre.equals("Comedy") && !genre.equals("Tragedy")) {
            System.out.println("Wrong genre input create new request and fix this");
            return true;
        }
        return false;
    }

    private boolean movieDateCheck(int date) {
        if (date < 1800 || date > 2022) {
            System.out.println("Wrong date input create new request and fix this");
            return true;
        }
        return false;
    }

    private boolean movieNameLengthCheck(String name) {
        if (name.length() == 0) {
            System.out.println("Wrong name input create new request and fix this");
            return true;
        }
        return false;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void readAllMoviesFromDB() {
        System.out.println(dataBase.toString());
    }

    public void readMovieByID(int ID) {
        if (idCheck(ID)) {
            System.out.println(dataBase.getMovieList().get(ID - 1).toString());
        }
    }

    public void deleteMovieByID(int ID) {
        if (idCheck(ID)) {
            dataBase.getMovieList().remove(ID - 1);
            System.out.println("Movie with ID = " + ID + " removed from list");
        }
    }

    private boolean idCheck(int ID) {
        if (ID < 0 || ID > dataBase.getCurrentID() - 1) {
            System.out.println("Wrong ID input try again");
            return false;
        }
        return true;
    }

    public void updateMovieInDB(int choice, int ID) {
        if (!idCheck(ID)) return;
        updateCases(choice, ID);
    }

    private void updateCases(int choice, int ID) {
        Scanner scn = new Scanner(System.in);
        switch (choice) {
            case 1:
                updateName(ID, scn);
                break;
            case 2:
                updateDate(ID, scn);
                break;
            case 3:
                updateGenre(ID, scn);
                break;
            default:
                return;
        }
    }

    private void updateGenre(int ID, Scanner scn) {
        System.out.println("Enter update genre Tragedy, or Comedy");
        String genre = scn.next();
        if (!movieGenreCheck(genre)) return;
        dataBase.getMovieList().get(ID - 1).setGenre(genre);
        System.out.println("Movie genre with ID = " + ID + " updated");
    }

    private void updateDate(int ID, Scanner scn) {
        System.out.println("Enter update date");
        int date = scn.nextInt();
        if (!movieDateCheck(date)) return;
        dataBase.getMovieList().get(ID - 1).setDate(date);
        System.out.println("Movie date with ID = " + ID + " updated");
    }

    private void updateName(int ID, Scanner scn) {
        System.out.println("Enter update name");
        String name = scn.nextLine();
        if (movieNameLengthCheck(name)) return;
        dataBase.getMovieList().get(ID - 1).setName(name);
        System.out.println("Movie name with ID = " + ID + " updated");
    }

}
