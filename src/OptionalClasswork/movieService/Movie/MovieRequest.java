package OptionalClasswork.movieService.Movie;

import java.util.Objects;

public class MovieRequest {
    private String name;
    private int date;
    private String genre;

    public MovieRequest(String name, int date, String genre) {
        this.name = name;
        this.date = date;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieRequest)) return false;
        MovieRequest that = (MovieRequest) o;
        return date == that.date &&
                name.equals(that.name) &&
                genre.equals(that.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, genre);
    }

    @Override
    public String toString() {
        return "MovieRequest{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", genre='" + genre + '\'' +
                '}';
    }
}
