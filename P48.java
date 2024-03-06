//finding Missing Number After selection sort

//#1 is my own logical apporach to problem while #2 is based on mathematical concept#crd

//#1
class P48{
    public static int findingMissingNum(int[] nums){
        //int miniIndex = 0;
        for(int i = 0; i < nums.length; i++){
            int miniIndex = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] < nums[miniIndex]){
                    miniIndex = j;
                }
            }int temp = nums[i];
            nums[i] = nums[miniIndex];
            nums[miniIndex] = temp;
        }

        int index = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != nums[i+1]-1){ //(nums[i] + 1 != nums[i + 1])
                index = i;
                break;
            }
        }return index == -1 ? '\u0000': nums[index+1]-1;
    }
    public static void main(String args[]){
        int[] nums = {2,4,1,8,6,3,7};
        System.out.println(findingMissingNum(nums));
    }
}

//#2
class Tester1{

    public static int findingMissingNum(int[] nums){
        int n = nums.length+1;
        int sum = n*(n+1)/2;
        for(int no : nums ){
            sum = sum - no;

        }return sum;
    }
    public static void main(String args[]){
        int[] nums = {2,4,1,8,6,3,7}; 
        System.out.println(findingMissingNum(nums));
    }
}
