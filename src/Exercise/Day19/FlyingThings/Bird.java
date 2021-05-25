package Exercise.Day19.FlyingThings;

import java.util.Objects;

public class Bird implements Flyable{
    private String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public Bird() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return Objects.equals(breed, bird.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
