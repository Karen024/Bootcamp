package OptionalClasswork.lists.doubleLinkedlist.interfaces;

import OptionalClasswork.lists.doubleLinkedlist.MyDoubleLinkedList;

public interface List<T> {
    T get(int index);

    void add(T obj);

    void remove(int index);

    void remove(T obj);

    void removeAll(T obj);

    void swapElements(T obj1, T obj2);

    void joinTwoLists(MyDoubleLinkedList<T> list);

    void clone(MyDoubleLinkedList<T> list2);

    int getSize();

    int size();

    boolean contains(T obj);
}
