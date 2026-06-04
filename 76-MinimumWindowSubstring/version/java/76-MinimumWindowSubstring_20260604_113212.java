// Last updated: 6/4/2026, 11:32:12 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if(t.length()>s.length()){
4            return "";
5        }
6        int[] check=new int[128];
7        for(char c:t.toCharArray()){
8            check[c]++;
9        }
10        int needed=t.length();
11        int left=0,start=0,min=Integer.MAX_VALUE;
12        for(int right=0;right<s.length();right++){
13            char p=s.charAt(right);
14            if(check[p]-->0) needed--;
15            while(needed==0){
16                if(right-left+1<min){
17                    min=right-left+1;
18                    start=left;
19                }
20                char m=s.charAt(left++);
21                if(++check[m]>0) needed++;
22            }
23            
24            
25        }
26        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
27    }
28}