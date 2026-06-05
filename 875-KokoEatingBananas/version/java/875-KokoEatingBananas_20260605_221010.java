// Last updated: 6/5/2026, 10:10:10 PM
1public class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int left = 1;  
4        int right = Arrays.stream(piles).max().getAsInt();
5        int ans = right;
6
7        while (left <= right) {
8            int mid = left + (right - left) / 2;
9            if (canFinish(piles, h, mid)) {
10                ans = mid;     
11                right = mid - 1;
12            } else {
13                left = mid + 1; 
14            }
15        }
16        return ans;
17    }
18
19    public boolean canFinish(int[] piles, int h, int k) {
20        long hours = 0;
21        for (int pile : piles) {
22            hours += pile / k;
23            if (pile % k != 0) hours++;
24        }
25        return hours <= h;
26    }
27}