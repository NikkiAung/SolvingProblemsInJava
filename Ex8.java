/* Aung Nanda Oo(Nikki)
   CS 111B Assignment 4
   Count Words and display longest word
*/
import java.util.Scanner;

public class Ex8
{
  public static void main(String[] args)
  {
    String phrase;
    int numWords;

    phrase = inputPhrase();

    numWords = analyzePhrase(phrase);

    System.out.println("Your phrase has " + numWords + " words in it.");
    System.out.println();
  }

  /**
    inputPhrase method
    Ask the user to input a phrase, and make sure it is at least 5 characters long.
    (Use a loop to make the user input a new phrase if it is too short.)
    @return the phrase
  */

//   INSERT YOUR CODE HERE
    public static String inputPhrase(){
        String userInput;
        int characAmount;    
        do{
            Scanner in =  new Scanner(System.in);
            System.out.println("Please enter a phrase all on one line, \n" +
                    "with just one space separating each word, \n" +
                    "and no spaces at the beginning or end of the phrase. ");
            userInput = in.nextLine();

            characAmount = 0;
            for(int i = 0; i < userInput.length(); i++){
                characAmount += i;
            }

        }while(characAmount <= 5);
        return userInput;
    } 
        

    
  /**
     analyzePhrase method
     Count the number of words in a given string, and determine its longest word.
     Assume the string is well formed and doesn't have leading 
     or trailing spaces, or multiple spaces in a row.
     Return the number of words.
     Output the longest word on the screen (console).
     @param str string to analyze
 * @return 
     @return number of words in str
  */

// INSERT YOUR CODE HERE
    public static int analyzePhrase(String phrase){
        int wordCount = 0;
        int charlongestWord = 0;
        String longestChar = "";
        int start = 0;
        int curretCharLen = 0;
        for(int i = 0; i < phrase.length(); i++){
            if((phrase.charAt(i) == ' ') || (i == phrase.length() - 1)){
                wordCount ++;
                if(phrase.charAt(i) == ' '){
                    curretCharLen = i - start;
                    if(curretCharLen  > charlongestWord){
                        charlongestWord = curretCharLen;
                        longestChar = phrase.substring(start, i);
                    } start = i + 1;
                    }
                    else{
                        curretCharLen = i + 1 - start;
                        if(curretCharLen  > charlongestWord){
                            charlongestWord = curretCharLen;
                            longestChar = phrase.substring(start, i+1);
                        }

                    }



                

            }
        }System.out.println("The longest word in your phrase is \"" + longestChar + "\" with " + charlongestWord + " characters");
        return wordCount;

        



    }
/* Hints:
To count words and determine their lengths, I recommend you use a for-loop to go 
through each character one at a time, using .charAt and then when you see a 
space ' ' count the word and set a variable to remember which character number 
that was, so you can calculate how long each word is. Use a variable for the 
longest word seen so far, and compare each word as you see it, to determine if 
it is longer than the longest word seen so far.  If so, update that to the 
longest word seen so far.  Don't forget about the final word, which doesn't 
end with a space.
*/

}

/* Sample Output:

Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
This is my phrase
The longest word in your phrase is "phrase" with 6 characters.
Your phrase has 4 words in it.


Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Hi
Your phrase must contain at least 5 characters.
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Bye
Your phrase must contain at least 5 characters.
Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Hello
The longest word in your phrase is "Hello" with 5 characters.
Your phrase has 1 words in it.


Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Now I will try with a very long phrase that contains many words
The longest word in your phrase is "contains" with 8 characters.
Your phrase has 13 words in it.


Please enter a phrase all on one line, 
with just one space separating each word, 
and no spaces at the beginning or end of the phrase.
Programming is cool
The longest word in your phrase is "Programming" with 11 characters.
Your phrase has 3 words in it.

*/
