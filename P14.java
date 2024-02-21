import java.util.Arrays;
import java.util.Scanner;

class P14{

    public static int[] squaredsortedArray(int[] numArray){
        int low, high;
        low = 0;
        high = numArray.length-1;
        int[] sqrtSortedArr = new int[numArray.length];
        for(int i = numArray.length-1; i > -1; i--){
            if(Math.abs(numArray[low]) >= Math.abs(numArray[high])){
                sqrtSortedArr[i] = numArray[low] * numArray[low];
                low++;
            }else{
                sqrtSortedArr[i] = numArray[high] * numArray[high];
                high--;
            }
        }return sqrtSortedArr;

    }
    public static void main(String args[]){
        int size, element;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount for array: ");
        size = Integer.parseInt(in.nextLine());
        int[] numArray = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter an Integer: ");
            element = Integer.parseInt(in.nextLine());  
            numArray[i] = element;
        }
        System.out.println(Arrays.toString(squaredsortedArray(numArray)));
    }
}