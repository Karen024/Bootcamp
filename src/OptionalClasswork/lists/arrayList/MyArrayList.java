package OptionalClasswork.lists.arrayList;

public class MyArrayList<T> implements List<T> {
    private T[] array;
    private final int SIZE_OF_ARRAY = 10;
    private int startIndex;
    private int actualIndex;
    private int lastIndex;

    public MyArrayList() {
        array = (T[]) new Object[SIZE_OF_ARRAY];
        startIndex = 0;
        actualIndex = 0;
        lastIndex = array.length - 1;
    }

    @Override
    public T get(int index) {
        try {
            checkIndex(index);
        } catch (MyCustomExceptionIndexOutOfBounds e) {
            e.printMessage();
            return null;
        }
        return array[index];
    }

    private void checkIndex(int index) {
        if (index < startIndex || index > actualIndex) {
            throw new MyCustomExceptionIndexOutOfBounds();
        }
    }

    @Override
    public void add(T obj) {
        try {
            nullObjectCheck(obj);
        } catch (MyCustomExceptionNullPointer e) {
            e.printMessage();
            return;
        }
        expantionNeedCheck();
        array[actualIndex] = obj;
        actualIndex++;
    }

    private void expantionNeedCheck() {
        if (actualIndex == lastIndex) {
            array = expandArray(array);
        }
    }

    public void remove(T obj) {
        try {
            nullObjectCheck(obj);
        } catch (MyCustomExceptionNullPointer e) {
            e.printMessage();
            return;
        }
        for (int i = startIndex; i < actualIndex; i++) {
            if (array[i] == obj) {
                array[i] = array[i + 1];
            }
        }
        actualIndex--;
    }

    public void remove(int index) {
        try {
            checkIndex(index);
        } catch (MyCustomExceptionIndexOutOfBounds e) {
            e.printMessage();
            return;
        }
        for (int i = index; i < actualIndex; i++) {
            array[i] = array[i + 1];
        }
        actualIndex--;
    }

    public int indexOf(T obj) {
        try {
            nullObjectCheck(obj);
        } catch (MyCustomExceptionNullPointer e) {
            e.printMessage();
            return -1;
        }
        for (int i = startIndex; i <= actualIndex; i++) {
            if (array[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    private void nullObjectCheck(T obj) {
        if (obj == null) {
            throw new MyCustomExceptionIndexOutOfBounds();
        }
    }


    private T[] expandArray(T[] array) {
        T[] expandedArray = (T[]) new Object[array.length + 10];
        System.arraycopy(array, 0, expandedArray, 0, array.length);
        lastIndex = expandedArray.length - 1;
        return expandedArray;
    }

    @Override
    public int size() {
        return actualIndex;
    }

    @Override
    public boolean contains(T obj) {
        try {
            nullObjectCheck(obj);
        } catch (MyCustomExceptionNullPointer e) {
            e.printMessage();
            return false;
        }
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < actualIndex; i++) {
            result.append(array[i]);
            if (i < actualIndex - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
