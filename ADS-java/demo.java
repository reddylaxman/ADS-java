import java.util.*;
class demo{
public static void main(String[] args) {
Vector v=new Vector();
for(int i=0;i<=10;i++){
v.addElement(i);
}
System.out.println(v);
Enumeration e=v.elements();
while(e.hasMoreElements()){
Integer i=(Integer)e.nextElement();
if(i%2==0)
System.out.println(i);//0 2 4 6
}
System.out.print(v);
}
}