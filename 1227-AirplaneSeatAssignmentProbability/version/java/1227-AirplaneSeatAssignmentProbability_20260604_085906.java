// Last updated: 6/4/2026, 8:59:06 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if(t.length()>s.length()) return "";
4        int[] need=new int[128];
5        int required=t.length();
6        for(char c:t.toCharArray()){
7            need[c]++;
8        }
9        int left=0,start=0,min=Integer.MAX_VALUE;
10        for(int right=0;right<s.length();right++){
11            char p=s.charAt(right);
12            if(need[p]-->0) required--;
13            while(required==0){
14                if(right-left+1<min){
15                    min=right-left+1;
16                    start=left;
17                }
18            
19            char m=s.charAt(left++);
20            if(++need[m]>0) required++;}
21        }
22        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
23    }
24
25}