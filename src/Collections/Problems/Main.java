package Collections.Problems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1:
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "First", "Second", "Third");

//        int total = chars(strings);
//        System.out.println(total);
        //2:
        print(strings);

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
}
