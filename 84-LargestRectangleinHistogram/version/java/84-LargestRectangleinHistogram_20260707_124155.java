// Last updated: 7/7/2026, 12:41:55 PM
1class Solution {
2    public int trap(int[] height) {
3        int n=height.length;
4        int right=n-1;
5        int left=0;
6        int leftmax=0;
7        int rightmax=0;
8        int res=0;
9        while(left<=right){
10            if(height[left] <= height[right]){
11                if(leftmax<=height[left]){
12                    leftmax=height[left];
13                }
14                else{
15                    res+=leftmax-height[left];
16                }
17                left++;
18            }
19            else{
20                if(rightmax<=height[right]){
21                    rightmax=height[right];
22                }
23                else{
24                    res+=rightmax-height[right];
25                }
26                right--;
27            }
28        }
29        return res;
30    }
31}