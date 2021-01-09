package Collections.Stacks;

import Collections.Stack.ArrayStackk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

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
        stack.pop();
       return stack.peek();
    }
    //5.12
    public static <E> E popPenultimate(Deque<E> stack){
        stack.pop();
        return stack.pop();
    }

    //5.13
    public static <E> E bottom(Deque<E> stack) {
        Stack<E> stack1 = new ArrayStackk<>();
        for (E element : stack) {
            stack1.push(element);
        }

        return stack1.peek();
    }

    //5.14
    public static <E> E popBottom(Deque<E> stack){
        Stack<E> stack1 = new ArrayStackk<>();
        for (E element : stack) {
            stack1.push(element);
        }

        return stack1.pop();
    }

    //5.15


}
