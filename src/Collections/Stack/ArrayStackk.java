package Collections.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStackk<E> extends Stack<E> {

    private E[] elements;
    private int size;
    private static final int INITIAL_CAPACITY = 100;

    public ArrayStackk() {
        elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public ArrayStackk(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public E peek() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }

    public E push(E element) {
        if (size == elements.length) {
            resize();
        }
        elements[size++] = element;
        return element;
    }



    public int size() {
        return size;
    }

    public void resize() {
        assert size == elements.length;
        //Because generic arrays are not supported in java we have to first initialize it as an object array and then cast
        //it to an generic(E) array.
        Object[] a = new Object[2 * size];
        System.arraycopy(elements, 0, a, 0, size);
        elements = (E[]) a;
    }
}
