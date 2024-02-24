import java.util.Scanner;


class P17{
    public static char[] reverseWord(String word){
        //Set<Character> charSet = new LinkedHashSet<>();
        char[] strArray = word.toCharArray();
        int left = 0;
        int right = word.length()-1;
        char temp;
        while(left < right){
            temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;
            left ++;
            right --;
        }return strArray;
        
    }
    public static void main(String args[]){
        String word;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = in.nextLine();
        char[] res = reverseWord(word);
        for(char elemeString : res){
            System.out.print(Character.toUpperCase(elemeString));
        }System.out.println();

    }
}