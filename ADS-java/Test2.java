import java.util.*;
class Test2 
{ public static void main(String[] args) 
{ ArrayList<String> al =new ArrayList<String>();
al.add("ratan");
al.add("anu");
al.add("sravya");
ListIterator<String> lstr = al.listIterator();
System.out.println("printing data forward direction");
while(lstr.hasNext())
{ System.out.println(lstr.next());
}
System.out.println("printing data backward direction");
while(lstr.hasPrevious())
{ System.out.println(lstr.previous());
}
}
}