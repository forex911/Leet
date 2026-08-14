// Last updated: 8/14/2026, 10:44:26 AM
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int left=0;
        int ans=Integer.MIN_VALUE;
        Deque<Integer> maxq=new ArrayDeque<>();
        Deque<Integer> minq=new ArrayDeque<>();
        for(int right=0;right<nums.length;right++){
            while(!maxq.isEmpty() && nums[maxq.peekLast()]<nums[right]){
                maxq.pollLast();
            }
            while(!minq.isEmpty() && nums[minq.peekLast()]>nums[right]){
                minq.pollLast();
            }
            minq.offerLast(right);
            maxq.offerLast(right);
            while(nums[maxq.peekFirst()]-nums[minq.peekFirst()]>limit){
                if(maxq.peekFirst()==left){
                    maxq.pollFirst();
                }
                if(minq.peekFirst()==left){
                    minq.pollFirst();
                }
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}