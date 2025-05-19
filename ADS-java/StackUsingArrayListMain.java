package stackusingarraylistmain;
import java.util.ArrayList;
class StackUsingArrayList <T>{
    private ArrayList <T> list;
    public StackUsingArrayList(){
        list=new ArrayList<>();
    }
    public void push(T element){
        list.add(element);
    }
    public T pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return null;
        }
        return list.remove(size()-1);
    }
    public T peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return list.get(size()-1);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }
}
public class StackUsingArrayListMain {
    public static void main(String[] args) {
        StackUsingArrayList<Integer>stack=new StackUsingArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Popped element:"+stack.pop());
        System.out.println("Top element:"+stack.peek());
        System.out.println("Is stack empty?"+stack.isEmpty());
        System.out.println("Size of stack:"+stack.size());
    } 
}
