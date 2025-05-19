package queueusingarray;
import java.util.Arrays;
class ArrayQueue{
    private int[] items;
    private int[] rear;
    private int[] front;
    private int[] count;
    public ArrayQueue(int capacity){
        items=new int[capacity];
    }
    public void enqueue(int item){
        if(isFull()){
            throw new IllegalStateException();
        }
        items[rear]=item;
        rear++;
        count++;
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        var item=items[front];
        items[front]=0;
        front++;
        return item;
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException();
        }
        return items[front];
    }
    public boolean isEmpty(){
        return count==0;
    }
    public boolean isFull(){
        return count==items.length;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
public class Queueusingarray {
    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        queue.enqueue(60);
    }
    
}
