package Assignment_17_Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Program_4 {
    public static void main(String[] args) {

        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        System.out.println("Original list : "+list);

        ListIterator<Character> iterator = list.listIterator(list.size());

        LinkedList<Character> reveredList = new LinkedList<>();

        while(iterator.hasPrevious())
        {
            reveredList.add(iterator.previous());
        }

        list.clear();
        list.addAll(reveredList);

        System.out.println("Reversed List : "+list);
    }
}
