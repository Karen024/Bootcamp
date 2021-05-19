package Exercise.Day18.Animal;

import java.util.Objects;

public class Dog extends Animal{
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    protected void voice() {
        System.out.println("Haf");
    }

    @Override
    protected void eat() {
        System.out.println("Nyam - Nyam");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
