package queues;
import java.util.*;
//import java.util.ArrayDeque;
public class Queues {
    public static void main(String[] args) {
        Queue<Integer>queue=new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        var front = queue.remove();
        System.out.println(front);
        System.out.println(queue);  
    }
    
}
