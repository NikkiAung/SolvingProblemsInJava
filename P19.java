//FindingLongestPalidromeWordFrom UserInput(String)
import java.util.Scanner;

class P19{

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }return true;
    }
    public static String longestPalindrome(String s){
        int maxLength = 0;
        String longestPalindrome = "";
        if(s.length() == 1){
            longestPalindrome = s;
        }else{
            for(int i = 0; i < s.length(); i++){
                for(int j = i + 1; j <= s.length(); j++){
                    String subString = s.substring(i, j);
                    if(isPalindrome(subString) && subString.length() > maxLength){
                        maxLength = subString.length();
                        longestPalindrome = subString;
                }
            }

        }
        }return longestPalindrome;
        
    }
    public static void main(String args[]){
        String word;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        word = in.nextLine();
        System.out.println(longestPalindrome(word));
    }
}
