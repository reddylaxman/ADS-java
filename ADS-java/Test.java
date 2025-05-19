import java.util.*;
public class Test{ 
public static void main(String[] args){
ArrayList<String> al =new ArrayList<String>();
al.add("ratan");
al.add("anu");
al.add("sravya");

//1st appraoch to print Collection data
for (String a : al ){
System.out.println(a);
}

//2nd approach to print Collection data
int size = al.size();
for (int i=0;i<size;i++){
System.out.println(al.get(i));
}

//3rd approach to print Collection data
//normal version of Iterator(type casting required at the time of retrieving)
Iterator itr1 = al.iterator(); 
while (itr1.hasNext()){
String str =(String)itr1.next(); 
System.out.println(str);
}

//generic version of Iterator(type casting not required at the time of retrieving)
Iterator<String> itr2 = al.iterator(); 
while (itr2.hasNext()){
String str =itr2.next(); 
System.out.println(str);
}
}
}