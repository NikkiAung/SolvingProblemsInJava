import java.util.Scanner;

class P9{

  public static void deleteNumR(int deleteNumIndex, int[] arrayNum){
    for(int i = deleteNumIndex; i < arrayNum.length-1; i++){
      arrayNum[i] = arrayNum[i+1];
    }
  }
  public static void outputArray(int[] arrayNum, int numEntries){
    System.out.print(arrayNum[0]);
    for(int i = 1; i < numEntries; i++){
      System.out.print("," +arrayNum[i]);
    }System.out.println();
  }
  public static void main(String args[]){
    int numEntries, num, deleteNum;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the storage you want for array: ");
    numEntries = Integer.parseInt(in.nextLine());
    int[] arrayNum = new int[numEntries];
    for(int i = 0; i < arrayNum.length; i++){
      System.out.print("Enter an integer: ");
      num = Integer.parseInt(in.nextLine());
      arrayNum[i] = num;
    }
    outputArray(arrayNum,numEntries);
    
    System.out.println("Enter a number you want to delete: ");
    deleteNum = Integer.parseInt(in.nextLine());


    for(int i = 0; i < numEntries; i++){
      if(arrayNum[i] == deleteNum){
        deleteNumR(i,arrayNum);
        numEntries--;  
        
      }
    }
    outputArray(arrayNum, numEntries);
  }
}