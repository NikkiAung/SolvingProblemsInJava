import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P4 {
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    myArrayList.add(i);
                    myArrayList.add(j);
                }
            }
        }
        return myArrayList;
    }

    public static void main(String args[]) {
        int size, target;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of storage you want for Array: ");
        size = Integer.parseInt(in.nextLine());
        int[] array = new int[size];
        System.out.println("Enter the element for array: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Enter the target number: ");
        target = in.nextInt();

        ArrayList<Integer> result = twoSum(array, target);
        System.out.println(result);
    }
}
