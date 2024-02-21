import java.util.Scanner;

class P10{
    public static void main(String args[]){
        String str;
        int middle;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = in.nextLine();
        middle = (int) str.length()/2;
        boolean same = false;
        for(int i = 0, j = str.length()-1; i <= middle; i++){
            if(str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)){
                j--;
                same = false;
                
            }else{
                same = true;
            }
        }if(!same){
            System.out.println("The string Is Palindrome");
        }else{
            System.out.println("The string Is Not Palindrome");
        }

    }
}