import java.util.Scanner;

public class P11 {

    public static int binarySearch(int[] numArray, int target){
        //int middle;
        int left = 0;
        int right = numArray.length-1;
        
        while (left <= right){
            int middle = (left+right)/2;
            //int middle = left + (right - left) / 2;
            if(numArray[middle] == target){
                return middle;
            }
            if(numArray[middle] < target){
                left = middle + 1;
            }else{
                right = middle - 1;
            }

        }return -1;

    }
    public static void main(String args[]){
        int size,element,target;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount for an array: ");
        size = Integer.parseInt(in.nextLine());
        int[] numArray = new int[size];
        for(int i = 0; i < numArray.length; i++){
            System.out.print("Enter an element: ");
            element = Integer.parseInt(in.nextLine());
            numArray[i] = element;
        }
        System.out.println("Enter the target: ");
        target = Integer.parseInt(in.nextLine());
        int res = binarySearch(numArray, target);
        if(res != -1){
            System.out.println("Element found at index " + res);
        }else{
            System.out.println("Element not found in the array");
        }
        

    }
    
}
