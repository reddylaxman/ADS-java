package arrayoperations;
import java.util.Arrays;
public class ArrayOperations {
    public static void main(String[] args) {
    int[] array={5,2,8,1,3};
    Arrays.sort(array);
    System.out.println("Sorted array:"+Arrays.toString(array));
    String arrayAsString=Arrays.toString(array);
    System.out.println("Array as string:"+arrayAsString);
    int index=Arrays.binarySearch(array,3);
    System.out.println("Index of 3:"+index);
    int[] filledArray=new int[5];
    Arrays.fill(filledArray,10);
    System.out.println("Filled array:"+Arrays.toString(filledArray));
    }
    
}
