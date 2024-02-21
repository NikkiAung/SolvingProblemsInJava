import java.util.ArrayList;
import java.util.Collections;
class P12 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            array.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++){
            array.add(nums2[j]);
        }
        Collections.sort(array);
        int size = array.size();
        int left = 0;
        int right = size;
        double middle;
        if(size % 2 == 0){
            int a = (left+right)/2;
            int b = a - 1;
            middle = (array.get(a) + array.get(b))/(double)2;

        }else{
            middle = array.get((left+right)/2);
        }
        return middle;
        
        
        
    }

    public static void main(String args[]){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}