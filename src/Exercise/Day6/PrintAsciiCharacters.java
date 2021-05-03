package Exercise.Day6;

public class PrintAsciiCharacters {
    public static void main(String[] args) {
        int charactersCount = 0;
        char symbols = 32;
        while (true) {

            if (symbols == 123) {
                break;
            } else {
                if (charactersCount == 10) {
                    System.out.println("\n");
                    charactersCount = 0;
                } else {
                    System.out.print(symbols + " ");
                    symbols++;
                    charactersCount++;
                }
            }
        }
    }
}
