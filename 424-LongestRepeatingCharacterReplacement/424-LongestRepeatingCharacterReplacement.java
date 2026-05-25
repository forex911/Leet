// Last updated: 5/25/2026, 11:09:55 AM
class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 0;
        for(char ch='A';ch<='Z';ch++){
            int left = 0;
            int count = 0;
            for(int right=0;right<s.length();right++){
                char temp = s.charAt(right);
                if(temp != ch) count++;
                while(count > k){
                    if(s.charAt(left) != ch) count--;
                    left++;
                }
            ans = Math.max(ans, right-left+1);
            }
        }
    return ans;
    }
}