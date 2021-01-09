package Collections.Stacks;

import Collections.Stack.ArrayStackk;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackExercices<String> stackExercices = new StackExercices<String>();
        Deque<String> strings = new ArrayDeque<>();
        strings.push("First");
        strings.push("Second");
        strings.push("third");
        strings.push("fourth");

//        for(String s : strings){
//            System.out.println(s);
//        }
        //5.8
//        Deque<String> reversed = StackExercices.reversed(strings);
        //5.10
//        StackExercices.reverse(strings);
//        System.out.println("in the main method");
//        System.out.println(strings);

        //5.11
//        String abc = StackExercices.penultimate(strings);
//        System.out.println(abc);

        //5.12
//        String abc = StackExercices.popPenultimate(strings);
//        System.out.println(abc);
//        for (String s : strings) {
//            System.out.println(s);
//        }


        //5.13
//        String bottom = StackExercices.bottom(strings);
//        System.out.println(bottom);

        //5.14

    }
}