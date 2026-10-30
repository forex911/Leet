// Last updated: 10/30/2026, 3:03:18 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left=0;
4        int right=height.length-1;
5        int ans=0;
6        while(left<right){
7            int h=Math.min(height[left],height[right]);
8            int w=right-left;
9            ans=Math.max(ans,(h*w));
10            if(height[left]<height[right]){
11                left++;
12            }
13            else{
14                right--;
15            }
16        }
17        return ans;
18    }
19}