package Exercise.Day19.FlyingThings;

import java.util.Objects;

public class Plane implements Flyable {
    private String model;

    public Plane(String model) {
        this.model = model;
    }

    public Plane() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                '}';
    }
}
