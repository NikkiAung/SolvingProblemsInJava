//FindingPerfectSqaureByGivenTarget
class P21{
    public static boolean findingValidPerfectSquare(int[] numArray, int target){
        int left = 0;
        int right = numArray.length-1;
        
        while(left <= right){
            int middle = (left+right)/2;
            if((numArray[middle] * (numArray[middle])) == target){
                return true;
            }else if((numArray[middle] * (numArray[middle]))> target){
                right = middle - 1;
                
            }else if((numArray[middle] * (numArray[middle])) < target){
                left = middle + 1;
                
            }
        }return false;
    }
    public static void main(String args[]){
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 16;
        System.out.println(findingValidPerfectSquare(numArray, target));

    }

}
