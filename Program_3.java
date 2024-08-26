package Assignment_17_Linkedlist;

import java.util.LinkedList;

public class Program_3 {
    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList<>();

        for(int i=1;i<=10;i++)
        {
            list.add(i);
        }

        System.out.println("Original List   : "+list);

        list.remove(2);
        list.remove(list.size()-1);

        System.out.println("Resulting List  : "+list);
    }
}
