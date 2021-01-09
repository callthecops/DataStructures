package Collections.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        StackExercices<String> stackExercices = new StackExercices<String>();
        Deque<String> strings = new ArrayDeque<>();
        strings.push("First");
        strings.push("Second");
        strings.push("third");

        for(String s : strings){
            System.out.println(s);
        }
        //5.8
//        Deque<String> reversed = StackExercices.reversed(strings);
        //5.10
        StackExercices.reverse(strings);
        System.out.println("in the main method");
        System.out.println(strings);




    }



}
