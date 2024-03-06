//finding If the number is happy number -> final sum = 1
class P44{

    public static boolean isHappy(int n){
        int slow = n;
        int fast = n;
        do{
            slow = sumOfSquareUnit(slow);
            fast = sumOfSquareUnit(sumOfSquareUnit(fast));

        }while(slow != fast && slow != 1);
        return slow == 1;
    }

    public static int sumOfSquareUnit(int num){
        int sum = 0;
        while(num != 0){
            int d = num%10;
            sum += (d*d);
            num /= 10;
        }return sum;
    }
    public static void main(String args[]){
        int num = 19;
        System.out.println(isHappy(num));
    }
}