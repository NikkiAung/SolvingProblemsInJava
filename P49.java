//Finding Concatenation Of Numbers
import java.util.Arrays; 

class P49 {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length*2];
        int counter = 0;
        int j = 0;
        while(counter < 2){
            for(int i = 0; i < nums.length; i++){
                newNums[j] = nums[i];
                j++;
            }j = nums.length;
            counter++;
        }return newNums;
        
    }

    public static void main(String args[]){
        P49 p = new P49();
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(p.getConcatenation(nums)));
    }
}