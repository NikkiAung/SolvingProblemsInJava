/* Aung Nanda Oo(Nikki)
   CS 111B Chapter 9 PosNumFromCommandline
   Input nums from commandline and calculate average
*/
class Main{

    //this method is used to find the average of the nums
    public static void avgDisplay(double[] nums){
        double total = 0;
        for(double element : nums){
            total += element;
        }System.out.println("and their average is: " + total/nums.length);
    }

    //this method is printing the numbers from the array
    public static void outputArray(double[] nums, int len){
        System.out.println("Here is your array of numbers :");
        System.out.print(nums[0]);
        for(int i = 1; i < len; i++){
            System.out.print(", " + nums[i]);
        }System.out.println();
    }

    //this main method is used to input nums from commandline and
    //looping until the length of args, and putting them into array
    //called positiveNums
    
    public static void main(String args[]){
        double[] positveNums;
        int len, count = 0;
        double num;
        if(args == null || args.length < 1){
            System.out.println("> java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* Main\n" + 
                                "usage: java Main 5 4 2 8\n" + 
                                "To average the numbers 5, 4, 2 and 8");
            return;
        }
        len = args.length;
        positveNums = new double[len];
        for(String arg : args){
            num = Double.parseDouble(arg);
            if(num > 0){
                positveNums[count] = num;
                count++;
            }
        }
        outputArray(positveNums, len);
        avgDisplay(positveNums);
    }
}

/*

#1
> java -classpath .:/run_dir/junit-4.12.jar:target/dependency/* Main
usage: java Main 5 4 2 8
To average the numbers 5, 4, 2 and 8

#2
> java Main 1.5 2 2.5 43.222 3
Here is your array of numbers:
1.5, 2.0, 2.5, 43.222, 3.0
and their average is: 10.4444

#3
> java Main 1 2 3 4
Here is your array of numbers:
1.0, 2.0, 3.0, 4.0
and their average is: 2.5

*/