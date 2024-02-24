import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class P18{

    public static ArrayList<Integer> intersection(int[] firstArray, int[] secArray){
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayL = new ArrayList<>();
            for(int i = 0; i < firstArray.length; i++){
                arrayL.clear();
                for(int j = 0; j < secArray.length; j++){
                    if(firstArray[i] == secArray[j]){
                        if(!arrayL.contains(firstArray[i])){
                            arrayList.add(firstArray[i]);
                            arrayL.add(firstArray[i]);
                        }
                        
                    }

                }
            }Collections.sort(arrayList);
            return arrayList;

            //2 3 6 7 9 11 <- 6
            //4 6 8 9 12 <- 5

    }
    public static void main(String args[]){
        int size1, size2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size for 1st Array: ");
        size1 = Integer.parseInt(in.nextLine());
        int[] firstArray = new int[size1];
        System.out.println("Enter an integer: ");
        for(int i = 0; i < size1; i++){
            int num = Integer.parseInt(in.nextLine());
            firstArray[i] = num;
        }
        System.out.print("Enter size for 2nd Array: ");
        size2 = Integer.parseInt(in.nextLine());
        int[] secArray = new int[size2];
        System.out.println("Enter an integer: ");
        for(int i = 0; i < size2; i++){
            int num = Integer.parseInt(in.nextLine());
            secArray[i] = num;
        }
        System.out.println(intersection(firstArray, secArray));
    }
}