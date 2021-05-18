package Exercise.Day17.Store;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Garni", "Yogurt", "Paxlava"};
        Store store = new Store(25, "Yerevan City", "0777252", array);
        store.buyProducts("Garni");
    }
}
