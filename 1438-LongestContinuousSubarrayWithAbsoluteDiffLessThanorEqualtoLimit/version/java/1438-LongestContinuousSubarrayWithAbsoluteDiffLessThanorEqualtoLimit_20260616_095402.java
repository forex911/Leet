// Last updated: 6/16/2026, 9:54:02 AM
1class Solution {
2    public int longestSubarray(int[] nums, int limit) {
3        int left=0;
4        int ans=Integer.MIN_VALUE;
5        Deque<Integer> maxq=new ArrayDeque<>();
6        Deque<Integer> minq=new ArrayDeque<>();
7        for(int right=0;right<nums.length;right++){
8            while(!maxq.isEmpty() && nums[maxq.peekLast()]<nums[right]){
9                maxq.pollLast();
10            }
11            while(!minq.isEmpty() && nums[minq.peekLast()]>nums[right]){
12                minq.pollLast();
13            }
14            minq.offerLast(right);
15            maxq.offerLast(right);
16            while(nums[maxq.peekFirst()]-nums[minq.peekFirst()]>limit){
17                if(maxq.peekFirst()==left){
18                    maxq.pollFirst();
19                }
20                if(minq.peekFirst()==left){
21                    minq.pollFirst();
22                }
23                left++;
24            }
25            ans=Math.max(ans,right-left+1);
26        }
27        return ans;
28    }
29}