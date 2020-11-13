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
        Exercices exercices = new Exercices();
        //1.
//        System.out.println(exercices.size(start) + "\n");
//        //2.
//        System.out.println(exercices.sum(start) + "\n");
//        //3.
//        exercices.removeLast(start);
//        System.out.println(exercices.size(start) + "\n");
//        //4.
//        Node asd = exercices.copy(start);
//        System.out.println(exercices.size(asd) + "\n");
//        //5.
//        Node theNode = exercices.sublist(start, 0, 5);
//        System.out.println(exercices.sum(theNode));
//        //6.
//        Node startHere = new Node(1);
//        Node pointer = startHere;
//        pointer.next = new Node(2);
//        pointer = pointer.next;
//        pointer.next = new Node(3);
//        Node ex6 = exercices.concat(start,startHere);
//        System.out.println(exercices.sum(ex6));

        //8
//        exercices.set(start,3,666);
//        while (start.next != null){
//            System.out.println(start.data);
//            start=start.next;
//        }

        //10
//        int number = exercices.get(start,1);
//        System.out.println(number);

        //11
        exercices.put(start, 1, 666);
        while (start.next != null) {
            System.out.println(start.data);
            start = start.next;
        }
        //12.
//        exercices.swap(start,1,3);
//        while (start.next != null) {
//            System.out.println(start.data);
//            start = start.next;
//    }
}}
