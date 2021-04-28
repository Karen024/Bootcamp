package Exercise.Day3;

public class NameLettersToIntAverageCalculation {
    public static void main(String[] args) {
        String name = "Karen";
        double lettersCastedAverageResult = (double) (name.charAt(0) + name.charAt(1) + name.charAt(2) + name.charAt(3) + name.charAt(4)) / 5;
        System.out.println(name + " -- " + lettersCastedAverageResult);
    }
}
