import java.util.*;
public class LinkedList{
    public static void main(String[]args){
        LinkedList<String>l1=new LinkedList<String>();
        l1.add("Mahi");
        l1.add("Sara");
        l1.addLast("Vani");
        l1.addFirst("Rama");
        l1.add(2,"Krish");
        System.out.println(l1);
        l1.remove("Sara");
        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
    }
    
}
