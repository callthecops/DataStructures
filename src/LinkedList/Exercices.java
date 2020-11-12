package LinkedList;

public class Exercices {
    //1.
    public int size(Node list) {
        int counter = 0;
        while (list.next != null) {
            counter++;
            list = list.next;
        }
        return counter;
    }

    //2.
    public int sum(Node list) {
        int sum = 0;
        while (list.next != null) {
            sum += list.data;
            list = list.next;
        }
        return sum;
    }

    //3.
    public void removeLast(Node list) {
        if (list == null || list.next == null) {
            throw new IllegalStateException();
        }
        while (list.next.next != null) {
            list = list.next;
        }
        list.next = null;
    }

    //4.
    public Node copy(Node list) {
        if (list == null) {
            return null;
        }
        Node clone = new Node(list.data);
        for (Node p = list, q = clone; p.next != null; p = p.next, q = q.next) {
            q.next = new Node(p.next.data);
        }
        return clone;
    }

    //5.Node sublist
    public Node sublist(Node list, int start, int end) {
        if (start < 0 || end < start) {
            throw new IllegalArgumentException();
        } else if (end == start) {
            return null;
        }
        for (int i = 0; i < start; i++) {
            list = list.next;
        }
        Node clone = new Node(list.data);
        Node p = list, q = clone;
        for (int i = start + 1; i < end; i++) {
            if (p.next == null) {
                throw new IllegalArgumentException();
            }
            q.next = new Node(p.next.data);
            p = p.next;
            q = q.next;
        }
        return clone;
    }

    //6.
    public void append(Node list1, Node list2) {
        if (list1 == null) {
            throw new IllegalArgumentException();
        }
        while (list1.next != null) {
            list1 = list1.next;
        }
        list1.next = list2;
    }

    //7.
    public Node concat(Node list1, Node list2) {
        Node list3 = null;
        if (list1 == null && list2 == null) {
            throw new IllegalArgumentException();
        }
        while (list1.next != null) {
            list1 = list1.next;
            list3 = list1;
        }
        while (list2.next != null) {
            list2 = list2.next;
            list3 = list2;
        }
        return list3;
    }

}
