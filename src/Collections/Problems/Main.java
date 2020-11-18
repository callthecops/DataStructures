package Collections.Problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1:
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "First", "Second", "Third", "Second");

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
//        System.out.println(getLastFor(strings));
//        System.out.println(getLastIt(strings));
        //5
//        System.out.println(getElementAtFor(strings, 3));
//        System.out.println(getElementAtIt(strings, 3));
        //6.
        String[] array = {"one", "two", "three"};
        System.out.println(toCollection(array));
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

    //4:with for loop
    public static <E> E getLastFor(List<E> lIst) {
        E last = null;
        for (E element : lIst) {
            last = element;
        }
        return last;
    }

    //4:with iterator
    public static <E> E getLastIt(List<E> list) {

        E last = null;
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            last = (E) iterator.next();
        }
        return last;
    }

    //5:for loop
    public static <E> E getElementAtFor(List<E> list, int index) {
        E object = null;
        int counter = 0;
        for (E element : list) {
            if (index == counter) {
                object = element;
            }
            counter++;
        }
        return object;
    }

    //5:for loop
    public static <E> E getElementAtIt(List<E> list, int index) {
        E element = null;
        int i = 0;
        for (Iterator<E> iterator = list.iterator(); iterator.hasNext() && i++ <= index; ) {
            Object obj = iterator.next();
            element = (E) obj;
        }
        return element;
    }

    //6:
    public static <E> Collection<E> toCollection(E[] a) {

        return Arrays.asList(a);
    }
}
