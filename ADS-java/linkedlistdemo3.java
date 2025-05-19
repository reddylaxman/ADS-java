import java.util.*; 
class linkedlistdemo3 
{ public static void main(String[] args) 
{ 
 LinkedList<String> arrl = new LinkedList<String>(); 
 arrl.add("First"); 
arrl.add("Second"); 
arrl.add("Third"); 
arrl.add("Random"); 
System.out.println("Actual LinkedList:"+arrl); 
LinkedList copy = (LinkedList) arrl.clone(); 
System.out.println("Cloned LinkedList:"+copy); 
 } 
}