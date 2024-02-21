/*
Aung Nanda Oo
This program is meant to check if user E-bicycle match with
the guidelines;PRICE,WEIGHT AND BATTERY.
*/

import java.util.Scanner;

public class Ex4 {

    public static void Ebicycle(int cost,int weigh, int wattHours) //This method is used to check if
                                                                   //user E-bicycle matches with guidelines
                                                                   //by obtaining the actual value from main method
                                                                   //& output in accordace with its condition
    {
        final int MAX_PRICE = 3000;
        final int MAX_WEIGHT = 60;
        final int MIN_BATTERY = 400;
        if (cost <= MAX_PRICE && weigh <= MAX_WEIGHT && wattHours >= MIN_BATTERY){
            System.out.println("That's a good one!");
        }if (cost > MAX_PRICE){
            System.out.println("Too expensive!");
        }if (wattHours < MIN_BATTERY){
            System.out.println("The battery is weak");
        }if (weigh > MAX_WEIGHT){
            System.out.println("Too heavy!");
        }
    }
    public static void main(String args[]) //This main method is used to input user 3 things
                                           //cost, weigh and wattHour & pass the values to 
                                           //Ebicycle method
    {
        int cost, weigh, wattHours;
        Scanner in = new Scanner(System.in);
        System.out.println("I'm going to help you choose an electric bicycle.");
        System.out.print("How much does it cost? ");
        cost = Integer.parseInt(in.nextLine());
        System.out.print("How much does it weigh in pounds? ");
        weigh = Integer.parseInt(in.nextLine());
        System.out.print("How many watt hours is the battery? ");
        wattHours = Integer.parseInt(in.nextLine());
        Ebicycle(cost,weigh,wattHours);


    }
    
}

/*
#1
I'm going to help you choose an electric bicycle.
How much does it cost? 2850
How much does it weigh in pounds? 55
How many watt hours is the battery? 400
That's a good one!

#2
I'm going to help you choose an electric bicycle.
How much does it cost? 3300
How much does it weigh in pounds? 50
How many watt hours is the battery? 450
Too expensive!

#3
I'm going to help you choose an electric bicycle.
How much does it cost? 2000
How much does it weigh in pounds? 75
How many watt hours is the battery? 300
The battery is weak
Too heavy!
*/