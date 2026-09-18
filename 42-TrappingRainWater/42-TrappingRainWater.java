// Last updated: 9/18/2026, 9:32:56 AM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int[] left=new int[n];
5        int[] right=new int[n];
6        int currmax=Integer.MIN_VALUE;
7        for(int i=0;i<n;i++){
8            currmax=Math.max(currmax,height[i]);
9            left[i]=currmax;
10        }
11        currmax=Integer.MIN_VALUE;
12        for(int i=n-1;i>=0;i--){
13            currmax=Math.max(currmax,height[i]);
14            right[i]=currmax;
15        }
16        int ans=0;
17        for(int i=0;i<n;i++){
18            ans+=Math.min(right[i],left[i])-height[i];
19        }
20        return ans;
21    }
22}