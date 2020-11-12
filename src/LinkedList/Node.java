package LinkedList;

//Node class is self referential.Each node object contains a field that is a reference to a Node object.
public class Node {
    //data is the variable wich holds the value and can be of any type.Here it is an int.
    int data;
    Node next;


    Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }



    public Node delete(Node start, int x) {
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
}
