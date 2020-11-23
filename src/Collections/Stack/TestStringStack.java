package Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestStringStack {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<String>();
        stack.push("GB");
        stack.push("AT");
        stack.push("FR");
        stack.push("RO");
        for(String s :stack){
            System.out.println(s);
        }
        System.out.println(stack);
        System.out.println("stack.peek(): " + stack.peek());
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println(stack);
        System.out.println("stack.pop(): " + stack.pop());
        System.out.println(stack);
        System.out.println("stack.push(\"IE\"):");
        stack.push("IE");
        System.out.println(stack);
    }

}
