import java.util.Scanner;

class Tester1{

    public static boolean checkingPangram(String word){
        if(word.length() < 26){
            return false;
        }else{
            for(char i = 'a'; i < 'z'; i++){
                if(word.indexOf(i) < 0){
                    return false;
                }
            }return true;
        }
        
    }
    public static void main(String args[]){
        String word;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        word = in.nextLine();
        System.out.println(checkingPangram(word));
    }
}
/*
class Testing1{
    public static void main(String args[]){
        String word = "The quick brown fox jumps over the lazy dog";
        for(char i = 'a'; i < 'z'; i++){
            System.out.println(word.indexOf(i));
        }
    }
}
*/