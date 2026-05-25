// Last updated: 5/25/2026, 11:12:26 AM
class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int[] need=new int[256];
        int required=t.length();
        for(char c:t.toCharArray()){
            need[c]++;
        }
        int left=0,start=0,min=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char p=s.charAt(right);
            if(need[p]-->0) required--;
            while(required==0){
                if(right-left+1<min){
                    min=right-left+1;
                    start=left;
                }
            
            char m=s.charAt(left++);
            if(++need[m]>0) required++;}
        }
        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
    }

}