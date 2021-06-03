package OptionalClasswork.lists.arrayList;

import java.util.Arrays;
import java.util.Objects;

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
        lastIndex = array.length;
    }

    @Override
    public T get(int index) {
        if (checkIndex(index)) return null;
        return array[index];
    }

    private boolean checkIndex(int index) {
        try {
            if (index < startIndex || index >= lastIndex) {
                throw new MyCustomExceptionIndexOutOfBounds();
            }
        } catch (MyCustomExceptionIndexOutOfBounds e) {
            e.printMessage();
            return true;
        }
        return false;
    }


    @Override
    public void add(T obj) {
        if (nullObjectCheck(obj)) return;
        expantionNeedCheck();
        array[actualIndex] = obj;
        actualIndex++;
    }

    private void expantionNeedCheck() {
        if (actualIndex == lastIndex - 1) {
            array = expandArray(array);
        }
    }

    public void remove(T obj) {
        if (nullObjectCheck(obj)) return;
        int index = -5;
        for (int i = startIndex; i < actualIndex; i++) {
            if (array[i] == obj) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            return;
        }
        for (int i = index; i < actualIndex; i++) {
            array[i] = array[i + 1];
        }
        actualIndex--;
    }

    private boolean nullObjectCheck(T obj) {
        try {
            if (obj == null) {
                throw new MyCustomExceptionNullPointer();
            }
        } catch (MyCustomExceptionNullPointer e) {
            e.printMessage();
            return true;
        }
        return false;
    }

    public void remove(int index) {
        if (checkIndex(index)) return;
        for (int i = index; i < actualIndex; i++) {
            array[i] = array[i + 1];
        }
        actualIndex--;
    }

    public int indexOf(T obj) {
        if (nullObjectCheck(obj)) return -1;
        for (int i = startIndex; i < actualIndex; i++) {
            if (array[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    public boolean compareTwoArrayLists(MyArrayList<T> array2) {
        if (this.equals(array2)) {
            return true;
        }
        return false;
    }

    public void joinTwoArrayLists(MyArrayList<T> array2) {
        for (int i = 0; i < array2.size(); i++) {
            this.add(array2.get(i));
        }
    }

    public void copyArrayList(MyArrayList<T> fromArray, MyArrayList<T> toArray) {
        if (notEnoughSpaceCheck(fromArray, toArray)) {
            return;
        }
        for (int i = 0; i < fromArray.size(); i++) {
            toArray.add(fromArray.get(i));
        }
    }

    public T[] capacityTrim() {
        if (this.size() == 0) {
            System.out.println("No element to trim");
        }
        T[] newArray = (T[]) new Object[this.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = this.get(i);
        }
        return newArray;
    }

    public int length() {
        return lastIndex + 1;
    }

    private boolean notEnoughSpaceCheck(MyArrayList<T> fromArray, MyArrayList<T> toArray) {
        try {
            if (toArray.length() < fromArray.length()) {
                throw new MyNotEnoughSpaceException();
            }
            return true;
        } catch (MyNotEnoughSpaceException e) {
            e.printMessage();
            return false;
        }
    }

    private T[] expandArray(T[] array) {
        T[] expandedArray = (T[]) new Object[array.length + 10];
        System.arraycopy(array, 0, expandedArray, 0, array.length);
        lastIndex = expandedArray.length - 1;
        return expandedArray;
    }

    public void reverseArray() {
        for (int i = 0; i < size() / 2; i++) {
            swapInArray(array[i], array[size() - i - 1]);
        }
    }

    public void swapInArray(T object1, T object2) {
        if (!this.contains(object1) || !this.contains(object2)) {
            System.out.println("No such elements");
            return;
        }
        int index1 = indexOf(object1);
        int index2 = indexOf(object2);
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
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

    public void setArray(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < actualIndex; i++) {
            result.append(this.get(i));
            if (i < actualIndex - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyArrayList)) return false;
        MyArrayList<?> that = (MyArrayList<?>) o;
        return SIZE_OF_ARRAY == that.SIZE_OF_ARRAY &&
                startIndex == that.startIndex &&
                actualIndex == that.actualIndex &&
                lastIndex == that.lastIndex &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(SIZE_OF_ARRAY, startIndex, actualIndex, lastIndex);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
