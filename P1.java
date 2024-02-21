import java.util.Arrays;
import java.util.Scanner;

class P1{

    public static int display(double[] a,double target){
        for(int i=0;i<a.length;i++){
            if(a[i] ==  target){
                return i;           
            }
        }return -1;
        


    }
    public static void main(String args[]){
        double target;  
        //double[] a = {1,2,3,4,5};
        //double target = 3;
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter the storageSpace: ");
        int num = in.nextInt();
        double[] a = new double[num];
        
        System.out.println("Enter the numbers for array of "+num+" available: ");

        for (int i = 0;i<num;i++){
            a[i] = in.nextDouble();
        }
        a = Arrays.stream(a)
        .map(element->element*2).toArray();

        System.out.println("-----------");
        Arrays.stream(a).forEach(element -> System.out.println(element));

        

        System.out.print("Enter the targetNum: ");
        target = in.nextDouble();

        System.out.println(display(a, target));



            
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

class Tester1{

    public static void display(double[] a,double target){
        for(int i=0;i<a.length;i++){
            if(a[i] ==  target){
                //return i;
                System.out.println(a[i]);           
            }else {
                System.out.println("Not found");
            }break;
        }
        


    }
    public static void main(String args[]){
        double target;  
        //double[] a = {1,2,3,4,5};
        //double target = 3;
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter the storageSpace: ");
        int num = in.nextInt();
        double[] a = new double[num];
        
        System.out.println("Enter the numbers for array of "+num+" available: ");

        for (int i = 0;i<num;i++){
            a[i] = in.nextDouble();
        }
        a = Arrays.stream(a)
        .map(element->element*2).toArray();

        System.out.println("-----------");
        Arrays.stream(a).forEach(element -> System.out.println(element));

        

        System.out.print("Enter the targetNum: ");
        target = in.nextDouble();

        display(a, target);



            
    }
}
*/