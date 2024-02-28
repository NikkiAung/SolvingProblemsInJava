//selectionSort #dataStructure&Algorithm
import java.util.Arrays;

class Tester1{

    public static int[] selectionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int mini = i;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[mini]){
                    mini = j;
                }
            }int temp = nums[i];
            nums[i] = nums[mini];
            nums[mini] = temp;
        }return nums;


    }
    public static void main(String args[]){
        int[] numArr = {4,5,3,6,1,19};
        System.out.println(Arrays.toString(selectionSort(numArr)));
    }
}