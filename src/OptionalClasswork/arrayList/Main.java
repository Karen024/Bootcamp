package OptionalClasswork.arrayList;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation arrayListImplementation = new ArrayListImplementation();
        for (int i = 0; i < 15; i++) {
            arrayListImplementation.add(i);
        }
        arrayListImplementation.print();
        System.out.println();
        System.out.println(arrayListImplementation.size());
        System.out.println();
        arrayListImplementation.remove(5);
        arrayListImplementation.print();
        System.out.println();
        arrayListImplementation.set(2, 28);
        arrayListImplementation.print();
        System.out.println();
        System.out.println(arrayListImplementation.size());
        System.out.println();
        arrayListImplementation.sort();
        arrayListImplementation.print();

    }
}
