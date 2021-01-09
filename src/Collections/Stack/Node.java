package Collections.Stack;

public class Node<E> {
    int data;
     E element;
     Node<E> next;
     Node<E> prev;

    public Node() {
    }

    public Node(int data, Node<E> next) {
        this.data = data;
        this.next = next;
    }

    public Node(E element, Node<E> prev, Node<E> next) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }
}
