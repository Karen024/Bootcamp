package OptionalClasswork.movieService.Movie;

import java.util.Objects;

public class Movie {
    private String name;
    private int date;
    private String genre;
    private int movieID;

    public Movie(String name, int date, String genre,int movieID) {
        this.name = name;
        this.date = date;
        this.genre = genre;
        this.movieID = movieID;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return date == movie.date &&
                movieID == movie.movieID &&
                name.equals(movie.name) &&
                genre.equals(movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, genre, movieID);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", genre='" + genre + '\'' +
                ", movieID=" + movieID +
                '}';
    }
}
