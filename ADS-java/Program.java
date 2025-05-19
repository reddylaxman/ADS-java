package hashset;
import java.util.HashSet;
public class Program {
    public static void main(String[] args) {
        HashSet<String>hash=new HashSet<>();
        hash.add("castle");
        hash.add("bridge");
        hash.add("castle");
        hash.add("moat");
        System.out.println(hash.size());
        System.out.println(hash.contains("castle"));
        System.out.println(hash.contains("bridge"));
        System.out.println(hash.contains("moat"));
    }
    
}
