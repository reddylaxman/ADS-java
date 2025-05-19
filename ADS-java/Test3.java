import java.util.*; 
class Test3 
{ public static void main(String[] args) 
{ ArrayList<String> al =new ArrayList<String>();
al.add("ratan");
al.add("anu");
al.add("sravya");
ListIterator<String> lstr = al.listIterator();
while(lstr.hasNext())
{ if ((lstr.next()).equals("ratan"))
{ lstr.remove();
}
}
for (String str:al)
{ System.out.println(str);
}
}
}