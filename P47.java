//storing word per space to ArrList and printing out only odd worth val words
import java.util.ArrayList;
//#1
class P47{

    public static void displayingOddValWords(String str){
        ArrayList<String> wordsArr = new ArrayList<>();
        int start = 0;
        for(int i = 0; i < str.length(); i++){ //<-- if i <= str.length() will cause the error in line 10, which access index val not exist in str
                                               //but it's ok if you want to do like this #2 solu shown below
            if(str.charAt(i) == ' '){ 
                    wordsArr.add(str.substring(start, i));
                    start = i + 1;
            }else if(i == str.length()-1){
                    wordsArr.add(str.substring(start, i+1));
            }
            
        }System.out.println(wordsArr.toString());
        for(String words : wordsArr){
            if(words.length() % 2 != 0){
                System.out.println(words);
            }
        }

    }
    public static void main(String args[]){
        String str = "The sky is blue and vast";
        displayingOddValWords(str);
    }
}

//#2

class Tester1{

    public static void displayingOddValWords(String str){
        ArrayList<String> wordsArr = new ArrayList<>();
        int start = 0;
        for(int i = 0; i <= str.length(); i++){
            if(i == str.length() || str.charAt(i) == ' '){
                wordsArr.add(str.substring(start, i));
                start = i + 1;
            }
        }
        
        System.out.println(wordsArr.toString());
        for(String word : wordsArr){
            if(word.length() % 2 != 0){
                System.out.println(word);
            }
        }
    }

    public static void main(String args[]){
        String str = "The sky is blue and vast";
        displayingOddValWords(str);
    }
}

//#3
class Tester2{
    public static void main(String[] args) {
        String inputText = "The sky is blue and vast";
        String[] wordsArr = inputText.split(" ");
        for(String words : wordsArr){
            if(words.length() % 2 != 0){
                System.out.println(words);
            }
        }
    }
}