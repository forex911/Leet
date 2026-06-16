// Last updated: 6/16/2026, 9:42:32 AM
1class Solution {
2    public int longestSubarray(int[] nums, int limit) {
3        int ans=Integer.MIN_VALUE;
4        int left =0;
5        Deque<Integer> maxq=new ArrayDeque<>();
6        Deque<Integer> minq=new ArrayDeque<>();
7        for(int right=0;right<nums.length;right++){
8            while(!maxq.isEmpty() && nums[maxq.peekLast()]<nums[right]){
9                maxq.pollLast();
10            }
11            while(!minq.isEmpty() && nums[minq.peekLast()]>nums[right]){
12                minq.pollLast();
13            }
14            maxq.offerLast(right);
15            minq.offerLast(right);
16            while(nums[maxq.peekFirst()]-nums[minq.peekFirst()]>limit){
17                
18                if(maxq.peekFirst()==left){
19                    maxq.pollFirst();
20                }
21                if(minq.peekFirst()==left){
22                    minq.pollFirst();
23                }
24                left++;
25            }
26            ans=Math.max(ans,right-left+1);
27        }
28        return ans;
29    }
30}