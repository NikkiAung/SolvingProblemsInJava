/* Programming Exercise for Chapters 7: Day, for NameArray CS 111B
   Written by Java - @author Aung Nanda Oo(Nikki)
   
   Reverse the name received and output the longest name
*/
import java.util.ArrayList;
import java.util.Scanner;

class Main{

    //This method is meant to find longest name from reverse order array
    public static void longestName(String[] res, int nameAmount){
        int highestLength = 0;
        String longestName = "";
        
        for(int i = 0; i < res.length; i++){
            if (res[i].length() > highestLength ){
                highestLength = res[i].length();
                longestName = res[i];
            }
        }
        System.out.println("Here is the longest name, with "+highestLength+ " characters:");
        System.out.println(longestName);
    }

    //This method is used to reverse the userInput names stored in the array
    public static ArrayList<String> reverseDisplay(String[] nameList){
        ArrayList<String> reverseList = new ArrayList<>();
        System.out.println("Here are the names you entered, in reverse order:");
        for(int j = (nameList.length-1); j > -1; j--){
            System.out.println(nameList[j]);
            reverseList.add(nameList[j]);

            
        }return reverseList;

    }
    //This main method is used to input names from user and passing the acutal value
    //to above methods
    public static void main(String args[]){
        int nameAmount;
        Scanner in = new Scanner(System.in);
        System.out.print("How many names do you want to enter? ");
        nameAmount = Integer.parseInt(in.nextLine());
        String[] nameList = new String[nameAmount];
        for(int i = 0; i < nameAmount; i++){
            String name;
            System.out.print("Enter a name: ");
            name = in.nextLine();
            nameList[i] = name;
        }
        ArrayList<String> res = reverseDisplay(nameList);
        String[] resArray = res.toArray(new String[0]);

        longestName(resArray, nameAmount);
        


    }
}
/*
#1
How many names do you want to enter? 3
Enter a name: Craig
Enter a name: Serafina
Enter a name: Tobias
Here are the names you entered, in reverse order:
Tobias
Serafina
Craig
Here is the longest name, with 8 characters:
Serafina

#2
Enter a name: Bob
Enter a name: Jane 
Enter a name: Chi Hua
Enter a name: Alfonso
Enter a name: Andre
Enter a name: Anna
Here are the names you entered, in reverse order:
Anna
Andre
Alfonso
Chi Hua
Jane
Bob
Here is the longest name, with 7 characters:
Alfonso
*/