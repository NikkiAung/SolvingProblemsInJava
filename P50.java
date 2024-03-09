//Using HashMap concept to count elements with maximum frequency #leetcode
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
class P50 {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }int maxF = Integer.MIN_VALUE;
        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxF){
                maxF = entry.getValue();
            }
        }int maxNum = 0;
        for(Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxF){
                maxNum += entry.getValue();
            }
        }return maxNum;
        
    }
}