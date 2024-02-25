//finding Max & SecMax
class P24 {
    public static int findingMiniVal(int[] arr) {
        // Initialize miniVal to the maximum possible integer value
        int miniVal = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > miniVal) {
                secMax = miniVal;
                miniVal = arr[i];
            }else if(arr[i] > miniVal && arr[i] != miniVal){
                secMax = arr[i];
            }
        }System.out.println(miniVal);
        return secMax;
        
    }

    public static void main(String args[]) {
        int[] arr = {13, 34, 2, 35, 33, 1};
        System.out.println(findingMiniVal(arr));
    }
}
