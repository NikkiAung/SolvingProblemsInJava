class P40{

    public static char findTheDiff(String s, String t){
        char res = 0;
        for(int i = 0; i < s.length(); i++){
            res ^= s.charAt(i);
        }
        
        for(int i = 0; i < t.length(); i++){
            res ^= t.charAt(i);
        }

        return res;
    }
    public static void main(String args[]){
        String s = "abcde";
        String t = "abcdef";
        System.out.println(findTheDiff(s,t));
    }
}