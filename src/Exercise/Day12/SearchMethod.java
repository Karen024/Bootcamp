package Exercise.Day12;

public class SearchMethod {
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 7, 8};
        int a = 4;
        System.out.println(search(array));
        System.out.println(search(array, a));
    }
}
