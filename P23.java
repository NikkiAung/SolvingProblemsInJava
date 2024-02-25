//reversingArrayNumsWithoutLoop
import java.util.Arrays;

class P23{

    public static int[] revereArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int temp;
        while (left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
            
        }return arr;
    }
    public static void main(String args[]){
        int[] numbers = {2,11,5,10,7,8};
        System.out.println(Arrays.toString(revereArray(numbers)));
    }
}