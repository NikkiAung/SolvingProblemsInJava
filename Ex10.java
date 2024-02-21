/* Aung Nanda Oo(Nikki)
   CS 111B Assignment 5: DeleteName
   Input the name user's looking for and delete it from the array
*/
import java.util.Scanner;

class Ex10 {
    public static void outputArray(String[] nameList, int numEntries) {
        System.out.println("Here are the remaining names:");
        for (int i = 0; i < numEntries; i++) {
            System.out.print(nameList[i] + " ");
        }
        System.out.println();
    }

    //this method is used to input a name user is looking for and call
    //the delete function to delete if it is equal to one of the elements from array
    public static void searchName(String[] nameList, int numAmount) {
        Scanner in = new Scanner(System.in);
        String userSearchingName;
        //int numEntries = numAmount;
        System.out.println("What name are you looking for?");
        userSearchingName = in.nextLine();
        boolean found = false;
        for (int i = 0; i < numAmount; i++) {
            if (nameList[i].equals(userSearchingName)) {
                deleteName(i, nameList);
                numAmount--;
                i--;
                found = true;
            }
        }
        if (!found) {
            System.out.println("Name not found");
        }
        outputArray(nameList, numAmount);
    }

    //This method is basically switching the element to the left so that the user input name will not exist
    
    public static void deleteName(int indexNumber, String[] nameList) {
        System.out.println("Removing " + nameList[indexNumber] + " from the array.");
        for (int i = indexNumber; i < nameList.length - 1; i++) {
            nameList[i] = nameList[i + 1];
        }
        
    }

    //This main method is used for inputting names from user and putting them into the array
    public static void main(String args[]) {
        int numAmount;
        String name;
        Scanner in = new Scanner(System.in);
        System.out.println("How many names do you want to enter?");
        numAmount = Integer.parseInt(in.nextLine());
        String[] nameList = new String[numAmount];
        for (int i = 0; i < nameList.length; i++) {
            System.out.print("Enter a name: ");
            name = in.nextLine();
            nameList[i] = name;
        }
        searchName(nameList, numAmount);
    }
}

/*

#1
How many names do you want to enter?
5
Enter a name: Aung
Enter a name: Aung
Enter a name: Alexa
Enter a name: David
Enter a name: Aung
What name are you looking for?
Aung
Removing Aung from the array.
Removing Aung from the array.
Removing Aung from the array.
Here are the remaining names:
Alexa David 

#2
How many names do you want to enter?
3
Enter a name: Aung
Enter a name: Nanda
Enter a name: Oo
What name are you looking for?
David
Name not found
Here are the remaining names:
Aung Nanda Oo 

*/