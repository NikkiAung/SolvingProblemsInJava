//findingMissingNumber
class P46{
    public static int findingMissingNum(int[] nums){

        int index = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]-1){
                index = i;
                break;
            }
        }return index == -1 ? '\u0000': nums[index+1]-1;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,6,7,8};
        System.out.println(findingMissingNum(nums));
    }
}