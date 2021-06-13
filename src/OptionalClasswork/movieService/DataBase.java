package OptionalClasswork.movieService;

import OptionalClasswork.movieService.Movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Movie> movieList;
    private int currentID;

    public DataBase() {
        movieList = new ArrayList<>();
        currentID = 1;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "movieList=" + movieList +
                '}';
    }

    public int getCurrentID() {
        return currentID;
    }

    public void setCurrentID(int currentID) {
        this.currentID = currentID;
    }
}
