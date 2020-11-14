package LinkedList;

import java.util.StringJoiner;

public class LinkedList {
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
    public Node concat(Node nodeChain1, Node nodeChain2) {
        //Check if node chains are null first, then...
        if (nodeChain1 == null || nodeChain2 == null) {
            throw new IllegalArgumentException();
        }
        //We need newNodeChain to point always to the first node from the first nodeChain1 and that is because
        //the nodes are reference only in one direction wich means we have to return the first node in order
        //to have all the next node.If we return the last node , that one doesn't reference anything and we
        //receive only the last node.
        Node newNodeChain = new Node(nodeChain1.data);
        //then we have a current node wich allows us to append new nodes to the chain.
        Node currentNode = newNodeChain;

        while (nodeChain1.next != null) {
            //first we assign to nodeChain1 the value of the next node of nodechain1
            nodeChain1 = nodeChain1.next;
            //Then we create a new node and pass it the data from the next nodeChain1.
            Node nextNode = new Node(nodeChain1.data);
            //Then we assign that new node to the new list we want to create when we say that the new node in that
            //list is the nextNode;
            currentNode.next = nextNode;
            //And then we make newNodeChain point in the next iteration to the next node that we just added.
            currentNode = currentNode.next;

        }

        while (nodeChain2.next != null) {
            nodeChain2 = nodeChain2.next;
            Node nextNode = new Node(nodeChain2.data);
            currentNode.next = nextNode;
            currentNode = currentNode.next;
        }
        return newNodeChain;
    }

    //9>Set
    public void set(Node list, int i, int x) {
        int count = 0;
        while (list.next != null) {
            if (i == count) {
                list.data = x;
            }
            list = list.next;
            count++;
        }
    }

    //10.get
    public int get(Node list, int i) {
        if (list == null) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        int value = 0;
        while (list.next != null) {
            if (i == counter) {
                value = list.data;
            }

            list = list.next;
            counter++;
        }
        return value;
    }

    //11.
    public void put(Node list, int i, int x) {
        if (list == null) {
            throw new IllegalArgumentException();
        }
        int counter = 0;
        while (list.next != null) {
            if (i - 1 == counter) {
                Node rightChain = list.next;
                Node newNode = new Node(x);
                list.next = newNode;
                newNode.next = rightChain;
            }
            list = list.next;
            counter++;
        }
    }

    //12.
    public void swap(Node list, int i, int j) {
        System.out.println("This starts swap method");
        System.out.println(toString(list));
        System.out.println(list);
        System.out.println(i);
        System.out.println(j);

        if (list == null) {
            throw new IllegalArgumentException();
        }
        System.out.println(getNode(list,i).data);
        System.out.println("here ends swap method");
    }

    public Node getNode(Node list, int index) {
        for (int i = 0; i < index; i++) {
            list = list.next;
        }
        return list;
    }



    public String toString(Node list) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        Node node = list;
        while (node != null) {
            sj.add(node.toString());
            node = node.next;
        }
        return sj.toString();
    }


}
