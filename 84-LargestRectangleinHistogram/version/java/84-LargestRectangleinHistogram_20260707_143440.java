// Last updated: 7/7/2026, 2:34:40 PM
1class Solution {
2    public int trap(int[] height) {
3        int leftmax[]=new int[height.length];
4        int n=height.length;
5        int[] rightmax=new int[n];
6        int curmax=Integer.MIN_VALUE;
7        for(int i=0;i<n;i++){
8            if(curmax<height[i]){
9                curmax=height[i];
10            }
11            leftmax[i]=curmax;
12        }
13        curmax=Integer.MIN_VALUE;
14        for(int i=n-1;i>=0;i--){
15            if(curmax<height[i]){
16                curmax=height[i];
17            }
18            rightmax[i]=curmax;
19        }
20        int ans=0;
21        for(int i=0;i<n;i++){
22            ans+=Math.min(leftmax[i],rightmax[i])-height[i];
23        }
24        return ans;
25    }
26}