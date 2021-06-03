package OptionalClasswork.lists.arrayList;

public interface List<T> {
    T get(int index);

    void add(T obj);

    void remove(int index);

    void remove(T obj);

    int size();

    boolean contains(T obj);
}
