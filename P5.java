/* Programming Exercise for Assignment 3: Writing Methods, for CS 111B
   Written by Java - @author Aung Nanda Oo(Nikki)
   
   This is a small ATM machine program
*/
import java.util.Scanner;

class P5{
    private double totalBalance;

    public P5(double initialBalance){
        this.totalBalance = initialBalance;
    }

    //This method is used to print the choice statement
    public static void choice(){
        System.out.println("Enter 1 to see your balance ");
        System.out.println("Enter 2. to deposit money");
        System.out.println("Enter 3 to withdraw");
        System.out.println("Enter 4. to exist");

    }

    //This method is used to print the welcome statement, including choice option
    public static void bankStatement(){
        System.out.println("Welcome to Bank Of America.");
        System.out.println("Enter 1 to see your balance ");
        System.out.println("Enter 2. to deposit money");
        System.out.println("Enter 3 to withdraw");
        System.out.println("Enter 4. to exist");
    }

    //This method is used to deposit money from user, and added to totalBalance
    public double deposit(){
        Scanner in = new Scanner(System.in);
        double inMoney;
        System.out.print("Enter the amount of money you wanna put in: ");
        inMoney = in.nextDouble();
        return inMoney + totalBalance;
    }

    //This method is used to withdraw money from userAccount
    //if the amount withdraw is beyound the totalBalance,
    //then, the error message is printed
    public void withdraw(){
        Scanner in = new Scanner(System.in);
        double outMoney;
        System.out.print("Enter the amount of money you wanna withdraw in: ");
        outMoney = in.nextDouble();
        while(outMoney > totalBalance){
            System.out.println("Insufficient funds. Withdrawal failed.");
            System.out.print("Please re-enter the valid amount to withdraw: ");
            outMoney = in.nextDouble();
        }
        if(outMoney <= totalBalance){
            totalBalance -= outMoney;
        }
        

        
        
    }

    //This method is used to print Thanks letter, including
    //update letter to user email
    public static void sayingThanks(String email){
        System.out.println("Thank you for using Bank Of America");
        System.out.println("Don't forget to check your email " + email);
    }

    //This main method is validing userInput, and try to
    //output according to the calculation from above method

    public static void main(String args[]){
        P5 tester = new P5(875);
        int userChoice;
        bankStatement();
        boolean flag = true;

        while (flag){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            userChoice = in.nextInt();
            while (userChoice < 1 || userChoice > 4 ) {
                System.out.println("Choice is invalid. Please re-enter the choice!");
                choice();
                userChoice = in.nextInt();
            }
            if(userChoice == 1){
                System.out.println(tester.totalBalance);
                
            }else if(userChoice == 2){
                tester.totalBalance = tester.deposit();

            }else if(userChoice == 3){
                tester.withdraw();
            
                
            }else if(userChoice == 4){
                String email;
                flag = false;
                Scanner scan = new Scanner(System.in);
                System.out.print("Leave your email for further updates: ");
                email = scan.nextLine();
                sayingThanks(email);
                


            }
                
        }
    }
}


