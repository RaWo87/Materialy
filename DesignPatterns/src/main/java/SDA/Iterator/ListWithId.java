package SDA.Iterator;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.HashMap;

public class ListWithId<E> implements Iterator {
    private HashMap<Integer, E> map = new HashMap<>();
    private Integer key = 1;
    private Integer position = 0;

    public E getNext() {
        ArrayList<E> values = new ArrayList<>();
        values.addAll(map.values());
        E item = values.get(position);
        position++;
        return item;
    }

    public boolean hasNext() {
        if (position >= map.size() || map.get(position) == null) {
            position = 0;
            return false;
        }
        return true;
    }

    public void add(E obj) {
        map.put(key, obj);
        key++;
    }

    public void removeCurrent() {
        ArrayList<E> values = new ArrayList<>();
        values.addAll(map.values());
        E item = values.get(position);

        int keyToDelete =0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == item) {
                keyToDelete = key;
            }
        }
        map.remove(keyToDelete);
        position--;
    }
}
