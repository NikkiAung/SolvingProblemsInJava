import java.util.ArrayList;

//#3
class P38{
    public static int findingNoRepeatingChar(String words) {
        //Set<Character> charSet = new LinkedHashSet<>();
        ArrayList<Character> arrList = new ArrayList<>();
        char[] str = words.toCharArray();
        
        for(int i = 0; i < str.length; i++){
            arrList.add(str[i]);
        }
        
        for(int i = 0; i < str.length; i++){
        int counter = 0;
            for(int j = 0; j < str.length; j++){
                if(str[i] == str[j]){
                    counter++;
                }
            }if(counter == 1){
                return i;
            }
        }return -1;

    }

    public static void main(String[] args) {
        String words = "codeforcode";
        System.out.println(findingNoRepeatingChar(words));
    }
}



//#2
/*
import java.util.HashMap;
import java.util.Map;

class Testing1 {

    public static int findingNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] strCharList = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < strCharList.length; i++){
            char ch = strCharList[i];
            if(map.get(ch) == 1){
                return i;
            }

        }

        return -1;
    }

    public static void main(String args[]) {
        String str = "codeforcode";
        int res = findingNonRepeatedCharacter(str);
        if(res != -1){
            System.out.println("The index of the first non-repeated character is: " + res);
        }else{
            System.out.println("No non-repeated character found.");
        }
    }
}
*/


//#3
/*
import java.util.HashMap;
import java.util.Map;

class Tester1 {

    public static int findingNonRepeatedCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        char[] strCharList = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                char nonRepeatedChar = entry.getKey();
                System.out.println(nonRepeatedChar);
                for (char c : strCharList) {
                    if (nonRepeatedChar == c) {
                        return str.indexOf(c);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String str = "codeforcode";
        int res = findingNonRepeatedCharacter(str);
        if(res != -1){
            System.out.println("The index of the first non-repeated character is: " + res);
        }else{
            System.out.println("No non-repeated character found.");
        }
    }
}
*/