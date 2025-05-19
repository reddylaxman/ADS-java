import java.util.*;
class Test1 
{ public static void main(String[] args) 
{ ArrayList<String> al =new ArrayList<String>();
al.add("ratan");
al.add("anu");
al.add("sravya");
ListIterator<String> lstr = al.listIterator();
lstr.add("suneel");
while(lstr.hasNext())
{ if ((lstr.next()).equals("anu"))
{ lstr.set("Anushka");
}
}
lstr.add("aaa");
for (String str:al)
{ System.out.println(str); }
}
}