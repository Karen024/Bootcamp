package OptionalClasswork.movieService.Exceptions;

import java.util.InputMismatchException;

public class WrongInputException extends InputMismatchException {
    public void printMessage() {
        System.out.println("Wrong input pls try again");
    }
}
