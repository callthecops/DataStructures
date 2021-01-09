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



    @Override
    public String toString() {
        return String.valueOf(data);
    }

}
