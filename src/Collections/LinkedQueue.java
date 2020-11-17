package Collections;

import java.util.*;

public class LinkedQueue<E> extends AbstractQueue<E> implements Queue<E> {
    private List<E> list = new LinkedList<E>();

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean offer(E e) {
        if (e == null) {
            return false;
        } else {
            list.add(e);
            return true;
        }
    }

    @Override
    public E poll() {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.remove(0);
        }
    }

    @Override
    public E peek() {
        return list.get(0);
    }

}
