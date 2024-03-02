//#1 -> using HashMap concept to store the input data and update regarding to its rule
//#2 -> using Alphabetical rule and updates its position val by 1(magazine), then substract if looping with ransomNote positiion val > 0
//#3 -> Similar Concept with #1 apporach but with contract style, using map.put(ch, map.getOrDefault(ch,0)+1)


//#1
import java.util.HashMap;
import java.util.Map;
class P36{

    public static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }else{
                map.put(magazine.charAt(i), 1);
            }
        }
        int count = 0;
        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch) && map.get(ch) > 0){
                count++;
                map.put(ch, map.get(ch)-1);
            }else{
                break; //<-- can return false if u wish!
            }
        }if(count == ransomNote.length()){ //<-- if so, return true from here
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}

//#2
class Tester1{

    public static boolean canConstruct(String ransomNote, String magazine){
        int[] charCounts = new int[26];
        for(char c : magazine.toCharArray()){
            charCounts[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(!(charCounts[c-'a'] > 0)){
                return false;
            }else{
                charCounts[c-'a']--;
            }
        }return true;
    }
    public static void main(String args[]){
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}

//#3
class Tester2{

    public static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> map = new HashMap<>();
        char[] magazineList = magazine.toCharArray();
        for(char ch : magazineList){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        char[] ransomNoteList = ransomNote.toCharArray();
        int count = 0;
        for(char ch: ransomNoteList){
            if(map.containsKey(ch) && map.get(ch) > 0){
                count++;
                map.put(ch, map.get(ch)-1);
            }else{
                return false;

            }
        }return true;


    }
    public static void main(String args[]){
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
