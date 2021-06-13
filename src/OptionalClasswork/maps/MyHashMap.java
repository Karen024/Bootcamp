package OptionalClasswork.maps;

import java.util.*;

public class MyHashMap<K, V> {
    private Entry<K, V>[] array;
    private int pointerOfEmpty;
    private final float LOAD_FACTOR = 0.75f;
    private int forHashCalculation;

    public MyHashMap() {
        array = new Entry[16];
        pointerOfEmpty = 0;
        forHashCalculation = 16;
    }

    private class Entry<K, V> {
        private final K key;
        private V value;
        Entry<K, V> next;

        public Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public V getValue() {
            return value;
        }

        public K getKey() {
            return key;
        }

        public Entry<K, V> getNext() {
            return next;
        }

        public void setNext(Entry<K, V> next) {
            this.next = next;
        }

        public void setValue(V value) {
            this.value = value;
        }


        @Override
        public int hashCode() {
            return Objects.hash(key, value, next);
        }
    }

    public void put(K key, V value) {
        expandIfNecessary();
        int hash = key.hashCode();
        Entry<K, V> entry = new Entry<>(key, value, null);
        int index = createIndex(hash);
        if (array[index] == null) {
            array[index] = entry;
        } else {
            Entry<K, V> current = array[index];
            boolean changed = false;
            addToArray(entry, current, changed);
        }
        pointerOfEmpty++;
    }

    private void addToArray(Entry<K, V> entry, Entry<K, V> current, boolean changed) {
        while (true) {
            if (entry.getValue() == current.getValue() || changed == false) {
                current.setValue(entry.getValue());
                changed = true;
                break;
            }
            if (current.getNext() == null) {
                break;
            }
        }
        if (changed == false) {
            current.setNext(entry);
        }
    }

    private void expandIfNecessary() {
        if (pointerOfEmpty >= array.length * 0.75) {
            Entry<K, V>[] newArray;
            newArray = Arrays.copyOf(array, array.length + 16);
            array = newArray;
            changeHashCalculation();
        }
    }

    public V get(K key) {
        int hash = key.hashCode();
        int index = createIndex(hash);
        if (array[index] == null) {
            return null;
        } else {
            Entry<K, V> current = array[index];
            return getValue(key, current);
        }
    }

    private V getValue(K key, Entry<K, V> current) {
        while (current != null) {
            if (current.getKey() == key) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public void remove(K key) {
        int hash = key.hashCode();
        int index = createIndex(hash);
        if (array[index] == null) {
            return;
        } else {
            Entry<K, V> current = array[index];
            removeCases(key, index, current);
            return;
        }
    }

    private void removeCases(K key, int index, Entry<K, V> current) {
        if (current.getKey() == key) {
            array[index] = current.getNext();
            current.setNext(null);
        }
        while (current.getNext() != null) {
            if (current.getNext().getKey() == key) {
                Entry<K, V> temp = current.getNext();
                current.setNext(current.getNext().getNext());
                temp.setNext(null);
            }
            current = current.getNext();
        }
    }

    private int createIndex(int hash) {
        return hash % forHashCalculation;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            entrySet.add(array[i]);
        }
        return entrySet;
    }

    @Override
    public String toString() {
        Set<Entry<K, V>> entrySet = this.entrySet();
        StringBuilder result = new StringBuilder("{");
        Iterator<Entry<K, V>> iterator = entrySet.iterator();
        Entry<K, V> first = iterator.next();
        stringBuilding(result, (Entry<K, V>) first);
        entrySetItertion(result, iterator);
        result.append(" }");
        return result.toString();
    }

    private void entrySetItertion(StringBuilder result, Iterator<Entry<K, V>> iterator) {
        while (iterator.hasNext()) {
            Entry<K, V> current = iterator.next();
            if (current == null) {
                break;
            }
            result.append(" , ");
            stringBuilding(result, current);
        }
    }

    private void stringBuilding(StringBuilder result, Entry<K, V> first) {
        result.append(first.key);
        result.append(" = ");
        result.append(first.value);
    }

    private void changeHashCalculation() {
        forHashCalculation += 16;
    }
}

