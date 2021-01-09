package Collections.Stack;


import java.util.EmptyStackException;
import java.util.Stack;

public class LinkedStack<E> extends Stack<E> {
    private final Node<E> head = new Node<E>();
    private int size;

    public boolean isEmpty() {
        return (size == 0);
    }

    public E peek() {
        if(size == 0){
            throw new java.util.EmptyStackException();
        }
        return head.prev.element;
    }

    public E pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        E element = head.prev.element;
        head.prev = head.prev.prev;
        head.prev.next = head;
        --size;
        return element;
    }

    public void pushh(E element){
        head.prev = head.prev.next = new Node<E>(element,head.prev,head);
        ++size;
    }

    public int size(){
        return size;
    }

    public void reverse(){

    }





}
