import java.util.ArrayList;

class P26 {

    public static ArrayList<Integer> findingfrequencyNums(int[] nums, int k) {
        int counter = 1; // Counter should start from 1, not 0
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                counter++;
            } else {
                counter = 1; // Reset counter if the current number is different from the next
            }
            if (counter == k) {
                arrList.add(nums[i]);
            }
        }
        // Check the last element if it forms a sequence of k elements
        return arrList;
    }

    public static void main(String args[]) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3};
        int k = 2;
        System.out.println(findingfrequencyNums(nums, k));
    }
}
