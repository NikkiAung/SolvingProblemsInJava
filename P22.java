import java.util.ArrayList;
import java.util.Arrays;

class P22{

    public static ArrayList<Integer> outputArray(int numEntries, int[] array){
        ArrayList<Integer> numArrayList = new ArrayList<>();
        for(int i = 0; i < numEntries; i++){
            numArrayList.add(array[i]);
        }
        return numArrayList;
    }

    public static void deleteNum(int[] arr, int index){
        for(int i = index; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
    }

    public static int[] removingEvenNum(int[] numArray){
        int numEntries = numArray.length;
        for(int i = 0; i < numEntries; i++){
            if(numArray[i] % 2 == 0){
                deleteNum(numArray, i);
                numEntries--;
                i--;
            }
        }
        return Arrays.copyOf(numArray, numEntries);
    }

    public static void main(String args[]){
        int[] inputArray = {3, 2, 4, 7, 10, 6, 5};
        int[] modifiedArray = removingEvenNum(inputArray);
        System.out.println(Arrays.toString(modifiedArray));
    }
}
