import java.util.Arrays;
import java.util.Scanner;

class P3{
    public static void main(String args[]) {
        int size;
        int target;
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount of storage for Array: ");
        size = Integer.parseInt(in.nextLine());
        int[] a = new int[size];
        System.out.println("Enter the number for Array: ");
        for (int i = 0; i < a.length; i++) {
            num = Integer.parseInt(in.nextLine());
            a[i] = num;
        }

        System.out.println(Arrays.toString(a));

        System.out.println("Enter the target number: ");
        target = in.nextInt();

        // Search for the target in the array
        boolean found = false;
        for(int i : a){
            if(i == target){
                found = true;
                break;
            }
        }

        // Print the result based on whether the target was found or not
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not found!");
        }
    }
}
