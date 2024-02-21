import java.util.Scanner;

class P6{

    public static void rotateArray(int[] arrayList){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many times you want to rotate: ");
        int rotateTimes = Integer.parseInt(in.nextLine());
        for(int i  = 0; i <= rotateTimes; i++){
            int first = arrayList[0],j;
            for(j = 0; j < arrayList.length-1; j++){
                arrayList[j] = arrayList[j+1];


            }
            arrayList[j] = first;
        }
        for(int list : arrayList){
            System.out.print(list + " ");
        }

    }
    public static void main(String args[]){
        int arrayStorage,element;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the storage for array: ");
        arrayStorage = Integer.parseInt(in.nextLine());
        int[] arrayList = new int[arrayStorage];
        System.out.println("Enter the element for arrayList: ");
        for(int i = 0; i < arrayList.length; i++){
            element = Integer.parseInt(in.nextLine());
            arrayList[i] = element;
        }
        rotateArray(arrayList);

        
    }
}