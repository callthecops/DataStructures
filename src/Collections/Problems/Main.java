package Collections.Problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1:
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "First", "Second", "Third","Second");

//        int total = chars(strings);
//        System.out.println(total);
        //2:
        //print(strings);
//        //3
//        int first = frequencyFor(strings, "Second");
//        System.out.println(first);
//        int second = frequencyIt(strings, "Second");
//        System.out.println(second);
        //4

    }

    //1:
    public static int chars(List<String> stringList) {
        int totalChars = 0;
        for (String string : stringList) {
            for (int i = 0; i < string.length(); i++) {
                totalChars++;
            }
        }
        return totalChars;
    }

    //2:
    public static void print(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("Object: " + obj);
        }
    }

    //3:with enhanced for loop
    public static <E> int frequencyFor(Collection<E> c, E e) {
        int count = 0;
        for (E object : c) {
            if (object.equals(e)) {
                count = count + 1;
            }
        }
        return count;
    }

    //3:with iterator
    public static <E> int frequencyIt(Collection<E> c, E e) {
        Iterator iterator = c.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj.equals(e)) {
                count++;
            }
        }
        return count;
    }
    //4:
}
