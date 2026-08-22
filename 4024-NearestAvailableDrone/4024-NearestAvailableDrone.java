// Last updated: 8/22/2026, 12:25:33 PM
1class Solution {
2    public int maximumGap(String s, String st) {
3        int n=s.length(),m=st.length();
4        int[] l=new int[n];
5        int[] r=new int[n];
6        int j=0;
7        for(int i=0;i<n;i++){
8            while(st.charAt(j)!=s.charAt(i)) j++;
9            l[i]=j++;
10        }
11        j=m-1;
12        for(int i=n-1;i>=0;i--){
13            while(st.charAt(j)!=s.charAt(i))j--;
14            r[i]=j--;
15        }
16        int ans=0;
17        for(int i=1;i<n;i++)ans=Math.max(ans,r[i]-l[i-1]);  
18        return ans;
19    }
20}