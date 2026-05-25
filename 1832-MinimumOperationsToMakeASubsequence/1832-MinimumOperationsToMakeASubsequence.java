// Last updated: 5/25/2026, 11:07:52 AM
import java.util.*;

class Solution {
    public int minOperations(int[] target, int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < target.length; i++){
            map.put(target[i], i);
        }

        List<Integer> seq = new ArrayList<>();

        for(int num : arr){
            if(map.containsKey(num)){
                seq.add(map.get(num));
            }
        }

        int[] tails = new int[seq.size()];
        int size = 0;

        for(int num : seq){

            int left = 0;
            int right = size;

            while(left < right){
                int mid = (left + right) / 2;

                if(tails[mid] < num)
                    left = mid + 1;
                else
                    right = mid;
            }

            tails[left] = num;

            if(left == size)
                size++;
        }

        return target.length - size;
    }
}