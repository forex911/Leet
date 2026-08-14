// Last updated: 8/14/2026, 10:46:03 AM
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