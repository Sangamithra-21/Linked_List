package Assignment_17_Linkedlist;

import java.util.LinkedList;

public class Program_1 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        linkedList.add(25);

        System.out.println("First Element : "+linkedList.getFirst());
        System.out.println("Last Element  : "+linkedList.getLast());



    }
}
