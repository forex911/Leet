// Last updated: 7/28/2026, 3:18:58 PM
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
11                ans++;
12                left++;
13                right--;
14            }
15            else{
16                ans++;
17                right--;
18            }
19        }
20        return ans;
21    }
22}