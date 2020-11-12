package LinkedList;

public class LinkedList {
    private Node start;

    public Node insert(int value) {
        if (start == null || start.data > value) {
            start = new Node(value, start);
        }
        Node p = start;
        while (p.next != null) {
            if (p.next.data > value) break;
            p = p.next;
        }
        p.next = new Node(value, p.next);
        return start;
    }

    public Node delete(int x) {
        if (start == null || start.data > x) {
            return start;
        } else if (start.data == x) {
            return start.next;
        }
        for (Node p = start; p.next != null; p = p.next) {
            if (p.next.data > x) {
                break;
            } else if (p.next.data == x) {
                p.next = p.next.next;
                break;
            }
        }
        return start;
    }

    public static class Node {
        int data;
        Node next;


        Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
}
