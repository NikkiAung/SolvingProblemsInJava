import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class P7 {

    public static ArrayList<Integer> displaySequential(int low, int high){
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= 9; i++){
            int num = i;
            int nextDigitNum = i+1;
            while(num <= high && nextDigitNum <= 9){
                num = num * 10 + nextDigitNum;
                if(low <= num && num <= high){
                    arr.add(num);

                }nextDigitNum++;
                
        }
       
        }Collections.sort(arr);
        return arr;
    }
    public static void main(String args[]){
        int low, high;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the low num: ");
        low = Integer.parseInt(in.nextLine());
        System.out.println("Enter the high num: ");
        high = Integer.parseInt(in.nextLine());
        ArrayList<Integer> res  = displaySequential(low, high);
        System.out.println(res);

    }
    
}
