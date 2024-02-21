/*Aung Nanda Oo
 * This Program is meant to input 3 integer number from user
 * and output the average of it.
 */

import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]){
        int a,b,c;
        int count = 3;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 integer grades, separated by spaces");
        a = in.nextInt(); b = in.nextInt(); c = in.nextInt();
        double res = (a+b+c)/(double)count;
        //System.out.println(res);
        System.out.printf("Their average is: %.1f\n", res);
    }
}
 
 /*2samplesOutput
 
 Please enter 3 integer grades, separated by spaces
 90
 91
 90
 Their average is: 90.3
 
 Please enter 3 integer grades, separated by spaces
 88
 80
 90
 Their average is: 86.0  
 
 */
 