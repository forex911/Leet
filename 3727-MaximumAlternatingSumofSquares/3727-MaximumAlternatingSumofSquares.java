// Last updated: 10/13/2026, 9:13:07 AM
1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        int n = nums.length;
4        for(int i = 0;i<n;i++ ){
5            if(nums[i]<0){
6                nums[i] = -1*nums[i];
7            }
8        }
9        Arrays.sort(nums);
10        long ns = 0;
11        for(int i =0;i<n/2;i++){
12            ns+= (long) (nums[i]*nums[i]); 
13        }
14        long ps =0;
15
16        for(int i =n/2;i<n;i++){
17            ps+= (long) (nums[i]*nums[i]); 
18        }
19
20       long ans = ps-ns;
21       return ans;
22    }
23}