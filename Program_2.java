package Assignment_17_Linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Program_2 {
    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext())
        {
            String str=iterator.next();
            if(str.equals("three"))
            {
                iterator.set("THREE");
            }
        }

        System.out.println("Updated List : "+list);

    }
}
