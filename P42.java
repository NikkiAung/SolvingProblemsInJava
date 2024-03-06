//fidningFirstRepeatedCharcter
class P42 {
    public static char repeatedCharacter(String s) {
        int counter = 0;
        int index = 0;
        char[] strList = s.toCharArray();
        for(int i = 0; i < s.length(); i++){
            counter = 0;
            for(int j = i+1; j < s.length(); j++){
                if(strList[i] == strList[j]){
                    counter++;
                }if(counter == 1){
                    index = i;
                    break;
                }
            }
        }return strList[index];
    }

    public static void main(String args[]){
        String s = "abbcdde";
        System.out.println(repeatedCharacter(s));
    }
}