package Collections.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAutoBoxing {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 22, 33, 44, 55, 66);
        System.out.printf("list:         %s%n",list);
        System.out.printf("list:         %s%n",list.size());
        System.out.printf("list:         %s%n",list.get(2));
        int n =list.get(2);
        System.out.printf("list:         %s%n",n);
        list.remove(2);
        System.out.printf("list:         %s%n",list.size());
        list.remove(new Integer(66));




    }
}
