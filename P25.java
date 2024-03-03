//Both of the solution are leading to move the zero including in the array to the right
import java.util.Arrays;

//#1
class P25{

    public static int[] removingZeroToRight(int[] nums){
        int temp;
        int counterZero = 0;
        for(int j = 0; j < nums.length-1; j++){
            if(nums[j] == 0);
                counterZero++;
        }
        for(int j = 0; j < counterZero; j++){
            for(int i = 0; i < nums.length-1; i++){
                if(nums[i] == 0){
                    temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
    
                }
            }

        }return nums;

    }
    public static void main(String args[]){
        int[] nums = {0,1,0,4,12,0};
        System.out.println(Arrays.toString(removingZeroToRight(nums)));
    }
}

//#2
class Tester1{

    public static int[] movingZero(int[] nums, int n){
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0 && nums[j] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }if(nums[j] != 0){
                j++;
            }
        }return nums;
    }
    public static void main(String args[]){
        int[] nums = {8,1,0,0,2,1,};
        int length = nums.length;
        System.out.println(Arrays.toString(movingZero(nums, length)));
    }
}
