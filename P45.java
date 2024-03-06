public class P45 {
    public static boolean isSubSequence(String s, String t){
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }

        }return i == s.length();

    }
    public static void main(String args[]){
        String s = "abcde";
        String t = "axbecfde";
        //String t = "axbcydze";
        System.out.println(isSubSequence(s, t));
    }
    
}
