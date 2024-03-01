//Calculating How Many Dollars Will Cost Me For 4 kids, being shared equally depending on the numbers of apple given by neighborhood
//Note that 1 dollar per appple

//Apporaching the problems with two ways (same)(#1 & #2) and #3 with diff algorithm

//#1
class P35 {
    public static int apples(int n) {
        // Write code here
        boolean valid = false;
        while(!valid){
            if(n%4 == 0){
                return 0;
            }
            if(n/4 == 0){
                n++;
                valid = false;
            }else{
                valid = true;
            }
        }return 4-(n%4);
    }

    public static void main(String args[]){
        int n = 8;
        int cost = apples(n);
        System.out.println(cost);
    }
}


//#2
/*
class Tester1{
    public static int apple(int n){
        int remainder = n%4;
        int additionalApplesNeeded = (remainder == 0) ? 0 : 4 - remainder;
        return additionalApplesNeeded;
    }
    public static void main(String args[]){
        int n = 10;
        int cost = apple(n);
        System.out.println(cost);
    }
}
*/

//#3
/*
class Tester1{
    public static int apple(int n){
        int remainder = n%4;
        //(((double)(5+remainder)/4) * 4 == (double)6)
        if((((n+(double)remainder)/4)) * 4 == (n + (double)remainder)){
            return remainder;
        }else{
            int additionalApplesNeeded = (remainder == 0) ? 0 : 4 - remainder;
            return additionalApplesNeeded;
        }
        
    }
    public static void main(String args[]){
        int n = 10;
        int cost = apple(n);
        System.out.println(cost);
    }
}
*/