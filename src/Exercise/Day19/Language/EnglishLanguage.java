package Exercise.Day19.Language;

import java.util.Objects;

public class EnglishLanguage implements Language {
    private String name;

    public EnglishLanguage() {
        name = "English";
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnglishLanguage)) return false;
        EnglishLanguage that = (EnglishLanguage) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "EnglishLanguage{" +
                "name='" + name + '\'' +
                '}';
    }
}
