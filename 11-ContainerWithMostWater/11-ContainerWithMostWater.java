// Last updated: 5/25/2026, 11:13:35 AM
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length;
        int max=0;
        while(left<right){
            int h=Math.min(height[right-1],height[left]);
            int width=right-left-1;
            max=Math.max(max,h*width);
            if(height[left]<height[right-1]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}