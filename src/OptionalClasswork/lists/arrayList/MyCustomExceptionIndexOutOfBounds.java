package OptionalClasswork.lists.arrayList;

public class MyCustomExceptionIndexOutOfBounds extends RuntimeException {
    public void printMessage() {
        System.out.println("Your index is out of bounds for this array pls try again");
    }
}
