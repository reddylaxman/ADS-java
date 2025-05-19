import java.util.*; 
class linkedlistdemo
{ public static void main(String[] args) 
{ LinkedList<String> l=new LinkedList<String>(); 
l.add("B");
l.add("C");
l.add("D");
l.add("E");
l.addLast("Z");//it add object in last position
l.addFirst("A");//it add object in first position
l.add(1,"A1");//add the Object spcified index
System.out.println("original content:-"+l);
l.removeFirst(); //remove first Object 
l.removeLast(); //remove last t Object 
System.out.println("after deletion first & last:-"+l); 
l.remove("E"); //remove specified Object
l.remove(2); //remove the object of specified index
System.out.println("after deletion :-"+l);//A1 B D 
String val = l.get(0); //get method used to get the element
l.set(2,val+"cahged");//set method used to replacement
System.out.println("after seting:-"+l);
} 
};