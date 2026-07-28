// Last updated: 7/28/2026, 3:03:07 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int[] nums=new int[26];
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            nums[ch-97]++;
7        }
8        char temp='0';
9        String ans="";
10        String rev="";
11        for(int i=0;i<26;i++){
12            if(nums[i]%2==1){
13                temp=(char)(i+97);
14                nums[i]--;
15            }
16            if(nums[i]==0) continue;
17            int y=nums[i];
18            y=y/2;
19            char uu=(char)(i+97);
20            String r="";
21            r+=uu;
22            r=r.repeat(y);
23            ans+=r;
24            rev=r+rev;
25        }
26        if(temp!='0'){
27            ans+=temp;
28        }
29        return ans+rev;
30    }
31}