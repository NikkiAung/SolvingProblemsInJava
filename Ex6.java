/* Programming Exercise for Chapters 4-6: Days Out, for CS 111B
   Written by Java - @author Aung Nanda Oo(Nikki)
   
   Calculates the average number of days a company's employees are absent
*/
import java.util.Scanner;

class Ex6{

  public static double showAvgDaysMissed(int employees, int daysAbsent){
    double avgRes;
    avgRes = (double)daysAbsent/employees;
    System.out.printf("The average number of days missed per employee is %.1f \n", avgRes);
    return avgRes;
  } 
  
  //public static int totalAbsent;

//*******************************************************************
// Function getNumEmps. This function asks the user to enter        *
// the number of employees in the company. Validation is performed  *
// to verify at least one employee, the value entered is            *
// then returned to function main.                                  *
//*******************************************************************

  public static int getNumEmps(){
    int noEmployees;
    Scanner in = new Scanner(System.in);
    System.out.print("How many employees does the company have? ");
    noEmployees = Integer.parseInt(in.nextLine());
    while(noEmployees < 1){
      System.out.print("The number of employees must be one or greater. Please re-enter: ");
      noEmployees = Integer.parseInt(in.nextLine());
    }
    return noEmployees;
  }
//*******************************************************************
// Function daysMissed. Accepts as an argument the number of        *
// employees in the company. User is asked to enter the             *
// number of days missed by each employee. Validation performed to  *
// confirm negative number is not entered. The total days missed    *
// by all employees is returned.                                    *
//*******************************************************************

  public static int getDaysMissed(int nEmployees){
    
    int totalAbsent = 0;
    Scanner in = new Scanner(System.in);
    for(int i = 0;i < nEmployees;i++){
      System.out.print("Days missed by employee # "+(i+1)+" : ");
      int dayMissed = Integer.parseInt(in.nextLine());
      while(dayMissed < 0){
        System.out.print("Days missed must be zero or greater. Please re-enter: ");
        dayMissed = Integer.parseInt(in.nextLine());
        
        

      }
      totalAbsent += dayMissed;
      
      
    }
    return totalAbsent;
    
    
    
  }

  public static void main(String args[]){
    int employees, daysAbsent;
    employees =  getNumEmps();
    daysAbsent = getDaysMissed(employees);
    showAvgDaysMissed(employees, daysAbsent);
  }
}

/*
#1
How many employees does the company have? -3
The number of employees must be one or greater. Please re-enter: 0
The number of employees must be one or greater. Please re-enter: 3
Days missed by employee # 1 : 6
Days missed by employee # 2 : 10
Days missed by employee # 3 : 1
The average number of days missed per employee is 5.7 

#2
How many employees does the company have? 5
Days missed by employee # 1 : -5
Days missed must be zero or greater. Please re-enter: 0
Days missed by employee # 2 : -1
Days missed must be zero or greater. Please re-enter: -10
Days missed must be zero or greater. Please re-enter: 10
Days missed by employee # 3 : 20
Days missed by employee # 4 : 0
Days missed by employee # 5 : 5
The average number of days missed per employee is: 7.0 
*/