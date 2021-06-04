package OptionalClasswork.lists.doubleLinkedlist.interfaces;

import OptionalClasswork.lists.doubleLinkedlist.MyDoubleLinkedList;

public interface Deque<T> {

    void addFirst(T t);

    void addLast(T t);

    T getFirst();

    void addDeque(T t);

    T getLast();

    void removeFirst();

    void removeLast();

    void removeFirstOccurrence(T t);

    void removeLastOccurrence(T t);

    boolean addAll(MyDoubleLinkedList<T> list);

    int getSize();

}
