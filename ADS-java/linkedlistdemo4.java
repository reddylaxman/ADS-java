import java.util.*;
class linkedlistdemo4
{
public static void main(String[] args) 
{
LinkedList l=new LinkedList();
l.add("ashok");
l.add(30);
l.add(null);
l.add("ashok");
System.out.println(l);
l.set(0,"software");
System.out.println(l);
l.set(0,"venky");
System.out.println(l);
l.removeLast();
System.out.println(l);
l.addFirst("vvv");
System.out.println(l);
}
}