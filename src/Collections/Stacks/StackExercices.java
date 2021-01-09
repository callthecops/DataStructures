package Collections.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExercices<E> {
    //5.8
    public static <E>Deque <E> reversed(Deque<E> stack){
        Deque<E> reversedQueue = new ArrayDeque<>();
         for(E item : stack){
             reversedQueue.push(item);
        }
         return reversedQueue;
    }

    //5.10
    public static <E> void reverse(Deque<E> stack){
        Deque<E> reversedQueue = new ArrayDeque<>();
        for(E item : stack){
            reversedQueue.push(item);
        }
        stack = reversedQueue;
        System.out.println("Inside the reverse method");
        System.out.println(stack);
    }

    //5.11
    public static <E> E penultimate(Deque<E> stack){
        
    }
}
