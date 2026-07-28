// Last updated: 7/28/2026, 3:19:51 PM
1class Solution {
2    public int numRescueBoats(int[] people, int limit) {
3        Arrays.sort(people);
4        int sum=0;
5        int ans=0;
6        int right=people.length-1;
7        int left=0;
8        while(left<=right){
9            sum=people[right]+people[left];
10            if(sum<=limit){
11                left++;
12                right--;
13            }
14            else{
15                right--;
16            }
17            ans++;
18        }
19        return ans;
20    }
21}