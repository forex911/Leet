// Last updated: 5/25/2026, 11:13:44 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int result=Integer.MIN_VALUE;
        int left=0;
        Set tem=new HashSet<>();
        
        for(int right=0;right<s.length();right++){
            while(tem.contains(s.charAt(right))){
                tem.remove(s.charAt(left));
                left++;
            }
            tem.add(s.charAt(right));
            result=Math.max(result,right-left+1);
        }
        if(result==Integer.MAX_VALUE) return 0;
        return result;
    }
}