import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class P15 {
    public int lengthOfLongestSubString(String s) {
        int maxLength = 0;
        Set<Character> charSet = new LinkedHashSet<>();
        char[] inputArray = s.toCharArray();
        
        for (int i = 0; i < inputArray.length; i++) {
            charSet.clear();
            charSet.add(inputArray[i]);
            int length = 1;
            
            for (int j = i + 1; j < inputArray.length; j++) {
                if (!charSet.contains(inputArray[j])) {
                    charSet.add(inputArray[j]);
                    length++;
                } else {
                    break;
                }
            }
            
            maxLength = Math.max(maxLength, length);
        }
        
        return maxLength;
    }

    public static void main(String args[]) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = in.nextLine();
        P15 obj = new P15();
        System.out.println("Length of longest substring without repeating characters: " + obj.lengthOfLongestSubString(str));
    }
}
