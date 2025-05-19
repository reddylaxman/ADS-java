package p1;
import java.util.ArrayList;
public class c1{
public static void main(String[] args) {
ArrayList al = new ArrayList();
al.add(10);
al.add("ratan");
al.add("anu");
al.add('a');
al.add(10);
al.add(null);
System.out.println("ArrayList data=" + al);
System.out.println("ArrayList size-->" + al.size());
al.add(1, "A1"); 
System.out.println("after adding objects ArrayList size-->" + al.size());
System.out.println("ArrayList Data=" + al);
al.remove(1); 
al.remove("A"); 
System.out.println("after removeing elemetns arrayList size " + al.size());
System.out.println("ArrayList data=" + al);
System.out.println(al.isEmpty());
al.clear();
System.out.println(al.isEmpty());
}
}