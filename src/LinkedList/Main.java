package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node start = new Node(22);
        //P is used for pointer, and is used to "walk through the list";
        Node p = start;
        //adding a new Node with a value of 33 linked to the previous "start" Node.
        p.next = new Node(33);
        p = p.next;
        p.next = new Node(44);
        p = p.next;
        p.next = new Node(55);
        p = p.next;
        p.next = new Node(66);
        p = p.next;

        Node start2 = new Node(77);
        //P is used for pointer, and is used to "walk through the list";
        Node pp = start2;
        //adding a new Node with a value of 33 linked to the previous "start" Node.
        pp.next = new Node(88);
        pp = pp.next;
        pp.next = new Node(99);
        pp = pp.next;
        pp.next = new Node(11);
        pp = pp.next;
        pp.next = new Node(22);
        pp = pp.next;

//
//        Node start = new Node(22), p = start;
//        for (int i = 0; i < 4; i++) {
//            p = p.next = new Node(33 + 11 * i);
//        }
//
//        for (p = start; p != null; p = p.next) {
//            System.out.println(p.data);
//        }
//
        LinkedList linkedList = new LinkedList();
        //1.
//        System.out.println(linkedList.size(start) + "\n");
//        //2.
//        System.out.println(linkedList.sum(start) + "\n");
//        //3.
//        linkedList.removeLast(start);
//        System.out.println(linkedList.size(start) + "\n");
//        //4.
//        Node asd = linkedList.copy(start);
//        System.out.println(linkedList.size(asd) + "\n");
//        //5.
//        Node theNode = linkedList.sublist(start, 0, 5);
//        System.out.println(linkedList.sum(theNode));
//        //6.
//        Node startHere = new Node(1);
//        Node pointer = startHere;
//        pointer.next = new Node(2);
//        pointer = pointer.next;
//        pointer.next = new Node(3);
//        Node ex6 = linkedList.concat(start,startHere);
//        System.out.println(linkedList.sum(ex6));

        //8
//        linkedList.set(start,3,666);
//        while (start.next != null){
//            System.out.println(start.data);
//            start=start.next;
//        }

        //10
//        int number = linkedList.get(start,1);
//        System.out.println(number);

        //11
//        linkedList.put(start, 0, 666);
//        while (start.next != null) {
//            System.out.println(start.data);
//            start = start.next;
//        }
        //12.
//        linkedList.swap(start, 1, 3);
//        while (start.next != null) {
//            System.out.println(start.data);
//            start = start.next;
//        }

        //13.
//        Node list = linkedList.merged(start, start2);
//        while (list.next != null) {
//            System.out.println(list.data);
//            list = list.next;
//        }

        //14.

        linkedList.rotateLeft(start);
        while (start.next != null) {
            System.out.println(start.data);
            start = start.next;
        }

    }

}
