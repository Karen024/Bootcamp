package Exercise.Day19.Language;

import java.util.Objects;

public class ProgrammingLanguage implements Language {
    private String name;

    public ProgrammingLanguage() {
        name = "Java";
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProgrammingLanguage)) return false;
        ProgrammingLanguage that = (ProgrammingLanguage) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                '}';
    }
}
