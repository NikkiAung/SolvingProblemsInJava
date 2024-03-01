class P34{
    public static String removingVowelsFromString(int[] vowels, String word){
        //String newWord = "";
        StringBuilder newWord =  new StringBuilder();
        boolean isVowel;
        for(int j = 0; j < word.length(); j++){
            isVowel = false;
            for(int i = 0; i < vowels.length; i++){
                if(vowels[i] == word.charAt(j)){
                    isVowel = true;
                    break;
                }
            }if(!isVowel){
                newWord.append(word.charAt(j));
            }

        }return newWord.toString();
           
    }



    public static void main(String args[]){
        int[] vowels = {'a','e','i','o','u'};
        String word = "what is your name?";
        System.out.println(removingVowelsFromString(vowels, word));
    }
}

/*

import java.util.Scanner;
import java.util.Set;

class Tester1{

    public static String removingVowelsFromString(String word){
        Set<Character> vowels = Set.of('a','e','i','o','u'); //<-- set.of is immutable
        StringBuilder sb = new StringBuilder();
        char[] charcArr = word.toCharArray();
        for(Character charac : charcArr){
            if(!vowels.contains(charac)){
                sb.append(charac);

            }
        }return sb.toString();


    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = in.nextLine();
        System.out.println(removingVowelsFromString(word));
    }
}
*/