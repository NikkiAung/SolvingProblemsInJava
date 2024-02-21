/*
@ Aung Nanda Oo
This program requests the user of 3 inputs, which Muni-Ride, days, riders and finds
the average number of people, followed by formula riders/count & produce output.
*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) {
        String muniLine;
        int days, riders;
        double people;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the Muni Ridership Calculator");
        System.out.print("Which Muni line did you survey?  ");
        muniLine = in.nextLine();
        System.out.print("How many days did you survey ridership?  ");
        days = in.nextInt();
        System.out.print("How many riders did you count?  ");
        riders = in.nextInt();
        people = riders/(double) days;
        //System.out.println(people);
        System.out.printf("According to your survey, an average of %,.2f people\nrode the %s per day.\n", people, muniLine);
    }
}    

/* twoSampleOutput
Welcome to the Muni Ridership Calculator
Which Muni line did you survey?  K-Ingleside
How many days did you survey ridership?  5
How many riders did you count?  123456
According to your survey, an average of 24,691.20 people
rode the K-Ingleside per day.

Welcome to the Muni Ridership Calculator
Which Muni line did you survey?  N-Judah
How many days did you survey ridership?  30
How many riders did you count?  25000
According to your survey, an average of 833.33 people
rode the N-Judah per day.
*/
