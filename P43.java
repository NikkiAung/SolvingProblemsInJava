//finding 1st repeated character
class P43{
    public static char repeatedCharacter(String s) {
        int index = -1;
        char[] strList = s.toCharArray();
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (strList[i] == strList[i + 1]) {
                index = i;
                break;
            }
        }
        
        return index == -1 ? '\u0000' : strList[index];
    }
    public static void main(String args[]){
        String s = "abbcdd";
        System.out.println(repeatedCharacter(s));

    }
}