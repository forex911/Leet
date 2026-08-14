// Last updated: 8/14/2026, 10:41:28 AM
class Solution {
    public String smallestPalindrome(String s) {
        int[] nums=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            nums[ch-97]++;
        }
        char temp='0';
        String ans="";
        String rev="";
        for(int i=0;i<26;i++){
            if(nums[i]%2==1){
                temp=(char)(i+97);
                nums[i]--;
            }
            if(nums[i]==0) continue;
            int y=nums[i];
            y=y/2;
            char uu=(char)(i+97);
            String r="";
            r+=uu;
            r=r.repeat(y);
            ans+=r;
            rev=r+rev;
        }
        if(temp!='0'){
            ans+=temp;
        }
        return ans+rev;
    }
}