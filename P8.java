import java.util.Scanner;

class P8 {

    public static int[] removingNum(int removeNum, int[] numArray) {
        int removeNumIndex = -1;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == removeNum) {
                removeNumIndex = i;
                break;
            }
        }
        if(removeNumIndex == -1){
            return numArray;
        }
        int[] newArray = new int[numArray.length - 1];
        for (int x = 0, y = 0; x < numArray.length; x++) {
            if (numArray[x] != removeNum) {
                newArray[y++] = numArray[x];
            }
        }
        return newArray;
    }

    public static void main(String args[]) {
        int storage;
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the storage for array: ");
        storage = Integer.parseInt(in.nextLine());
        int[] numArray = new int[storage];
        for (int i = 0; i < numArray.length; i++) {
            System.out.print("Enter an integer: ");
            num = Integer.parseInt(in.nextLine());
            numArray[i] = num;
        }
        System.out.println("Here are the numbers:");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i]);
            if (i < numArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\nEnter a number you want to remove: ");
        int removeNum = Integer.parseInt(in.nextLine());
        int[] res = removingNum(removeNum, numArray);
        System.out.println("After removal:");
        for (int element : res) {
            System.out.print(element + " ");
        }System.out.println();
    }
}
