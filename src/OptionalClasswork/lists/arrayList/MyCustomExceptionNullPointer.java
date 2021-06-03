package OptionalClasswork.lists.arrayList;

public class MyCustomExceptionNullPointer extends RuntimeException{
    public void printMessage()
    {
        System.out.println("Dont pass null argument to method");
    }
}
