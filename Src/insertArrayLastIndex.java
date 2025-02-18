/*
 * Inserting at the End of an Array
/**
 *
 ^          @author Sudip
 */
public class insertArrayLastIndex {

    private static final int[] arr = new int[5];
    private static int length = 0;
    
    private static void insertAtEnd(int val){
        if(length < arr.length){
            arr[length] = val;
            length++;
        }else{
            System.out.println("Array is full! Cannot insert " + val);
        }
    }
    
    private static void PrintArr(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " contains " + arr[i]);
        }
    }
    
    public static void main(String... args) {
          insertAtEnd(2);
          insertAtEnd(5);
          insertAtEnd(10);
          insertAtEnd(3);
          insertAtEnd(7);
          
          PrintArr();
          
    }
}
