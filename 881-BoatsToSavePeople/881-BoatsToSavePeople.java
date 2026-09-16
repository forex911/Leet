// Last updated: 9/16/2026, 2:05:49 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum=0;
        int ans=0;
        int right=people.length-1;
        int left=0;
        while(left<=right){
            sum=people[right]+people[left];
            if(sum<=limit){
                left++;
                right--;
            }
            else{
                right--;
            }
            ans++;
        }
        return ans;
    }
}