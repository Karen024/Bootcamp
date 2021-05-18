package Exercise.Day17.Person;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public Person() {
    }

    public Person(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        if (firstName.length() >= 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        }
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        }
        if (age >= 18 && age <= 99) {
            this.age = age;
        }
        if (sex.equals("Male") || sex.equals("Female")) {
            this.sex = sex;
        }
        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() == 8 && countOfDigitsInString(passportId) == 6) {
            this.passportId = passportId;
        }
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassportId() {
        return passportId;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() >= 6 && lastName.length() <= 20) {
            this.lastName = lastName;
        }
    }

    public void setPassportId(String passportId) {
        if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() == 8 && countOfDigitsInString(passportId) == 6) {
            this.passportId = passportId;
        }
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 99) {
            this.age = age;
        }
    }

    public void setSex(String sex) {
        if (sex.equals("Male") || sex.equals("Female")) {
            this.sex = sex;
        }
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int countOfDigitsInString(String string) {
        int countOfDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                countOfDigits++;
            }
        }
        return countOfDigits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(passportId, person.passportId) &&
                Objects.equals(sex, person.sex) &&
                Objects.equals(nationality, person.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, passportId, age, sex, nationality);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId='" + passportId + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
