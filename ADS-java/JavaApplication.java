import java.util.*;
package javaapplication;
public class LinkedList{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String>l1=new LinkedList<String>();
        l1.add("Mahi");
        l1.add("Sara");
        l1.addLast("Vani");
        l1.addFirst("Rama");
        l1.add(2,"Krish");
        l1.display();
        l1.remove("Sara");
        l1.remove(3);
        l1.removeFirst();
        l1.removeLast();
        l1.display();
    }
    
}
