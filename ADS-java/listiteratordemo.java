import java.util.*;
class listiteratordemo
{
public static void main(String[] args) 
{
LinkedList l=new LinkedList();
l.add("balakrishna");
l.add("venki");
l.add("chiru");
l.add("nag");
System.out.println(l);
ListIterator itr=l.listIterator();
while(itr.hasNext())
{
String s=(String)itr.next();
if(s.equals("venki"))
{
itr.remove();
}
}
System.out.println(l);
}
}