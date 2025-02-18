
public class ReplaceElement {

    public int[] ReplaceElement_GreatestElement(int[] arr){
        int len = arr.length;
        int k = 0;
        arr[len-1] = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < Math.max(i+1, len-2)) {
                arr[k] = arr[i];
                k++;
            }
        }

        
        return arr;
    }
    
}