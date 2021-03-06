package Collections.Queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class TestArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        Collections.addAll(deque, "GB", "DE", "FR", "ES");
        System.out.println(deque);
        System.out.println("deque.getFirst(): " + deque.getFirst());
        System.out.println(deque);
        System.out.println("deque.removeFirst(): " + deque.removeFirst());
        System.out.println(deque);
        System.out.println("deque.addFirst('IT'):");
        deque.addFirst("IT");
        System.out.println(deque);
        System.out.println("deque.getLast(): " + deque.getLast());
        System.out.println(deque);
        System.out.println();
        deque.addLast("IE");
        System.out.println(deque);
    }
}
