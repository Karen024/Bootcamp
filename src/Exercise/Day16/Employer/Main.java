package Exercise.Day16.Employer;

public class Main {
    public static void main(String[] args) {
        Employer firstEmployer = new Employer("Sargis", 25, "Adjarabet", 300_000);
        Employer secondEmployer = new Employer("Vahag", 28, "Digitain", 220_000);
        System.out.println();
        System.out.println(firstEmployer.toString());
        System.out.println();
        System.out.println(secondEmployer.toString());
    }
}
