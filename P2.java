import java.util.Arrays;
import java.util.Random;

class P2{

    public static int[] RandomArray(int size){
        Random rd = new Random();
        int[] a = new int[size];
        for(int i = 0;i<a.length;i++){
            a[i] = rd.nextInt(100);
        }return a;
    }

    public static int inRange(int[] b, int low, int high){
        int count = 0;
        for(int i = 0;i < b.length;i++){
            if(b[i] >= low && b[i] < high){
                count++;
            }
        }
        return count;

    }
    public static void main(String args[]){
        int[] scores = RandomArray(10);

        System.out.println(Arrays.toString(scores));

        int a = inRange(scores, 90, 100);
        int b = inRange(scores, 80, 90);
        int c = inRange(scores, 70, 80);
        int d = inRange(scores, 60, 70);
        int f = inRange(scores, 0, 60);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("F: " + f);

    }
}