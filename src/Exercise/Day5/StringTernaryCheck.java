package Exercise.Day5;

public class StringTernaryCheck {
    public static void main(String[] args) {
        String string = "";
        System.out.println(string == null ? "-1" : string.equals("") ? "0" : "1");
    }
}
