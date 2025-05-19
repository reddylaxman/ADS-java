package p2;
import java.util.ArrayList;
public class c2{
public static void main(String[] args) {
Emp e1 = new Emp(111, "ratan");
Student s1 = new Student(222, "xxx");
ArrayList al = new ArrayList();
al.add(10); //toString()
al.add('a'); //toString()
al.add(e1); //toString()
al.add(s1); //toString()
System.out.println(al);
System.out.println(al.toString());
}
}