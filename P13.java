//UsingArrayListConceptToSolveTheLinkList(#leetcode) since I haven't learnt LinkList concept, 
//It was really fun tho, knowing that I can apply what I have to thing I haven't never seen or experienced before.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class P13{

    public static ArrayList<Integer> addTwoNumbers(ArrayList<Integer> l1, ArrayList<Integer> l2){
        int carry = 0;
        int conNum = 0;
        ArrayList<Integer> l3 = new ArrayList<>();
        if(l1.size() == l2.size()){
            for(int i = l1.size()-1; i > -1; i--){
                int res = carry;
                res = l1.get(i) + l2.get(i) + conNum;
                l3.add(res%10);
                carry = res / 10;
                if(carry > 0){
                    conNum = carry;
                }else{
                    conNum = 0;
                    
                }
            }
            
        }else if(l1.size() > l2.size()){
            int diff = l1.size() - l2.size();
            for(int j = 0; j < diff; j++){
                l2.add(j, 0);
            }//System.out.println(l2);
            for(int k = l1.size()-1; k > -1; k--){
                int res = carry;
                res = l1.get(k) + l2.get(k) + conNum;
                l3.add(res%10);
                carry = res / 10;
                if(carry > 0){
                    conNum = carry;
                }else{
                    conNum = 0;
                    
                }
            }if(carry > 0){
                l3.add(1);
            }
      
        }else{
            int diff = l2.size() - l1.size();
            for(int l = 0; l < diff; l++){
                l1.add(l,0);
            }//System.out.println(l1);
            for(int k = l1.size()-1; k > -1; k--){
                int res = carry;
                res = l1.get(k) + l2.get(k) + conNum;
                l3.add(res%10);
                carry = res / 10;
                if(carry > 0){
                    conNum = carry;
                }else{
                    conNum = 0;
                    
                }
            }if(carry > 0){
                l3.add(1);
            }
         
        }

        return l3;
    }

    public static void main(String args[]){
        int storage;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount for first arrayList: ");
        storage = Integer.parseInt(in.nextLine());
        for(int i = 0; i < storage; i++){
            System.out.print("Enter an Integer: ");
            int element = Integer.parseInt(in.nextLine());
            l1.add(element);
        }
        System.out.print("Enter the amount for second arrayList: ");
        storage = Integer.parseInt(in.nextLine());
        for(int i = 0; i < storage; i++){
            System.out.print("Enter an Integer: ");
            int element = Integer.parseInt(in.nextLine());
            l2.add(element);
        }

        System.out.println(addTwoNumbers(l1, l2));
    }
}
