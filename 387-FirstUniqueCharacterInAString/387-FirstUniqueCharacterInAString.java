// Last updated: 5/25/2026, 11:10:07 AM
import java .util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
                     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if (map.getOrDefault(s.charAt(i), 0) == 1) return i;

        }
        return -1;

    }
}