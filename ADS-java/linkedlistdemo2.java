import java.util.*;
class linkedlist
{ public static void main(String[] args) 
{ ArrayList<String> al = new ArrayList<String>(); 
al.add("ratan"); 
al.add("balu"); 
LinkedList<String> linked = new LinkedList<String>(al); 
linked.add("anu"); 
linked.add("simran"); 
System.out.println(linked); 
} 
}