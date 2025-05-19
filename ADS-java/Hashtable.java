package hashtable;
import java.util.Hashtable;
public class Hashtable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hash = new Hashtable<>();
 hash.put("cat", 10);
 hash.put("dog", 15);
 int value = hash.get("cat");
 System.out.println(value);
    }
    
}
